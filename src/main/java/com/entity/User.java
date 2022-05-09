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

    public int getIdUser() {
        return idUser;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public String getUserMiddlename() {
        return userMiddlename;
    }

    public int getUserAge() {
        return userAge;
    }

    public String getUserCity() {
        return userCity;
    }

    public String getUserGender() {
        return userGender;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public void setUserMiddlename(String userMiddlename) {
        this.userMiddlename = userMiddlename;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public User() {
    }
}
