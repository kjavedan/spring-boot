package com.RestApi.SpringBoot.service.impl;

import com.RestApi.SpringBoot.entity.Book;
import com.RestApi.SpringBoot.repository.BookRepository;
import com.RestApi.SpringBoot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public void addBook(Book book){
        bookRepository.save(book);
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBook(Integer id){
        Book book;
        book = bookRepository.findById(id).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid book id " + id));
        return book;
    }

}
