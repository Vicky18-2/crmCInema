
package com.entity;


import javax.persistence.*;

@Entity
public class Ticket {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int idTicket;

    @ManyToOne
    protected Session session;

    @ManyToOne
    protected Seat seat;

    @Column(nullable=false)
    protected boolean ticketStatus;

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public boolean isTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(boolean ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public Ticket() {
    }
}
