package com.example.apidemo.dao;

import com.example.apidemo.model.ImageLinks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageLinksRepository extends CrudRepository<ImageLinks, Long> {
}
