package com.splitthefeatures.rouletteapi.service;

import com.splitthefeatures.rouletteapi.domain.Coupon;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
public interface CouponService {
    Coupon findActiveCouponByCustomer(String customer);
    Coupon findCouponsByCustomer(String customer);
    void generateCoupon(String customer, Long restaurantId, Integer activeDays);
    void useCoupon(Coupon coupon);
}
