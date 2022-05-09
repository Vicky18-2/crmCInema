
package com.example.entity;


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

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmDirector() {
        return filmDirector;
    }

    public void setFilmDirector(String filmDirector) {
        this.filmDirector = filmDirector;
    }

    public Time getFilmDuration() {
        return filmDuration;
    }

    public void setFilmDuration(Time filmDuration) {
        this.filmDuration = filmDuration;
    }

    public String getFilmDescription() {
        return filmDescription;
    }

    public void setFilmDescription(String filmDescription) {
        this.filmDescription = filmDescription;
    }

    public Date getFilmYear() {
        return filmYear;
    }

    public void setFilmYear(Date filmYear) {
        this.filmYear = filmYear;
    }

    public List<Genre> getGenreList() {
        return genreList;
    }

    public void setGenreList(List<Genre> genreList) {
        this.genreList = genreList;
    }

    public Film() {
    }
}
