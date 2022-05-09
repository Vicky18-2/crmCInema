
package com.example.entity;


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
    protected Hall hall;

    @ManyToOne
    protected Film film;

    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    public Date getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(Date sessionDate) {
        this.sessionDate = sessionDate;
    }

    public Time getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(Time sessionTime) {
        this.sessionTime = sessionTime;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Session() {
    }
}
