package com.example.apidemo.utils;

import com.example.apidemo.model.BookQueryResult;
import org.springframework.web.client.RestTemplate;

public class BookQueryFactory {
    private final BookQueryBuilder bookQueryBuilder;

    public BookQueryFactory(String apiKey) {
        this.bookQueryBuilder = new BookQueryBuilder().setApiKey(apiKey);
    }
    public BookQueryFactory() {
        this("AIzaSyDoc04NEgl3jof9iclXzaoXvKlTI3gRS38");
    }

    public BookQueryResult searchUser(String searchTerm, String searchTopic, String searchTopicValue) {
        BookQuery query = bookQueryBuilder
                .setSearchCategory("user")
                .setSearchTerm(searchTerm)
                .setSearchTopic(searchTopic)
                .setSearchTopicValue(searchTopicValue)
                .createBookQuery();
        String url = query.toString();
        return new RestTemplate().getForObject(url, BookQueryResult.class);
    }


    public BookQueryResult search(String searchCategory, String searchTerm, String searchTopic, String searchTopicValue) {
        BookQuery query = bookQueryBuilder
                .setSearchCategory(searchCategory)
                .setSearchTerm(searchTerm)
                .setSearchTopic(searchTopic)
                .setSearchTopicValue(searchTopicValue)
                .createBookQuery();

        String url = query.toString();
        System.out.println(url);
        return new RestTemplate().getForObject(url, BookQueryResult.class);
    }
}
