package com.splitthefeatures.rouletteapi.service;

import com.splitthefeatures.rouletteapi.dto.CouponDto;

import java.util.List;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
public interface CouponService {
    CouponDto findActiveCouponByCustomer(String customer);
    boolean hasActiveCouponByCustomer(String customer);
    List<CouponDto> findCouponsByCustomer(String customer);
    CouponDto generateCoupon(String customer, Long restaurantId, Long activeDays);
    void useCoupon(Long couponId);
}
