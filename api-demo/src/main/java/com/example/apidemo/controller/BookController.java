package com.example.apidemo.controller;

import com.example.apidemo.model.Book;
import com.example.apidemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/book-controller")
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @CrossOrigin
    @GetMapping(value = "/all")
    public ResponseEntity<List<Book>> findAll() {
        return new ResponseEntity<>(bookService.findAll(), HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(value = "/{id}")
    public ResponseEntity<Book> findOne(@PathVariable Long id) {
        return new ResponseEntity<>(bookService.findOne(id), HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Book> delete(@PathVariable Long id) {
        return new ResponseEntity<>(bookService.delete(id), HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(value = "/")
    public ResponseEntity<Book> create(@RequestBody Book book) {
        return new ResponseEntity<>(bookService.create(book), HttpStatus.CREATED);
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public ResponseEntity<Book> update(@PathVariable Long id, @RequestBody Book newBookData) {
        return new ResponseEntity<>(bookService.update(id, newBookData), HttpStatus.OK);
    }
}
