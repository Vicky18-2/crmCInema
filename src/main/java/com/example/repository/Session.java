package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;


public interface Session extends JpaRepository<com.example.entity.Session, Integer> {
}
