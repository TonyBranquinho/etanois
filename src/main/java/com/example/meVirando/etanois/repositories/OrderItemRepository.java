package com.example.meVirando.etanois.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.meVirando.etanois.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
