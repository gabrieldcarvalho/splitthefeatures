package com.splitthefeatures.restaurantapi.controller;

import com.splitthefeatures.restaurantapi.dto.RestaurantDto;
import com.splitthefeatures.restaurantapi.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@RestController
public class RestaurantController {

    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("api/v1/restaurants")
    public List<RestaurantDto> findAll() {
        return restaurantService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("api/v1/restaurants/{restaurantId}")
    public RestaurantDto search(@PathVariable("restaurantId") @NotNull Integer restaurantId) {
        return restaurantService.findById(restaurantId);
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping("api/v1/restaurants/search/{query}")
    public List<RestaurantDto> search(@PathVariable("query") @NotNull String description) {
        return restaurantService.findByDescription(description);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("api/v1/restaurants/search")
    public List<RestaurantDto> searchByCousineId(@RequestParam("cousineId") @NotNull Integer cousineId) {
        return restaurantService.findByCousineId(cousineId);
    }

}
