
package com.example.entity;


import javax.persistence.*;

@Entity
public class Genre {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int idGenre;

    @Column(length= 20, nullable = false)
    protected String genreName;

    public int getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(int idGenre) {
        this.idGenre = idGenre;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public Genre() {
    }
}
