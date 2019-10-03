package com.example.course.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.UserDomain;
import com.example.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<UserDomain> findAll(){
		return repository.findAll();
	}
	
	public UserDomain findById(UUID id) {
		Optional<UserDomain> obj = repository.findById(id);
		return obj.get();
	}
	
}
