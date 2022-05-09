package com.example.repository;

import com.example.entity.Seat;

import org.springframework.data.jpa.repository.JpaRepository;


public interface SeatRepo extends JpaRepository<Seat, Integer> {
}
