package com.appwsc.zara.model.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appwsc.zara.api.dto.PriceDTO;
import com.appwsc.zara.api.request.TestRequest;
import com.appwsc.zara.api.service.ITestPriceService;
import com.appwsc.zara.model.mapper.IPriceMapper;
import com.appwsc.zara.model.repository.IPriceRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TestPriceServiceImpl implements ITestPriceService{

	@Autowired
	private IPriceRepository repository;
	
	@Autowired
	private IPriceMapper mapper; 
	
	@Override
	public List<PriceDTO> testPrice(TestRequest request) {
		List<PriceDTO> result = new ArrayList<PriceDTO>();
		try {
			Timestamp startDate =  new Timestamp(request.getStartDate().getTime());
			result= mapper.entitysToDTOs(repository.testPrice(startDate,
					request.getProducId(), request.getBrandId()));
		} catch (Exception e) {
			log.error("Failed {}", e);
		}
		return result;
	}
}
