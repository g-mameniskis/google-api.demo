package com.example.apidemo.service;

import com.example.apidemo.dao.ReadingModesRepository;
import com.example.apidemo.model.ReadingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReadingModeService {

    private ReadingModesRepository repository;

    @Autowired
    public ReadingModeService(ReadingModesRepository repository) {
        this.repository = repository;
    }

    public ReadingMode addReadingMode(ReadingMode readingMode) {
        return repository.save(readingMode);
    }

    public List<ReadingMode> findAll() {
        Iterable<ReadingMode> readingModesIterable = repository.findAll();
        List<ReadingMode> result = new ArrayList<>();
        readingModesIterable.forEach(result::add);
        return result;
    }

    public ReadingMode findOne(Long id) {
        return repository.findById(id).get();
    }

    public ReadingMode delete(Long id) {
        ReadingMode readingModeToBeDeleted = findOne(id);
        repository.delete(readingModeToBeDeleted);
        return readingModeToBeDeleted;
    }

    public ReadingMode create(ReadingMode readingMode) {
        return repository.save(readingMode);
    }

}
