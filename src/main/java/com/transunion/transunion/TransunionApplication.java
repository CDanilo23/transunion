package com.transunion.transunion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class})
public class TransunionApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransunionApplication.class, args);
	}

}
