package com.example.apidemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Items {
//    Example:
//    https://www.googleapis.com/books/v1/volumes/gK98gXR8onwC

    @Id
    private String id;

    @OneToOne
    private VolumeInfo volumeInfo;

    @OneToOne
    private ImageLinks imageLinks;

    public Items() {
    }

    public Items(String id, VolumeInfo volumeInfo, ImageLinks imageLinks) {
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

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", volumeInfo=" + volumeInfo +
                ", imageLinks=" + imageLinks +
                '}';
    }
}
