package com.example.apidemo.model;

public class VolumeInfo {

    private final String title;
    private final String subTitle;
    private final String authors;
    private final String publisher;
    private final String publishedDate;

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
}
