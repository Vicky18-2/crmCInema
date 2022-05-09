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
}
