package com.example.apidemo.service;

import com.example.apidemo.dao.BookRepository;
import com.example.apidemo.model.Book;
import com.example.apidemo.utils.BookQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private BookQueryFactory factory;
    private BookRepository repository;

    @Autowired
    public BookService(BookRepository repository) {
        this.factory = new BookQueryFactory();
        this.repository = repository;
    }

    public Book addBook(Book book) {
        return repository.save(book);
    }

    public List<Book> findAll() {
        Iterable<Book> bookIterable = repository.findAll();
        List<Book> result = new ArrayList<>();
        bookIterable.forEach(result::add);
        return result;
    }

    public Book findOne(Long id) {
        return repository.findById(id).get();
    }

    public Book delete(Long id) {
        Book bookToBeDeleted = findOne(id);
        repository.delete(bookToBeDeleted);
        return bookToBeDeleted;
    }

    public Book create(Book book) {
        return repository.save(book);
    }

    public Book update(Long id, Book newBookData) {
        Book bookToBeUpdated = findOne(id);
        bookToBeUpdated.setAccessInfo(newBookData.getAccessInfo());
        bookToBeUpdated.setEtag(newBookData.getEtag());
        bookToBeUpdated.setKind(newBookData.getKind());
        bookToBeUpdated.setSaleInfo(newBookData.getSaleInfo());
        bookToBeUpdated.setSearchInfo(newBookData.getSearchInfo());
        bookToBeUpdated.setSelfLink(newBookData.getSelfLink());
        bookToBeUpdated.setVolumeInfo(newBookData.getVolumeInfo());
        repository.save(bookToBeUpdated);
        return bookToBeUpdated;
    }
}
