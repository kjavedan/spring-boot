package com.RestApi.SpringBoot.repository;

import com.RestApi.SpringBoot.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
