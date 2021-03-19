package com.appwsc.zara.model.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.appwsc.zara.model.entity.Price;

public interface IPriceRepository extends JpaRepository<Price, Integer> {
	
	@Query(value="SELECT p.BRAND_ID, p.START_DATE, p.END_DATE, p.PRICE_LIST, "
			+ "p.PRODUCT_ID, p.PRIORITY, p.PRICE, p.CURR "
			+ "FROM PRICE p "
			+ "WHERE "
			+ "p.PRODUCT_ID = :producId AND "
			+ "p.BRAND_ID = :brandId AND "
			+ ":startDate BETWEEN p.START_DATE AND p.END_DATE" , nativeQuery = true)
	List<Price> testPrice(@Param("startDate") Timestamp startDate, 
			@Param("producId") Long producId, @Param("brandId") Integer brandId);
	
}
