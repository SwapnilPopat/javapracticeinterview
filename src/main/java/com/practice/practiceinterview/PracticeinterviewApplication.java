package com.practice.practiceinterview;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PracticeinterviewApplication {

	private static final Logger log = LoggerFactory.getLogger(PracticeinterviewApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PracticeinterviewApplication.class, args);
	}

	@Bean
	public ApplicationRunner lambdaMessageRunner() {
		return args -> log.info("Message: Hello, Lambda!");
	}

}
