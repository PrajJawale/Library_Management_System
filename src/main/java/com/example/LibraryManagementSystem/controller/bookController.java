package com.example.LibraryManagementSystem.controller;

import com.example.LibraryManagementSystem.model.Book;
import com.example.LibraryManagementSystem.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/book")
public class bookController {
    @Autowired
    bookService bookService;

    @PostMapping("/add")
    public String addBook(@RequestBody Book book) throws Exception {

        return bookService.addBook(book);
    }

    //Find All the book
    @GetMapping("/getAllBook")
    public List<Book> getAllBook(){
        return bookService.getAllBook();
    }


}
