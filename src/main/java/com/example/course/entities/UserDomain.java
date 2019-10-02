package com.example.course.entities;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
@Builder
@Entity
public class UserDomain implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;
	private String name;
	private String email;
	private String phone;
	private String password;

}
