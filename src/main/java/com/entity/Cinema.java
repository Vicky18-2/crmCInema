package com.entity;

import javax.persistence.*;

@Entity
public class Cinema {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int idCinema;

    @Column(length=20, nullable = false)
    protected String cinemaName;

    @Column(length=20, nullable = false)
    protected String cinemaCity;

    @Column(length=20, nullable = false)
    protected String cinemaStreet;

    public int getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(int idCinema) {
        this.idCinema = idCinema;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getCinemaCity() {
        return cinemaCity;
    }

    public void setCinemaCity(String cinemaCity) {
        this.cinemaCity = cinemaCity;
    }

    public String getCinemaStreet() {
        return cinemaStreet;
    }

    public void setCinemaStreet(String cinemaStreet) {
        this.cinemaStreet = cinemaStreet;
    }

    public Cinema() {
    }
}
