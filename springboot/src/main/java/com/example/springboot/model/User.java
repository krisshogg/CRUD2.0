package com.example.springboot.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "springboot_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "question")
    private String question;

    @Column(name = "email")
    private String email;

}
