package com.example.LibraryManagementSystem.service.impl;

import com.example.LibraryManagementSystem.Dto.RequestDto.StudentrequestDto;
import com.example.LibraryManagementSystem.Dto.responseDtos.StudentResponseDto;
import com.example.LibraryManagementSystem.model.Author;
import com.example.LibraryManagementSystem.model.Book;
import com.example.LibraryManagementSystem.model.Student;
import com.example.LibraryManagementSystem.repository.authorRepository;
import com.example.LibraryManagementSystem.repository.bookRepository;
import com.example.LibraryManagementSystem.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class bookServiceimpl implements bookService {
    @Autowired
    authorRepository authorRepository;
    bookRepository bookrepository;

    public String addBook(Book book) throws Exception {
        Author author;
        try{
            author = authorRepository.findById(book.getAuthor().getId()).get();
        }
        catch (Exception e){
            throw new Exception("Author not present");
        }

        author.getBook().add(book);
        book.setAuthor(author);

        authorRepository.save(author);

        return "Book added";
    }

    public List<Book> getAllBook(){
        return bookrepository.findAll();
    }


//    public StudentResponseDto getStudentById(StudentrequestDto studentrequestDto){
//        Student student = studentrepository.
//    }

}
