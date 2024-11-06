package com.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.validation.Entity.User;
import com.validation.Repo.UserRepo;

@SpringBootApplication
public class CustoValidationApplication implements CommandLineRunner{

	@Autowired
	private UserRepo userRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(CustoValidationApplication.class, args);
	
	}

	@Override
	public void run(String... args) throws Exception {
		
		User u = new User();
		u.setId(3);
		u.setName("Pratik");
		
		userRepo.save(u);
		
	}

}
