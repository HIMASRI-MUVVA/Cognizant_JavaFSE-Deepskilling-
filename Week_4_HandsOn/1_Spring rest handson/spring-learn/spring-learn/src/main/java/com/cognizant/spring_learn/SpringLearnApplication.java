package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) {
        System.out.println("Application started...");
        System.out.println("This is a Sample Web application");
		SpringApplication.run(SpringLearnApplication.class, args);
	}

}
