package com.ijse.gdse.Next_Travel;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NextTravelApplication {

	public static void main(String[] args) {
		SpringApplication.run(NextTravelApplication.class, args);
	}
	@Bean
	ModelMapper getModelMapper(){
		return new ModelMapper();
	}

}
