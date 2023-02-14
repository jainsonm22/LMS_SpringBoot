package com.example.LMSProject.Models;

import com.example.LMSProject.Enums.CardStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @CreationTimestamp
    Date creation;
    @UpdateTimestamp
    Date updatedOn;

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    //Card is child wrt  to Sudent
    @OneToOne
    @JoinColumn
    Student studentVaribleName;

    //card is parent wrt to Book
    @OneToMany(mappedBy = "card" , cascade = CascadeType.ALL)
    List<Book> booksIssued;

    public Card(){
        super();
        booksIssued=new ArrayList<>();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    public Student getStudentVaribleName() {
        return studentVaribleName;
    }

    public void setStudentVaribleName(Student studentVaribleName) {
        this.studentVaribleName = studentVaribleName;
    }

    public List<Book> getBook() {
        return booksIssued;
    }

    public void setBook(List<Book> booksIssued) {
        this.booksIssued = booksIssued;
    }
}
