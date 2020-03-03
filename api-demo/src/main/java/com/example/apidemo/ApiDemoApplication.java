package com.example.apidemo;

import com.example.apidemo.dao.BookQueryResultRepository;
import com.example.apidemo.model.BookQueryResult;
import com.example.apidemo.utils.BookQueryFactoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApiDemoApplication {

    private static final Logger log = LoggerFactory.getLogger(ApiDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ApiDemoApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            String apiKey = "AIzaSyDoc04NEgl3jof9iclXzaoXvKlTI3gRS38";
            String searchCategory = "volumes"; // "/users";
            String searchTerm = "flowers";
            String searchTopic = "author";
            String searchTopicValue = "keyes"; // "intitle:keyes", "inlibrary:keyes"

            BookQueryFactoryService factory = new BookQueryFactoryService(apiKey);

            BookQueryResult bookInformation = factory.search(searchCategory, searchTerm, searchTopic, searchTopicValue);
            log.info(bookInformation.toString());
        };
    }

    @Bean
    public CommandLineRunner initDatabase(BookQueryResultRepository repository) {
        return null;
    }
}