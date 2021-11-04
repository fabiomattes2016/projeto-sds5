package com.desuperior.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.desuperior.dsvendas.dto.SalesSuccessDTO;
import com.desuperior.dsvendas.dto.SalesSumDTO;
import com.desuperior.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	@Query("SELECT new com.desuperior.dsvendas.dto.SalesSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale as obj GROUP BY obj.seller")
	List<SalesSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.desuperior.dsvendas.dto.SalesSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale as obj GROUP BY obj.seller")
	List<SalesSuccessDTO> successGroupedBySeller();
}
