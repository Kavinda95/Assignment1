package com.firstapp.kavinda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.firstapp.kavinda.entity.Student;
import com.firstapp.kavinda.service.studentService;

@RestController
public class studentController {


	    @Autowired
	    private studentService service;
	    
	    
	    @PostMapping("/add")
	    public Student addStudent(@RequestBody Student student) {
	    return service.saveStudent(student);
	    
}
	   
}
