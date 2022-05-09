
package com.example.entity;

import javax.persistence.*;

@Entity
public class Hall {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int idHall;

    @Column(length = 20, nullable = false)
    protected String hallName;

    @ManyToOne
    protected Cinema cinema;

    public int getIdHall() {
        return idHall;
    }

    public void setIdHall(int idHall) {
        this.idHall = idHall;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Hall(){

    }
}
