package com.example.LibraryManagementSystem.repository;

import com.example.LibraryManagementSystem.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface authorRepository extends JpaRepository<Author,Integer> {

}
