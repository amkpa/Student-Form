package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Student;

public interface Studentrepo extends JpaRepository<Student, Integer> {
	
}
