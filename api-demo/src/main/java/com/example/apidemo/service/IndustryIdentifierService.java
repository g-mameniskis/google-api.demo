package com.example.apidemo.service;

import com.example.apidemo.dao.IndustryIdentifierRepository;
import com.example.apidemo.model.IndustryIdentifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IndustryIdentifierService {

    private IndustryIdentifierRepository repository;

    @Autowired
    public IndustryIdentifierService(IndustryIdentifierRepository repository) {
        this.repository = repository;
    }

    public IndustryIdentifier addIndustryIdentifier(IndustryIdentifier industryIdentifier) {
        return repository.save(industryIdentifier);
    }

    public List<IndustryIdentifier> findAll() {
        Iterable<IndustryIdentifier> industryIdentifierIterable = repository.findAll();
        List<IndustryIdentifier> result = new ArrayList<>();
        industryIdentifierIterable.forEach(result::add);
        return result;
    }

    public IndustryIdentifier findOne(Long id) {
        return repository.findById(id).get();
    }

    public IndustryIdentifier delete(Long id) {
        IndustryIdentifier industryIdentifierToBeDeleted = findOne(id);
        repository.delete(industryIdentifierToBeDeleted);
        return industryIdentifierToBeDeleted;
    }

    public IndustryIdentifier create(IndustryIdentifier industryIdentifier) {
        return repository.save(industryIdentifier);
    }
}
