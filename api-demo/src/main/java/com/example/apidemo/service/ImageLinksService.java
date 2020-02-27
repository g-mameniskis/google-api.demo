package com.example.apidemo.service;

import com.example.apidemo.dao.ImageLinksRepository;
import com.example.apidemo.model.Book;
import com.example.apidemo.model.ImageLinks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class ImageLinksService {

    private ImageLinksRepository repository;

    @Autowired
    public ImageLinksService(ImageLinksRepository repository) {
        this.repository = repository;
    }

    public ImageLinks addImageLinks(ImageLinks imageLinks) {
        return repository.save(imageLinks);
    }

    public List<ImageLinks> findAll() {
        Iterable<ImageLinks> imageLinksIterable = repository.findAll();
        List<ImageLinks> result = new ArrayList<>();
        imageLinksIterable.forEach(result::add);
        return result;
    }

    public ImageLinks findOne(Long id) {
        return repository.findById(id).get();
    }

    public ImageLinks delete(Long id) {
        ImageLinks imageLinksToBeDeleted = findOne(id);
        repository.delete(imageLinksToBeDeleted);
        return imageLinksToBeDeleted;
    }

    public ImageLinks create(ImageLinks imageLinks) {
        return repository.save(imageLinks);
    }

//    public ImageLinks update(Long id, ImageLinks newImageLinks) {
//        Book bookToBeUpdated = findOne(id);
//        bookToBeUpdated.setAccessInfo(newBookData.getAccessInfo());
//        bookToBeUpdated.setEtag(newBookData.getEtag());
//        bookToBeUpdated.setKind(newBookData.getKind());
//        bookToBeUpdated.setSaleInfo(newBookData.getSaleInfo());
//        bookToBeUpdated.setSearchInfo(newBookData.getSearchInfo());
//        bookToBeUpdated.setSelfLink(newBookData.getSelfLink());
//        bookToBeUpdated.setVolumeInfo(newBookData.getVolumeInfo());
//        repository.save(bookToBeUpdated);
//        return bookToBeUpdated;
//    }
}
