package com.gnt.jib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jib1Application {

	public static void main(String[] args) {
		SpringApplication.run(Jib1Application.class, args);
		System.out.println("Jib Image is built");
	}

}
