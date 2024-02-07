package com.example.LibraryManagementSystem.model;

import com.example.LibraryManagementSystem.enums.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="book")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;

    @Enumerated(EnumType.STRING)
    Genre genre;

    @ManyToOne
    @JoinColumn
    Author author;
}
