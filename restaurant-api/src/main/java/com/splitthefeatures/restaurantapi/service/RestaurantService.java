package com.splitthefeatures.restaurantapi.service;

import com.splitthefeatures.restaurantapi.dto.RestaurantDto;

import java.util.List;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
public interface RestaurantService {

    List<RestaurantDto> findAll();
    RestaurantDto findById(Integer id);
    List<RestaurantDto> findByDescription(String description);
    List<RestaurantDto> findByCousineId(Integer cousineId);
}
