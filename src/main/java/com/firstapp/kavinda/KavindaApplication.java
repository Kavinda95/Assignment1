package com.firstapp.kavinda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class KavindaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KavindaApplication.class, args);
	}

}
