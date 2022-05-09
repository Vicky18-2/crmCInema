
package com.entity;


import javax.persistence.*;

@Entity
public class Ticket {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int idTicket;

    @ManyToOne
    protected Session session;

    @ManyToOne
    protected Seat seat;

    @Column(nullable=false)
    protected boolean ticketStatus;


}
