package com.example.springLearning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearningApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(VehicleService vehicleservice){
		return args ->{
			vehicleservice.printDrive();
		};
	}

}
