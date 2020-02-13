package com.example.apidemo.model;

public class Book {

//    Example:
//    https://www.googleapis.com/books/v1/volumes/gK98gXR8onwC

    private final String id;
    private final VolumeInfo volumeInfo;
    private final ImageLinks imageLinks;

    public Book(String id, VolumeInfo volumeInfo, ImageLinks imageLinks) {
        this.id = id;
        this.volumeInfo = volumeInfo;
        this.imageLinks = imageLinks;
    }

    public String getId() {
        return id;
    }

    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    public ImageLinks getImageLinks() {
        return imageLinks;
    }
}
