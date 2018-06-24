package com.splitthefeatures.rouletteapi.dto.mapper;
import com.splitthefeatures.rouletteapi.domain.Coupon;
import com.splitthefeatures.rouletteapi.dto.CouponDto;
import org.mapstruct.Mapper;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@Mapper(componentModel = "spring")
public interface CouponMapper {
    CouponDto toDto(final Coupon coupon);
}
