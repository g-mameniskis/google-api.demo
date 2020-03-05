package com.example.apidemo.controller;

import com.example.apidemo.utils.BookQueryFactoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/book-query-controller")
public class BookQueryController {
    private BookQueryFactoryService bookQueryService;

    public BookQueryController(BookQueryFactoryService bookQueryService) {
        this.bookQueryService = bookQueryService;
    }
}
