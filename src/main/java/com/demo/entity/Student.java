package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	private String name;
	private String email;
	private String gender;
	private String course;
	private String timing;

	public Student(String name, String email, String gender, String course, String timing) {
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.course = course;
		this.timing = timing;
	}
}
