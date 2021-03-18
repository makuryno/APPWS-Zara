package com.appwsc.zara.api.dto;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PriceDTO {

	@JsonProperty("BRAND_ID")
	private Integer branId;

	@JsonProperty("START_DATE")
	private Timestamp startDate;
	
	@JsonProperty("END_DATE")
	private Timestamp endDate;
	
	@JsonProperty("PRICE_LIST")
	private Integer priceList;
	
	@JsonProperty("PRODUCT_ID")
	private Long productId;
	
	@JsonProperty("PRIORITY")
	private Integer priority;
	
	@JsonProperty("PRICE")
	private Float price;
	
	@JsonProperty("CURR")
	private String curr;

}
