package com.example.apidemo.dao;

import com.example.apidemo.model.BookQueryResult;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookQueryResultRepository  extends CrudRepository<BookQueryResult, Long> {
}
