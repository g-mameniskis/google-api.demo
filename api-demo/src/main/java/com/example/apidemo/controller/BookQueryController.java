package com.example.apidemo.controller;

import com.example.apidemo.model.BookQuery;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/book-query-controller")
public class BookQueryController {
    private BookQueryService bookQueryService;

    public BookQueryController(BookQueryService bookQueryService) {
        this.bookQueryService = bookQueryService;
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookQuery> update(@PathVariable Long id, @RequestBody BookQuery newBookQueryData) {
        return new ResponseEntity<>(bookQueryService.update(id, newBookQueryData), HttpStatus.OK);
    }
}
