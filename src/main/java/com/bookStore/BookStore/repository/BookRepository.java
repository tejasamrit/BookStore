package com.bookStore.BookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStore.BookStore.entity.Book;
import com.bookStore.BookStore.service.BookService;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	void save(BookService b);

}
