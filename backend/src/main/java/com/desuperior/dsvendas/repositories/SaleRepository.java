package com.desuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desuperior.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
