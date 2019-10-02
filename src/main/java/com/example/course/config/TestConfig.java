package com.example.course.config;

import java.util.Arrays;

import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;

import com.example.course.entities.UserDomain;
import com.example.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		UserDomain u1 = new UserDomain(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		UserDomain u2 = new UserDomain(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}

}
