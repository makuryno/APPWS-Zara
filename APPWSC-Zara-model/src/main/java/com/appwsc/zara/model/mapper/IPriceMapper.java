package com.appwsc.zara.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import com.appwsc.zara.api.dto.PriceDTO;
import com.appwsc.zara.model.entity.Price;

@Mapper
public interface IPriceMapper {
	
	List<PriceDTO> entitysToDTOs(List<Price> entity);
}
