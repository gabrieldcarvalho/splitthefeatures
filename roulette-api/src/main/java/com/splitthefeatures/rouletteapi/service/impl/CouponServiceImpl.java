package com.splitthefeatures.rouletteapi.service.impl;

import com.splitthefeatures.rouletteapi.domain.Coupon;
import com.splitthefeatures.rouletteapi.service.CouponService;
import org.springframework.stereotype.Service;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@Service
public class CouponServiceImpl implements CouponService {

    @Override
    public Coupon findActiveCouponByCustomer(String customer) {
        return null;
    }

    @Override
    public Coupon findCouponsByCustomer(String customer) {
        return null;
    }

    @Override
    public void generateCoupon(String customer, Long restaurantId, Integer activeDays) {

    }

    @Override
    public void useCoupon(Coupon coupon) {

    }
}
