package com.repository;

import com.entity.Seat;

import org.springframework.data.jpa.repository.JpaRepository;


public interface SeatRepo extends JpaRepository<Seat, Integer> {
}
