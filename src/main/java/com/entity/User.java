package com.entity;


import javax.persistence.*;

@Entity
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int idUser;

    @Column(length=25, nullable=false)
    protected String userName;

    @Column(length=25, nullable=false)
    protected String userSurname;

    @Column(length=25, nullable=false)
    protected String userMiddlename;

    @Column(nullable=false)
    protected int userAge;

    @Column(length=20, nullable=false)
    protected String userCity;

    @Column(length=1, nullable=false)
    protected String userGender;

    @Column(length=30, unique = true, nullable=false)
    protected String userEmail;
}
