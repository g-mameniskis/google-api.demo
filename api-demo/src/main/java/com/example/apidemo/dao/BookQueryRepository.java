package com.example.apidemo.dao;

import com.example.apidemo.model.BookQuery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookQueryRepository extends CrudRepository<BookQuery, Long> {

}