package com.hospital.Final_project;



import com.hospital.Final_project.repository.ClientRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FinalProjectApplication{
	private ClientRepository clientRepository;
	public static void main(String[] args) {
		SpringApplication.run(FinalProjectApplication.class, args);
	}

}