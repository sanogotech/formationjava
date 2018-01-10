package com.cnss.demo;


import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cnss.demo.domain.Role;
import com.cnss.demo.domain.User;
import com.cnss.demo.repository.UserRepository;




@SpringBootApplication
public class SpringBootDemoApplication implements CommandLineRunner {

	
	
	@Autowired
	private UserRepository userRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	}
   
   
}

