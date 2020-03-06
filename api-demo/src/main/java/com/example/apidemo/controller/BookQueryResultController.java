package com.example.apidemo.controller;

import com.example.apidemo.model.BookQueryResult;
import com.example.apidemo.service.BookQueryResultService;
import com.example.apidemo.model.BookQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/book-query-result-controller")
public class BookQueryResultController {
    private BookQueryResultService service;

    @Autowired
    public BookQueryResultController(BookQueryResultService service) {
        this.service = service;
    }

    
    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findOne(@PathVariable Long id) {
        return new ResponseEntity<>(service.findOne(id), HttpStatus.OK);
    }

    
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }

    
    @PostMapping(value = "/")
    public ResponseEntity<BookQueryResult> create(@RequestBody BookQuery query) {
        BookQueryResult result = service.saveBookQueryResult(query);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
