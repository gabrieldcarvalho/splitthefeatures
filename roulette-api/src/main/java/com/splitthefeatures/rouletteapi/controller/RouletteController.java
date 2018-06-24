package com.splitthefeatures.rouletteapi.controller;

import com.splitthefeatures.rouletteapi.dto.CousineDto;
import com.splitthefeatures.rouletteapi.service.RouletteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

}
