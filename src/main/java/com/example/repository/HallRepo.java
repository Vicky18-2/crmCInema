package com.example.repository;

import com.example.entity.Hall;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HallRepo extends JpaRepository<Hall, Integer> {
}
