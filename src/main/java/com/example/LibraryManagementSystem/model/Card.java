package com.example.LibraryManagementSystem.model;

import com.example.LibraryManagementSystem.enums.CardStatus;
import com.example.LibraryManagementSystem.enums.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

import java.util.Enumeration;

@Entity
@Table(name="card")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Card {
    @Id  //Declare as the Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Increment ID particular table Uniqly
    private int id ;

    @CreationTimestamp
    private Date issueDate;

    @Enumerated(EnumType.STRING)
    private CardStatus cardStatus;


    private String validTill;


    @OneToOne    //First one is for current class And  Second for Parent class
    @JoinColumn  //to join the card column with the student
    Student student ;

}
