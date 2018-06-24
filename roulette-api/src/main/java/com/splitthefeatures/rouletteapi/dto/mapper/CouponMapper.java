package com.splitthefeatures.rouletteapi.dto.mapper;
import com.splitthefeatures.rouletteapi.domain.Coupon;
import com.splitthefeatures.rouletteapi.dto.CouponDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.time.LocalDateTime;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@Mapper(componentModel = "spring")
public abstract class CouponMapper {

    @Mappings(value = {
        @Mapping(target = "status", expression = "java(convertCouponStatus(coupon.getUseDate(), coupon.getExpirationDate()))")
    })
    public abstract CouponDto toDto(final Coupon coupon);

    public CouponDto.CouponStatusEnum convertCouponStatus(LocalDateTime useDate, LocalDateTime expirationDate) {
        if(useDate != null) {
            return CouponDto.CouponStatusEnum.USED;
        } else if(LocalDateTime.now().isAfter(expirationDate)) {
            return CouponDto.CouponStatusEnum.EXPIRED;
        } else {
            return CouponDto.CouponStatusEnum.AVAILABLE;
        }
    }

}
