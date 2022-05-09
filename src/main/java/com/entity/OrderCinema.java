package com.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class OrderCinema {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int idOrder;

    @ManyToOne
    protected User user;

    @ManyToMany
    protected List<Ticket> ticketList;

}
