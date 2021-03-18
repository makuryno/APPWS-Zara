package com.appwsc.zara.model.mapper;

import org.mapstruct.Mapper;
import com.appwsc.zara.api.dto.PriceDTO;
import com.appwsc.zara.model.entity.Price;

@Mapper(componentModel = "spring")
public interface IPriceMapper {
	
	PriceDTO entityToDTO(Price entity);
}
