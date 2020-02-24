package com.example.apidemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VolumeInfo {

    @Id
    private Long id;
    private String title;
    private String subTitle;
    private String authors;
    private String publisher;
    private String publishedDate;

    public VolumeInfo(String title, String subTitle, String authors, String publisher, String publishedDate) {
        this.title = title;
        this.subTitle = subTitle;
        this.authors = authors;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getAuthors() {
        return authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
