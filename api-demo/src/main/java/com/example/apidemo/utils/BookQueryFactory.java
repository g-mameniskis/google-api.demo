package com.example.apidemo.utils;

import com.example.apidemo.model.BookQueryResult;
import org.springframework.web.client.RestTemplate;

public class BookQueryFactory {
    private final BookQueryBuilder bookQueryBuilder;

    public BookQueryFactory(String apiKey, String searchCategory) {
        this.bookQueryBuilder = new BookQueryBuilder()
                .setApiKey(apiKey)
                .setSearchCategory(searchCategory);

    }

    public BookQueryResult search(String searchTerm, String searchTopic) {
        BookQuery query = bookQueryBuilder
                .setSearchTerm(searchTerm)
                .setSearchTopic(searchTopic)
                .createBookQuery();
        String url = query.toString();
        System.out.println(url);
        return new RestTemplate().getForObject(url, BookQueryResult.class);
    }

    public BookQueryResult search(String searchTerm) {
        return search(searchTerm, "");
    }
}
