package com.example.course.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.UserDomain;

public interface UserRepository extends JpaRepository<UserDomain, UUID>{

}
