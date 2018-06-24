package com.splitthefeatures.rouletteapi.service.impl;

import com.splitthefeatures.rouletteapi.domain.Coupon;
import com.splitthefeatures.rouletteapi.dto.CouponDto;
import com.splitthefeatures.rouletteapi.dto.mapper.CouponMapper;
import com.splitthefeatures.rouletteapi.exception.NotFoundException;
import com.splitthefeatures.rouletteapi.exception.ValidationException;
import com.splitthefeatures.rouletteapi.repository.CouponRepository;
import com.splitthefeatures.rouletteapi.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@Service
public class CouponServiceImpl implements CouponService {

    private final CouponRepository couponRepository;
    private CouponMapper couponMapper;

    @Autowired
    public CouponServiceImpl(CouponRepository couponRepository,
                             CouponMapper couponMapper) {
        this.couponRepository = couponRepository;
        this.couponMapper = couponMapper;
    }

    @Override
    public CouponDto findActiveCouponByCustomer(String customer) {
        return this.couponRepository.findTopByCustomerAndUseDateIsNullAndExpirationDateAfter(customer, LocalDateTime.now())
                .map(couponMapper::toDto)
                .orElseThrow(() -> new NotFoundException("Active coupon not found for this customer"));
    }

    @Override
    public boolean hasActiveCouponByCustomer(String customer) {
        return this.couponRepository.findTopByCustomerAndUseDateIsNullAndExpirationDateAfter(customer, LocalDateTime.now())
                .isPresent();
    }

    @Override
    public List<CouponDto> findCouponsByCustomer(String customer) {
        return null;
    }

    @Override
    public CouponDto generateCoupon(String customer, Long restaurantId, Long activeDays) {
        if(this.hasActiveCouponByCustomer(customer)) {
            throw new ValidationException("Customer already has an active coupon");
        } else {
            Coupon coupon = new Coupon();
            coupon.setCustomer(customer);
            coupon.setDiscountPercentage(20.0);
            coupon.setExpirationDate(LocalDateTime.now().plusDays(activeDays));
            coupon.setRestaurantId(restaurantId);
            coupon = this.couponRepository.save(coupon);
            return couponMapper.toDto(coupon);
        }
    }

    @Override
    public void useCoupon(Long couponId) {
        Coupon coupon = this.couponRepository
                .findById(couponId)
                .orElseThrow(() -> new NotFoundException("Coupon not found"));
        if(coupon.getUseDate() != null) {
            coupon.setUseDate(LocalDateTime.now());
            this.couponRepository.save(coupon);
        }
    }


}
