package com.example.apidemo.controller;

import com.example.apidemo.model.BookQuery;
import com.example.apidemo.utils.BookQueryFactoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/book-query-controller")
public class BookQueryController {
    private BookQueryFactoryService bookQueryService;

    public BookQueryController(BookQueryFactoryService bookQueryService) {
        this.bookQueryService = bookQueryService;
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookQuery> update(@PathVariable Long id, @RequestBody BookQuery newBookQueryData) {
        return new ResponseEntity<>(bookQueryService.update(id, newBookQueryData), HttpStatus.OK);
    }
}
