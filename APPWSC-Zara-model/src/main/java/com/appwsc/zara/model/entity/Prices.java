package com.appwsc.zara.model.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="PRICES")
public class Prices {
	
	@Id
	@Column(name="BRAND_ID")
	private Integer branId;

	@Column(name="START_DATE")
	private Timestamp startDate;
	
	@Column(name="END_DATE")
	private Timestamp endDate;
	
	@Column(name="PRICE_LIST")
	private Integer priceList;
	
	@Column(name="PRODUCT_ID")
	private Long productId;
	
	@Column(name="PRIORITY")
	private Integer priority;
	
	@Column(name="PRICE")
	private Float price;
	
	@Column(name="CURR")
	private String curr;
	
}
