package com.javatechie.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootBranchingApplication {

	@GetMapping("/{purchase}/{username}/{amount}/{productName}")
	public String Purchase(@PathVariable String username, @PathVariable double amount,
			@PathVariable String productName) {
		return "hi " + username + " order for " + productName + " with amount " +amount+ " Stored amount";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBranchingApplication.class, args);
		System.out.println("hello");
	}

}
