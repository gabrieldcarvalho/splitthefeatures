package com.splitthefeatures.cousineapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.splitthefeatures.cousineapi.dto.CousineDto;
import com.splitthefeatures.cousineapi.dto.mapper.CousineMapper;
import com.splitthefeatures.cousineapi.repository.CousineRepository;
import com.splitthefeatures.cousineapi.service.CousineService;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@Service
public class CousineServiceImpl implements CousineService {

    final CousineRepository cousineRepository;
    final CousineMapper cousineMapper;

    @Autowired
    public CousineServiceImpl(final CousineRepository cousineRepository,
                              final CousineMapper cousineMapper) {
        this.cousineRepository = cousineRepository;
        this.cousineMapper = cousineMapper;
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
}
