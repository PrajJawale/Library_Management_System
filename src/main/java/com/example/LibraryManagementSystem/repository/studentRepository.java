package com.example.LibraryManagementSystem.repository;

import com.example.LibraryManagementSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepository extends JpaRepository<Student, Integer> {

}
