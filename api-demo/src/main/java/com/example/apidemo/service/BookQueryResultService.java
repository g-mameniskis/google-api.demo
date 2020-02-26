package com.example.apidemo.service;

import com.example.apidemo.dao.BookQueryResultRepository;
import com.example.apidemo.model.BookQueryResult;
import com.example.apidemo.utils.BookQuery;
import com.example.apidemo.utils.BookQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookQueryResultService {
    private BookQueryResultRepository repository;

    @Autowired
    public BookQueryResultService(BookQueryResultRepository repository) {
        this.repository = repository;
    }

    public BookQueryResult saveBookQueryResult(BookQuery query) {
        return saveBookQueryResult(
                query.getSearchCategory(),
                query.getSearchTerm(),
                query.getSearchTopic(),
                query.getSearchTopic());
    }

    public BookQueryResult saveBookQueryResult(String searchCategory, String searchTerm, String searchTopic, String searchTopicValue) {
        BookQueryFactory bookQueryFactory = new BookQueryFactory(); // hardcode api key?
        BookQueryResult result = bookQueryFactory.search(searchCategory, searchTerm, searchTopic, searchTopicValue);
        repository.save(result);
        return result;
    }

    public BookQueryResult findOne(Long id) {
        return repository.findById(id).get();
    }

    public BookQueryResult delete(Long id) {
        BookQueryResult resultToBeDeleted = findOne(id);
        repository.delete(resultToBeDeleted);
        return resultToBeDeleted;
    }
}
