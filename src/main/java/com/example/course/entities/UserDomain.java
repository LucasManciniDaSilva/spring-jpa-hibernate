package com.example.course.entities;

import java.io.Serializable;
import java.util.UUID;

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

 public class UserDomain implements Serializable {


	private static final long serialVersionUID = 1L;
		private UUID id;
		private String name;
		private String email;
		private String phone;
		private String password;
		

}
