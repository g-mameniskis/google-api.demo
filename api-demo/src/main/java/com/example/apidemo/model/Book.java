package com.example.apidemo.model;

public class Book {

//    Example:
//    https://www.googleapis.com/books/v1/volumes/gK98gXR8onwC

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
}
