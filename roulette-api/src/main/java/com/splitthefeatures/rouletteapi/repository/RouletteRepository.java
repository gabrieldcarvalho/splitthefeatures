package com.splitthefeatures.rouletteapi.repository;

import com.splitthefeatures.rouletteapi.domain.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
public interface RouletteRepository extends JpaRepository<Coupon, Integer> {

    Optional<Coupon> findById(final Integer id);

}
