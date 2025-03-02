package com.bookmyshow.bookmyshow;

import com.bookmyshow.bookmyshow.controllers.UserController;
import com.bookmyshow.bookmyshow.dtos.SignUpRequestDTO;
import com.bookmyshow.bookmyshow.dtos.SignUpResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookMyShowApplication implements CommandLineRunner {
	@Autowired
	UserController userController;

	@Override
	public void run(String... args) throws Exception {
		SignUpRequestDTO signUpRequestDTO = new SignUpRequestDTO();
		signUpRequestDTO.setFirstName("Vivek");
		signUpRequestDTO.setLastName("Kumar");
		signUpRequestDTO.setEmail("vivek.kumar@gmail.com");
		signUpRequestDTO.setPassword("password");

		SignUpResponseDTO signUpResponseDTO = userController.signUp(signUpRequestDTO);
		System.out.println(signUpResponseDTO.getResponseStatus());
	}

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
	}

}
