package com.appwsc.zara.ws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.appwsc.zara.api.dto.PriceDTO;
import com.appwsc.zara.api.request.TestRequest;
import com.appwsc.zara.api.service.ITestPriceService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.POST})
public class TestPriceController {

	@Autowired
	private ITestPriceService service;
	
	@PostMapping("/test")
	public ResponseEntity<PriceDTO> test(@RequestBody TestRequest request) {
		PriceDTO result = new PriceDTO();
		try {			
			service.testPrice(request);
		} catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
        }
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
