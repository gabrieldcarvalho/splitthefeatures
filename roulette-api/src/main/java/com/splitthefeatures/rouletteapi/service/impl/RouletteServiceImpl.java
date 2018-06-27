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
import java.util.stream.Collectors;

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

        List<RestaurantDto> restaurantDtos = restaurantClient
                .findAllRestaurants()
                .stream()
                .filter(restaurant -> Optional
                        .ofNullable(rouletteRequest.getCousineId())
                        .map(cousineId -> cousineId.equals(restaurant.getCousineId()))
                        .orElse(true))
                .collect(Collectors.toList());

        RestaurantDto randomRestaurant = restaurantDtos.get(new Random().nextInt(restaurantDtos.size()));

        return this.couponService.generateCoupon(rouletteRequest.getCustomer(),
                randomRestaurant.getId(),
                rouletteRequest.getActiveDays());
    }
}
