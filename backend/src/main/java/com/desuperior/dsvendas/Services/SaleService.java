package com.desuperior.dsvendas.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.desuperior.dsvendas.dto.SaleDTO;
import com.desuperior.dsvendas.dto.SalesSuccessDTO;
import com.desuperior.dsvendas.dto.SalesSumDTO;
import com.desuperior.dsvendas.entities.Sale;
import com.desuperior.dsvendas.repositories.SaleRepository;
import com.desuperior.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SalesSumDTO> amountGroupedBySeller() {
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SalesSuccessDTO> successGroupedBySeller() {
		return repository.successGroupedBySeller();
	}
}
