package com.splitthefeatures.cousineapi.service.impl;

import com.splitthefeatures.cousineapi.component.RestaurantClient;
import com.splitthefeatures.cousineapi.dto.RestaurantDto;
import com.splitthefeatures.cousineapi.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.splitthefeatures.cousineapi.dto.CousineDto;
import com.splitthefeatures.cousineapi.dto.mapper.CousineMapper;
import com.splitthefeatures.cousineapi.repository.CousineRepository;
import com.splitthefeatures.cousineapi.service.CousineService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@Service
public class CousineServiceImpl implements CousineService {

    private final CousineRepository cousineRepository;
    private final CousineMapper cousineMapper;
    private final RestaurantClient restaurantClient;

    @Autowired
    public CousineServiceImpl(final CousineRepository cousineRepository,
                              final CousineMapper cousineMapper,
                              final RestaurantClient restaurantClient) {
        this.cousineRepository = cousineRepository;
        this.cousineMapper = cousineMapper;
        this.restaurantClient = restaurantClient;
    }

    public List<CousineDto> findAll() {
        return this.cousineRepository
                .findAll()
                .stream()
                .map(cousineMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<CousineDto> findByDescription(String description) {
        return this.cousineRepository
                .findAllByDescriptionContainingIgnoreCase(description)
                .stream()
                .map(cousineMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<RestaurantDto> findRestaurantsByCousineId(Long cousineId) {
        return this.cousineRepository.findById(cousineId)
                .map(cousine -> this.restaurantClient.getRestaurantsByCousineId(cousine.getId()))
                .orElseThrow(() -> new NotFoundException("Cousine not found"));
    }
}
