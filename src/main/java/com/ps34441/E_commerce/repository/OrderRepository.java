package com.ps34441.E_commerce.repository;

import com.ps34441.E_commerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
