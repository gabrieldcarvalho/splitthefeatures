package com.splitthefeatures.rouletteapi.component;

import com.splitthefeatures.rouletteapi.dto.CousineDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@FeignClient(value = "cousine-api", path = "/api/v1/cousines")
public interface CousineClient {
    @RequestMapping(method = RequestMethod.GET, value = "/search")
    List<CousineDto> getRestaurantsByCousineId(@RequestParam("cousineId") Integer cousineId);
}
