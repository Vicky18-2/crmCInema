
package com.entity;


import javax.persistence.*;

@Entity
public class Genre {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int idGenre;

    @Column(length= 20, nullable = false)
    protected String genreName;

}
