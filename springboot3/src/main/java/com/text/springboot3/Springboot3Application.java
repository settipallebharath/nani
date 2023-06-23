package com.text.springboot3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class Springboot3Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot3Application.class, args);
		System.out.println("DONE");
	}

}
