package com.splitthefeatures.rouletteapi.service.impl;

import com.splitthefeatures.rouletteapi.component.RestaurantClient;
import com.splitthefeatures.rouletteapi.dto.RestaurantDto;
import com.splitthefeatures.rouletteapi.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.splitthefeatures.rouletteapi.dto.CousineDto;
import com.splitthefeatures.rouletteapi.dto.mapper.CousineMapper;
import com.splitthefeatures.rouletteapi.repository.RouletteRepository;
import com.splitthefeatures.rouletteapi.service.RouletteService;

import java.util.List;
import java.util.stream.Collectors;

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
