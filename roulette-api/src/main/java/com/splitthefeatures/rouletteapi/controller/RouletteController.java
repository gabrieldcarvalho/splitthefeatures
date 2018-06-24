package com.splitthefeatures.rouletteapi.controller;

import com.splitthefeatures.rouletteapi.dto.CouponDto;
import com.splitthefeatures.rouletteapi.dto.RouletteRequestDto;
import com.splitthefeatures.rouletteapi.service.RouletteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@RestController
public class RouletteController {

    private final RouletteService rouletteService;

    @Autowired
    public RouletteController(RouletteService rouletteService) {
        this.rouletteService = rouletteService;
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("api/v1/roulette/play")
    public CouponDto play(@RequestBody RouletteRequestDto request) {
        return rouletteService.playRoulette(request);
    }

}
