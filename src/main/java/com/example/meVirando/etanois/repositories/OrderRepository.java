package com.example.meVirando.etanois.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.meVirando.etanois.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
