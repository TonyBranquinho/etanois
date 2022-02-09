package com.example.meVirando.etanois.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.meVirando.etanois.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
