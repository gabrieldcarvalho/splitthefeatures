package com.splitthefeatures.restaurantapi.service.impl;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.splitthefeatures.restaurantapi.dto.RestaurantDto;
import com.splitthefeatures.restaurantapi.dto.mapper.RestaurantMapper;
import com.splitthefeatures.restaurantapi.exception.NotFoundException;
import com.splitthefeatures.restaurantapi.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.splitthefeatures.restaurantapi.repository.RestaurantRepository;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@Service
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;
    private final RestaurantMapper restaurantMapper;

    @Autowired
    public RestaurantServiceImpl(final RestaurantRepository restaurantRepository,
                            final RestaurantMapper restaurantMapper) {
        this.restaurantRepository = restaurantRepository;
        this.restaurantMapper = restaurantMapper;
    }

    public List<RestaurantDto> findAll() {
        return this.restaurantRepository
                .findAll()
                .stream()
                .map(restaurantMapper::toDto)
                .collect(Collectors.toList());
    }

    public RestaurantDto findById(Long id) {
        return this.restaurantRepository
                .findById(id)
                .map(restaurantMapper::toDto)
                .orElseThrow(() -> new NotFoundException("Restaurant not found"));
    }

    public List<RestaurantDto> findByDescription(String description) {
        return this.restaurantRepository
                .findAllByNameContainingIgnoreCase(description)
                .stream()
                .map(restaurantMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<RestaurantDto> findByCousineId(Long cousineId) {
        return this.restaurantRepository
                .findByCousineId(cousineId)
                .stream()
                .map(restaurantMapper::toDto)
                .collect(Collectors.toList());
    }

}
