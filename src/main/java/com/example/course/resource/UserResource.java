package com.example.course.resource;


import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.UserDomain;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
		
	@GetMapping
	public ResponseEntity<UserDomain> findAll(){
		UUID uuid = UUID.randomUUID();
		UserDomain domain = new UserDomain(uuid, "Noctis", "noctis@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(domain);
	}
	
}
