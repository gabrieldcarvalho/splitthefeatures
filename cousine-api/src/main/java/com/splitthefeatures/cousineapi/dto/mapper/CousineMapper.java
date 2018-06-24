package com.splitthefeatures.cousineapi.dto.mapper;
import org.mapstruct.Mapper;
import com.splitthefeatures.cousineapi.domain.Cousine;
import com.splitthefeatures.cousineapi.dto.CousineDto;

/**
 * Created by gabrieldcarvalho on 2018/06/24
 */
@Mapper(componentModel = "spring")
public interface CousineMapper {
    CousineDto toDto(final Cousine cousine);
}
