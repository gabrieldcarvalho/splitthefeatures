package com.splitthefeatures.restaurantapi.repository;

import com.splitthefeatures.restaurantapi.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

    Optional<Restaurant> findById(final Integer id);

    List<Restaurant> findAllByNameContainingIgnoreCase(String name);

    List<Restaurant> findByCousineId(Integer cousineId);

}
