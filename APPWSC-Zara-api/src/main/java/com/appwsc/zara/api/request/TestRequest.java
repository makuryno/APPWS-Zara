package com.appwsc.zara.api.request;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class TestRequest {

	@JsonProperty("START_DATE")
	private Timestamp startDate;
	
	@JsonProperty("PRODUCT_ID")
	private Long producId;
	
	@JsonProperty("BRAND_ID")
	private Integer brandId;
	
}
