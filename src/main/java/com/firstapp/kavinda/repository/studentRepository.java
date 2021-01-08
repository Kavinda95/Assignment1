package com.firstapp.kavinda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.firstapp.kavinda.entity.Student;

@Repository
public interface studentRepository extends JpaRepository< Student, Long > {

	Student update(Student student);
	
	
}