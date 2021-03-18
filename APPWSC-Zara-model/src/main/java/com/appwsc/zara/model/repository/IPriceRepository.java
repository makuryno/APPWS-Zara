package com.appwsc.zara.model.repository;

import java.sql.Timestamp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.appwsc.zara.model.entity.Price;

public interface IPriceRepository extends JpaRepository<Price, Integer> {

	Price testPrice(@Param("startDate") Timestamp startDate, 
			@Param("producId") Long producId, @Param("brandId") Integer brandId);
}
