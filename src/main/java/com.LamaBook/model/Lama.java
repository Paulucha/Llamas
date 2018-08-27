package com.LamaBook.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "LAMAS")
public class Lama {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "login")
//    @NotNull
    private String login;

    @Column(name = "password")
//    @NotNull
    private String password;

    @Column(name = "name")
//    @NotNull
    private String name;

    @Column(name = "date_of_birth")
//    @NotNull
    private LocalDate dateOfBirth;

    @Column(name = "pic")
    private String photoURL;

    @Column(name = "bio")
    private String bio;

    public boolean valid;

    public Lama() {
    }

    public Lama(String login, String password, String name, LocalDate dateOfBirth, String photoURL, String bio) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.photoURL = photoURL;
        this.bio = bio;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}