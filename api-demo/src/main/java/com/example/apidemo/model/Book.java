package com.example.apidemo.model;

public class Book {

//    Example:
//    https://www.googleapis.com/books/v1/volumes/gK98gXR8onwC

    private final VolumeInfo volumeInfo;
    private final ImageLinks imageLinks;

    public Book(VolumeInfo volumeInfo, ImageLinks imageLinks) {
        this.volumeInfo = volumeInfo;
        this.imageLinks = imageLinks;
    }

    public VolumeInfo getVolumeInfo() {
        return volumeInfo;
    }

    public ImageLinks getImageLinks() {
        return imageLinks;
    }
}
