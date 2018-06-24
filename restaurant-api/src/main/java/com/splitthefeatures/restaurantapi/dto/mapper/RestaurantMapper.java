package com.splitthefeatures.restaurantapi.dto.mapper;
import com.splitthefeatures.restaurantapi.domain.Restaurant;
import com.splitthefeatures.restaurantapi.dto.RestaurantDto;
import org.mapstruct.Mapper;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@Mapper(componentModel = "spring")
public interface RestaurantMapper {
    RestaurantDto toDto(final Restaurant restaurant);
}
