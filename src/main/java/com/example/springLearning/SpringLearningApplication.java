package com.example.springLearning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.controller.myController;
@SpringBootApplication(scanBasePackages = "com.example")
public class SpringLearningApplication {

	public myController mc;
	public static void main(String[] args) {
		SpringApplication.run(SpringLearningApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(myController mc){
		return args ->{
			mc.sayHello();
		};

	}


}
