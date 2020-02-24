package com.example.apidemo;

import com.example.apidemo.model.Book;
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

	private String var1;
	private String var2;
	private String var3;
	private String var4;



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
			Book quote = restTemplate.getForObject(
					//"https://gturnquist-quoters.cfapps.io/api/random", Quote.class); //---> Original URL
					"https://www.googleapis.com/books/v1/volumes?q=flowers+inauthor:keyes&key=AIzaSyDoc04NEgl3jof9iclXzaoXvKlTI3gRS38", Book.class); // Google Books URL
//			https://www.googleapis.com/books/v1/volumes?q=flowers+inauthor:keyes&key=yourAPIKey ---> Google Books Example for Volumes
//			String url = (String.format(https://www.googleapis.com/books/v1
//							/%s -> "volumes" or "users"
//							?q= -> beginning of query
//							%s -> search for volumes that contain this string ex: "dogs"
//							+
//							%s -> "inTitle", "inAuthor", etc. (do you want to search for the previous value in title or author?)
//							:keyes -> user input (text is in author name)
//							&key=%s ->
//							,
//							firstVariable, secondVariable, thirdVariable, fourthVariable)); ---> Google books example with variables
//			firs variable  = volumes OR
//			https://www.googleapis.com/books/v1/mylibrary/bookshelves/0/addVolume?volumeId=NRWlitmahXkC&key=yourAPIKey
			log.info(quote.toString());
		};
	}
}