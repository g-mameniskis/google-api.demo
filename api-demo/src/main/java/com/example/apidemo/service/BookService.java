package com.example.apidemo.service;

import com.example.apidemo.dao.BookDao;
import com.example.apidemo.model.Book;

public class BookService {

    private final BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public int addBook(Book book) {
        return bookDao.insertBook(book);
    }
}
