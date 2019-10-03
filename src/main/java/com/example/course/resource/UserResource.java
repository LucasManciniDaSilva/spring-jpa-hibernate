package com.example.course.resource;


import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.domains.UserDomain;
import com.example.course.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
		
	@GetMapping
	public ResponseEntity<List<UserDomain>> findAll(){
		List<UserDomain> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<UserDomain> findById(@PathVariable UUID id){
		UserDomain obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
