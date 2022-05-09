package com.example.entity;

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

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    public OrderCinema() {
    }
}
