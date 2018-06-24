package com.splitthefeatures.rouletteapi.dto.mapper;
import com.splitthefeatures.rouletteapi.domain.Coupon;
import org.mapstruct.Mapper;
import com.splitthefeatures.rouletteapi.dto.CousineDto;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@Mapper(componentModel = "spring")
public interface CousineMapper {
    CousineDto toDto(final Coupon coupon);
}
