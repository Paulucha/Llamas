package com.LamaBook.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.net.URL;
import java.time.LocalDate;

@Entity
@Table(name = "LAMAS")
public class Lamas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "login")
    @NotNull
    private String login;

    @Column(name = "password")
    @NotNull
    private String password;

    @Column(name = "date_of_birth")
    @NotNull
    private LocalDate dateOfBirth;

    @Column(name = "pic")
    private String photoURL;

    @Column(name = "bio")
    private String bio;

}
