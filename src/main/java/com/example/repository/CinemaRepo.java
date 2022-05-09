package com.example.repository;

import com.example.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepo extends JpaRepository<Cinema, Integer> {
}
