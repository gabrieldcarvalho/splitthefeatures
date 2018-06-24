package com.splitthefeatures.cousineapi.component;

import com.splitthefeatures.cousineapi.dto.RestaurantDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@FeignClient(value = "restaurant-api", path = "/api/v1/restaurants")
public interface RestaurantClient {
    @RequestMapping(method = RequestMethod.GET, value = "/search")
    List<RestaurantDto> getRestaurantsByCousineId(@RequestParam("cousineId") Long cousineId);
}
