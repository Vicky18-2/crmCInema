
package com.entity;


import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
public class Film {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int idFilm;

    @Column(length = 25, nullable = false)
    protected String filmName;

    @Column(length = 25, nullable = false)
    protected String filmDirector;

    @Column(nullable = false)
    protected Time filmDuration;

    @Column(length = 500, nullable = false)
    protected String filmDescription;

    @Column(nullable = false)
    protected Date filmYear;

    @ManyToMany
    protected List<Genre> genreList;


}
