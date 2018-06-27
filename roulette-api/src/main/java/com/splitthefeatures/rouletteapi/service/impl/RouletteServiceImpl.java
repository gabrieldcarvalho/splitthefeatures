package com.splitthefeatures.rouletteapi.service.impl;

import com.splitthefeatures.rouletteapi.component.RestaurantClient;
import com.splitthefeatures.rouletteapi.dto.CouponDto;
import com.splitthefeatures.rouletteapi.dto.RestaurantDto;
import com.splitthefeatures.rouletteapi.dto.RouletteRequestDto;
import com.splitthefeatures.rouletteapi.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${roulette.discount.min}")
    private double minDiscount;
    @Value("${roulette.discount.max}")
    private double maxDiscount;
    @Value("${roulette.discount.possibilities-for-max}")
    private double possibilitiesForMaxDiscount;

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
                calculateDiscount(restaurantDtos.size()),
                rouletteRequest.getActiveDays());
    }

    public double calculateDiscount(int possibleResults) {
        if(possibleResults >= possibilitiesForMaxDiscount) {
            return maxDiscount;
        }
        double discount = possibleResults * (maxDiscount / possibilitiesForMaxDiscount);
        if(discount < minDiscount) {
            return minDiscount;
        } else {
            return discount;
        }
    }
}
