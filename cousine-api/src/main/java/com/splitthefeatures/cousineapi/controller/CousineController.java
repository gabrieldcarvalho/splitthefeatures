package com.splitthefeatures.cousineapi.controller;

import com.splitthefeatures.cousineapi.dto.RestaurantDto;
import com.splitthefeatures.cousineapi.service.CousineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.splitthefeatures.cousineapi.dto.CousineDto;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@RestController
public class CousineController {

    private final CousineService cousineService;

    @Autowired
    public CousineController(CousineService cousineService) {
        this.cousineService = cousineService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("api/v1/cousines")
    public List<CousineDto> findAll() {
        return cousineService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("api/v1/cousines/search/{query}")
    public List<CousineDto> search(@PathVariable("query") @NotNull String description) {
        return cousineService.findByDescription(description);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("api/v1/cousines/{cousineId}/restaurants")
    public List<RestaurantDto> searchRestaurantsByCousineId(@PathVariable("cousineId") @NotNull Long cousineId) {
        return cousineService.findRestaurantsByCousineId(cousineId);
    }

}
