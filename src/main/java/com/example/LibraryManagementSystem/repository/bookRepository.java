package com.example.LibraryManagementSystem.repository;

import com.example.LibraryManagementSystem.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bookRepository extends JpaRepository<Book,Integer> {
}
