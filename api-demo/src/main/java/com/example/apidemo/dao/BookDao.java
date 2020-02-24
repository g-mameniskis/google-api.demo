package com.example.apidemo.dao;

import com.example.apidemo.model.Book;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BookDao {

    int insertBook(String id, Book book);

    default int insertBook(Book book) {

        return insertBook(book);
    }

    List<Book> selectAllBooks();

    Optional<Book> selectBookById(String id);

    int deleteBookById(String id);

    int updateBookById(String id, Book book);
}
