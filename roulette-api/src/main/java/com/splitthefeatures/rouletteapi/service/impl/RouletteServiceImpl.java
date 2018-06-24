package com.splitthefeatures.rouletteapi.service.impl;

import com.splitthefeatures.rouletteapi.component.RestaurantClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.splitthefeatures.rouletteapi.service.RouletteService;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@Service
public class RouletteServiceImpl implements RouletteService {
    private final RestaurantClient restaurantClient;

    @Autowired
    public RouletteServiceImpl(final RestaurantClient restaurantClient) {
        this.restaurantClient = restaurantClient;
    }
}
