package com.example.apidemo.service;

import com.example.apidemo.dao.BookQueryRepository;
import com.example.apidemo.model.BookQuery;
import com.example.apidemo.model.BookQueryResult;
import com.example.apidemo.utils.BookQueryFactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookQueryService {
    private BookQueryRepository bookQueryRepository;
    private BookQueryFactoryService factory;

    @Autowired
    public BookQueryService(BookQueryFactoryService factory, BookQueryRepository bookQueryRepository) {
        this.bookQueryRepository = bookQueryRepository;
        this.factory = factory;
    }

    public BookQuery create(BookQuery bookQuery) {
        return bookQueryRepository.save(bookQuery);
    }

    public BookQuery update(Long id, BookQuery newBookQueryData) {
        BookQuery bookQueryToBeUpdated = findOne(id);
        bookQueryToBeUpdated.setApiKey(newBookQueryData.getApiKey());
        bookQueryToBeUpdated.setDomain(newBookQueryData.getDomain());
        bookQueryToBeUpdated.setSearchCategory(newBookQueryData.getSearchCategory());
        bookQueryToBeUpdated.setSearchTopic(newBookQueryData.getSearchTopic());
        bookQueryToBeUpdated.setSearchTopicValue(newBookQueryData.getSearchTopicValue());
        bookQueryRepository.save(bookQueryToBeUpdated);
        return bookQueryToBeUpdated;
    }

    public BookQuery delete(Long id) {
        BookQuery bookQuery = findOne(id);
        bookQueryRepository.delete(bookQuery);
        return bookQuery;
    }

    public BookQuery findOne(Long id) {
        return bookQueryRepository.findById(id).get();
    }
}
