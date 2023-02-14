package com.example.LMSProject.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String countary;
    private double rating;


    @OneToMany(mappedBy = "author" , cascade = CascadeType.ALL)
    private List<Book> booksWriiten;

    public Author(){
        booksWriiten=new ArrayList<>();

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountary() {
        return countary;
    }

    public void setCountary(String countary) {
        this.countary = countary;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<Book> getBooksWriiten() {
        return booksWriiten;
    }

    public void setBooksWriiten(List<Book> booksWriiten) {
        this.booksWriiten = booksWriiten;
    }
}
