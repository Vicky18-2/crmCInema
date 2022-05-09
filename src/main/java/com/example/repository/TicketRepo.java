package com.example.repository;

import com.example.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TicketRepo extends JpaRepository<Ticket, Integer> {
}
