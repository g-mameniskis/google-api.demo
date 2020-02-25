package com.example.apidemo.controller;

import com.example.apidemo.ApiDemoApplication;
import com.example.apidemo.model.Book;
import com.example.apidemo.model.BookQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BookController {

    private static final Logger log = LoggerFactory.getLogger(ApiDemoApplication.class);


    private List<Book> books = createList();

    private List<Book> createList() {
        return null;
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET, produces = "application/json")
    public BookQuery firstPage() {

        BookQuery bookQuery = new BookQuery();

        return bookQuery;
    }
}
