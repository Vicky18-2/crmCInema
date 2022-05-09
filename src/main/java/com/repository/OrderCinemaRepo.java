package com.repository;

import com.entity.OrderCinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderCinemaRepo extends JpaRepository<OrderCinema, Integer> {
}
