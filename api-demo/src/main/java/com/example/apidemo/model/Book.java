package com.example.apidemo.model;

public class Book {

    private final String id;
    private final String title;
    private final String authorName;

    public Book(String id, String title, String authorName) {
        this.id = id;
        this.title = title;
        this.authorName = authorName;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }
}
