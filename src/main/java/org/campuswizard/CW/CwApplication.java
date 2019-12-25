package org.campuswizard.CW;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories({"org.campuswizard.repos"})
@ComponentScan({"org.campuswizard.controller","org.campuswizard.model"})
public class CwApplication {

	public static void main(String[] args) {
		SpringApplication.run(CwApplication.class, args);
	}

}
