package com.example.apidemo.utils;

public class BookQueryBuilder {
    private String domain;
    private String searchCategory;
    private String searchTerm;
    private String searchTopic;
    private String searchTopicValue;
    private String apiKey;

    public BookQueryBuilder setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public BookQueryBuilder setSearchCategory(String searchCategory) {
        this.searchCategory = searchCategory;
        return this;
    }

    public BookQueryBuilder setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
        return this;
    }

    public BookQueryBuilder setSearchTopic(String searchTopic) {
        this.searchTopic = searchTopic;
        return this;
    }

    public BookQueryBuilder setSearchTopicValue(String searchTopicValue) {
        this.searchTopicValue = searchTopicValue;
        return this;
    }

    public BookQueryBuilder setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    public BookQuery createBookQuery() {
        return new BookQuery(domain, searchCategory, searchTerm, searchTopic, searchTopicValue, apiKey);
    }
}