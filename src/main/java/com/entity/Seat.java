package com.entity;

import javax.persistence.*;

@Entity
public class Seat {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int idSeat;

    @Column(nullable = false)
    protected float seatPrice;

    @ManyToOne
    protected ColumnCinema columnCinema;
}
