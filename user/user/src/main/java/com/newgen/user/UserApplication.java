package com.newgen.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.newgen", "com.newgen.user.model", "com.newgen.user.controller"})
public class UserApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

}
