package com.example.LibraryManagementSystem.service;

import com.example.LibraryManagementSystem.model.Book;

import java.util.List;
import java.util.Optional;

public interface bookService {
    public String addBook(Book book) throws Exception;

    public List<Book> getAllBook();

}
