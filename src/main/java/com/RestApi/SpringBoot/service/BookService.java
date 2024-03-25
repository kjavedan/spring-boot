package com.RestApi.SpringBoot.service;

import com.RestApi.SpringBoot.entity.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);

    List<Book> getBooks();

    Book getBook(Integer id);
}
