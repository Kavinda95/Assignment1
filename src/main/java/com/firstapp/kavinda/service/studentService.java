package com.firstapp.kavinda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstapp.kavinda.entity.Student;
import com.firstapp.kavinda.repository.studentRepository;

@Service
public class studentService {

	@Autowired
	private studentRepository repository;
	
	public Student saveStudent(Student student) {
	return repository.save(student);
	
}
	
}
