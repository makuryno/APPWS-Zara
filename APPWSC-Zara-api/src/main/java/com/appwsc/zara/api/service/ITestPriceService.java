package com.appwsc.zara.api.service;

import com.appwsc.zara.api.dto.PriceDTO;
import com.appwsc.zara.api.request.TestRequest;

public interface ITestPriceService {

	PriceDTO testPrice(TestRequest request);
}
