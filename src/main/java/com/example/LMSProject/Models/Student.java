package com.example.LMSProject.Models;

import jakarta.persistence.*;

@Entity
@Table (name="student")
public class Student{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id ;

private String name;
@Column(unique=true)
private String email;

private int age;
private String mobNo;
private String country;

@OneToOne(mappedBy = "studentVaribleName" ,cascade = CascadeType.ALL)
private  Card card;
    public Student() {
        super();
    }

    public Student(int id, String name, String email, int age, String mobNo, String country) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.mobNo = mobNo;
        this.country = country;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}






