package com.example.apidemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Book {

//    Example:
//    https://www.googleapis.com/books/v1/volumes/gK98gXR8onwC

    @Id
    private Long id;

    @OneToOne
    private Items items;

    public Book() {
        this.items = null;
    }

    public Book(Items items) {
        this.items = items;
    }

    public Items getItems() {
        return items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setItems(Items items) {
        this.items = items;
    }
}
