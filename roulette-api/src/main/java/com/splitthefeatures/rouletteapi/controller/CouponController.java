package com.splitthefeatures.rouletteapi.controller;

import com.splitthefeatures.rouletteapi.dto.CouponDto;
import com.splitthefeatures.rouletteapi.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@RestController
public class CouponController {

    private final CouponService couponService;

    @Autowired
    public CouponController(CouponService couponService) {
        this.couponService = couponService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("api/v1/coupons/search")
    public List<CouponDto> findCouponsByCustomer(@RequestParam("customer") @NotNull String customer) {
        return couponService.findCouponsByCustomer(customer);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("api/v1/coupons/active/search")
    public CouponDto findActiveCoupon(@RequestParam("customer") @NotNull String customer) {
        return couponService.findActiveCouponByCustomer(customer);
    }

}
