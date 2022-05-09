package com.example.repository;

import com.example.entity.OrderCinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderCinemaRepo extends JpaRepository<OrderCinema, Integer> {
}
