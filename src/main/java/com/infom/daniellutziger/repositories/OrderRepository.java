package com.infom.daniellutziger.repositories;

import com.infom.daniellutziger.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
