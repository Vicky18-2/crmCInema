package com.example.entity;

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

    public int getIdSeat() {
        return idSeat;
    }

    public void setIdSeat(int idSeat) {
        this.idSeat = idSeat;
    }

    public float getSeatPrice() {
        return seatPrice;
    }

    public void setSeatPrice(float seatPrice) {
        this.seatPrice = seatPrice;
    }

    public ColumnCinema getColumnCinema() {
        return columnCinema;
    }

    public void setColumnCinema(ColumnCinema columnCinema) {
        this.columnCinema = columnCinema;
    }

    public Seat() {
    }
}
