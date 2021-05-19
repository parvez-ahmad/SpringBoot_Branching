package com.javatechie.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootBranchingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBranchingApplication.class, args);
		System.out.println("hello");
	}

}
