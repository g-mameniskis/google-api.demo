package com.example.apidemo;

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

	public static void main(Value[] args) {
		SpringApplication.run(ApiDemoApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Quote quote = restTemplate.getForObject(
					// Example URL from (https://spring.io/guides/gs/consuming-rest/)
//					"https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
					// Google API URL
					"https://www.googleapis.com/books/v1/volumes/mFT_CgAAQBAJ", Quote.class);
			log.info(quote.toString());
		};
	}
}