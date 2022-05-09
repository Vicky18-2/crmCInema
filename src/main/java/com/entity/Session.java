
package com.entity;


import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Session {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int idSession;

    @Column(nullable = false)
    protected Date sessionDate;

    @Column(nullable = false)
    protected Time sessionTime;

    @ManyToOne
    private Hall hall;

    @ManyToOne
    private Film film;


}
