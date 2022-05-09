
package com.entity;

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


}
