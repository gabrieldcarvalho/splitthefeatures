package com.splitthefeatures.rouletteapi.service.impl;

import com.splitthefeatures.rouletteapi.component.RestaurantClient;
import com.splitthefeatures.rouletteapi.domain.Coupon;
import com.splitthefeatures.rouletteapi.dto.CouponDto;
import com.splitthefeatures.rouletteapi.dto.RestaurantDto;
import com.splitthefeatures.rouletteapi.dto.RouletteRequestDto;
import com.splitthefeatures.rouletteapi.exception.NotFoundException;
import com.splitthefeatures.rouletteapi.exception.ValidationException;
import com.splitthefeatures.rouletteapi.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.splitthefeatures.rouletteapi.service.RouletteService;

import java.util.List;
import java.util.Optional;
import java.util.Random;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@Service
public class RouletteServiceImpl implements RouletteService {
    private final RestaurantClient restaurantClient;
    private final CouponService couponService;

    @Autowired
    public RouletteServiceImpl(CouponService couponService,
                               final RestaurantClient restaurantClient) {
        this.restaurantClient = restaurantClient;
        this.couponService = couponService;
    }

    public CouponDto playRoulette(RouletteRequestDto rouletteRequest) {

        Random rand = new Random();

        List<RestaurantDto> restaurantDtos = restaurantClient
                .findAllRestaurants();

        RestaurantDto restaurantDto = restaurantDtos
                .stream()
                .filter(restaurant -> Optional
                        .ofNullable(rouletteRequest.getCousineId())
                        .map(cousineId -> cousineId.equals(restaurant.getCousineId()))
                        .orElse(true))
                .findFirst()
                .orElseThrow(() -> new NotFoundException("Can't find a restaurant with these filters"));

        return this.couponService.generateCoupon(rouletteRequest.getCustomer(),
                restaurantDto.getId(),
                rouletteRequest.getActiveDays());
    }
}
