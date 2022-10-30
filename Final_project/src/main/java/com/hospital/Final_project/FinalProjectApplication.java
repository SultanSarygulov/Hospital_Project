package com.hospital.Final_project;

import com.hospital.Final_project.clients.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
@RestController
public class FinalProjectApplication {

	public static void main(String[] args) {
//		SpringApplication.run(FinalProjectApplication.class, args);
		System.out.println(authorithation());
	}

	@GetMapping
	public static String authorithation(){
		System.out.println("Aвторизуйтесь!");
		Scanner response = new Scanner(System.in);
		String u = response.nextLine();
		return u;

	}

}