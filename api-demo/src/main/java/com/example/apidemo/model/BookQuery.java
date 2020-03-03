package com.example.apidemo.model;

import javax.persistence.*;

@Entity
public class BookQuery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_query_id")
    private String domain;
    private String searchCategory;
    private String searchTerm;
    private String searchTopic;
    private String searchTopicValue;
    private String apiKey;

    public BookQuery(String domain, String searchCategory, String searchTerm, String searchTopic, String searchTopicValue, String apiKey) {
        this.domain = domain;
        this.searchCategory = searchCategory;
        this.searchTerm = searchTerm;
        this.searchTopic = searchTopic;
        this.searchTopicValue = searchTopicValue;
        this.apiKey = apiKey;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getSearchCategory() {
        return searchCategory;
    }

    public void setSearchCategory(String searchCategory) {
        this.searchCategory = searchCategory;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public String getSearchTopic() {
        return searchTopic;
    }

    public void setSearchTopic(String searchTopic) {
        this.searchTopic = searchTopic;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("https://www.googleapis.com/books/v1")
                .append("/" + this.searchCategory)
                .append("?q=" + searchTerm)
                .append(searchTopic != null ? "+in" + searchTopic + ":" : "")
                .append(searchTopicValue != null ? searchTopicValue : "")
                .append("&key=" + apiKey)
                .toString();
    }

    public String getSearchTopicValue() {
        return searchTopicValue;
    }

    public void setSearchTopicValue(String searchTopicValue) {
        this.searchTopicValue = searchTopicValue;
    }
}
