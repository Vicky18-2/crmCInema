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

    public int getIdColumn() {
        return idColumn;
    }

    public void setIdColumn(int idColumn) {
        this.idColumn = idColumn;
    }

    public float getColumnPrice() {
        return columnPrice;
    }

    public void setColumnPrice(float columnPrice) {
        this.columnPrice = columnPrice;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public ColumnCinema() {

    }
}
