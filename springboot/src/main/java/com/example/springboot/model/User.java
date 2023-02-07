package com.example.springboot.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "springboot_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String name;


    private String question;


    private String email;

    public User(){

    }

    public User(String name, String question, String email) {
        this.name = name;
        this.question = question;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + question + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
