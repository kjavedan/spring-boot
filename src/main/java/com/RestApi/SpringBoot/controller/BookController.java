package com.RestApi.SpringBoot.controller;

import com.RestApi.SpringBoot.entity.Book;
import com.RestApi.SpringBoot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/add")
    public String addBook(@RequestBody Book book){
        bookService.addBook(book);

        return "Book added successfully";
    }

    @GetMapping("/list")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @GetMapping("/get")
    public Book getBook(Integer id){
        return bookService.getBook(id);
    }

}
