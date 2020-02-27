package com.example.apidemo.dao;

import com.example.apidemo.model.IndustryIdentifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndustryIdentifierRepository extends CrudRepository<IndustryIdentifier, Long> {
}
