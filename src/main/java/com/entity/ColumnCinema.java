package com.entity;

import javax.persistence.*;

@Entity
public class ColumnCinema {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int idColumn;

    @Column(nullable = false)
    protected float columnPrice;

    @ManyToOne
    protected Hall hall;

}
