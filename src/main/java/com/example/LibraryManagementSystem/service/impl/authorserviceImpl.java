package com.example.LibraryManagementSystem.service.impl;

import com.example.LibraryManagementSystem.model.Author;
import com.example.LibraryManagementSystem.repository.authorRepository;
import com.example.LibraryManagementSystem.service.authorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class authorserviceImpl implements authorService {
    @Autowired
    authorRepository authorRepo ;
    public String addAuthor(Author author){
        authorRepo.save(author);
        return "Author added Successfully";
    }

}
