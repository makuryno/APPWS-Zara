package com.appwsc.zara.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appwsc.zara.api.dto.PriceDTO;
import com.appwsc.zara.api.request.TestRequest;
import com.appwsc.zara.api.service.ITestPriceService;
import com.appwsc.zara.model.mapper.IPriceMapper;
import com.appwsc.zara.model.repository.IPriceRepository;

@Service
public class TestPriceServiceImpl implements ITestPriceService{

	@Autowired
	private IPriceRepository repository;
	
	@Autowired
	private IPriceMapper mapper; 
	@Override
	public PriceDTO testPrice(TestRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
