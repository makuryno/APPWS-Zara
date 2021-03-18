package com.appwsc.zara.model.repository;

import java.sql.Timestamp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.appwsc.zara.model.entity.Price;

public interface IPriceRepository extends JpaRepository<Price, Integer> {
	
	@Query(value="SELECT BRAND_ID, START_DATE, END_DATE, PRICE_LIST, "
			+ "PRODUCT_ID, PRIORITY, PRICE, CURR "
			+ "FROM PRICES "
			+ "WHERE "
			+ "PRODUCT_ID = :producId AND "
			+ "BRAND_ID = :brandId AND "
			+ ":startDate BETWEEN START_DATE AND END_DATE" , nativeQuery = false)
	Price testPrice(@Param("startDate") Timestamp startDate, 
			@Param("producId") Long producId, @Param("brandId") Integer brandId);
	
}
