package com.desuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desuperior.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
