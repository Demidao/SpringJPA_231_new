package com.demidao.models;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    @NotEmpty(message = "NAME must not be empty")
    private String name;

    @Column(name = "lastname")
    @NotEmpty(message = "SURNAME must not be empty")
    private String lastname;

    @Column(name = "age")
    private int age;

    @Column(name = "email")
    @NotEmpty(message = "EMAIL must not be empty")
    @Email(message = "EMAIL must not be valid")
    private String email;


    public User() {
    }

    public User(String name, String surname, int age, String email) {
        this.name = name;
        this.lastname = surname;
        this.age = age;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String surname) {
        this.lastname = surname;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
                ", surname='" + lastname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
