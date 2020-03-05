package com.example.apidemo.utils;

import com.example.apidemo.model.BookQuery;
import com.example.apidemo.model.BookQueryResult;
import org.springframework.web.client.RestTemplate;


/**
 * The responsibility of this class is to
 * configure the URL based on User-Input and
 * fetch a respective BookQueryResult from googlebooksapi
 */
public class BookQueryFactoryService {
    private final BookQueryBuilder bookQueryBuilder;

    public BookQueryFactoryService(String apiKey) {
        this.bookQueryBuilder = new BookQueryBuilder().setApiKey(apiKey);
    }
    public BookQueryFactoryService() {
        this("AIzaSyDoc04NEgl3jof9iclXzaoXvKlTI3gRS38");
    }

    public BookQueryResult searchUser(String searchTerm) {
        return search("volumes", searchTerm, "", "");
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
