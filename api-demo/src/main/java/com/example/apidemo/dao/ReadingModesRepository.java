package com.example.apidemo.dao;

import com.example.apidemo.model.ReadingMode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadingModesRepository extends CrudRepository<ReadingMode, Long> {
}
