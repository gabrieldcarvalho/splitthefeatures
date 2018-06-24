package com.splitthefeatures.rouletteapi.service;

import com.splitthefeatures.rouletteapi.dto.CouponDto;
import com.splitthefeatures.rouletteapi.dto.RouletteRequestDto;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
public interface RouletteService {
    CouponDto playRoulette(RouletteRequestDto rouletteRequest);
}
