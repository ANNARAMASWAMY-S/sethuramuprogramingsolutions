package com.cognizant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	public static void main(String[] args) {
		logger.info("Starting......");
		logger.info("ending..........");
		SpringApplication.run(Application.class, args);
		
		
		
		
	}

}
