package com.example.apidemo.controller;

import com.example.apidemo.utils.BookQueryFactoryService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/book-query-controller")
public class BookQueryController {
    private BookQueryFactoryService bookQueryService;

    public BookQueryController(BookQueryFactoryService bookQueryService) {
        this.bookQueryService = bookQueryService;
    }
}
