package com.appwsc.zara.api.service;

import java.util.List;

import com.appwsc.zara.api.dto.PriceDTO;
import com.appwsc.zara.api.request.TestRequest;

public interface ITestPriceService {

	List<PriceDTO> testPrice(TestRequest request);
}
