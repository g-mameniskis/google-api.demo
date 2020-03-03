package com.example.apidemo.service;

import com.example.apidemo.dao.BookQueryRepository;
import com.example.apidemo.model.BookQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookQueryService {
    private BookQueryRepository bookQueryRepository;

    @Autowired
    public BookQueryService(BookQueryRepository bookQueryRepository) {
        this.bookQueryRepository = bookQueryRepository;
    }

    public BookQueryService update(Long id, BookQuery newAccessInfoData) {
        BookQuery accessInfoToBeUpdated = findOne(id);
        accessInfoToBeUpdated.setAccessInfo(newAccessInfoData.getAccessInfo());
        repository.save(accessInfoToBeUpdated);
        return accessInfoToBeUpdated;
    }
}
