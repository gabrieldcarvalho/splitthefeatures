package com.splitthefeatures.cousineapi.service;

import com.splitthefeatures.cousineapi.dto.CousineDto;

import java.util.List;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
public interface CousineService {

    List<CousineDto> findAll();
    List<CousineDto> findByDescription(String description);
}
