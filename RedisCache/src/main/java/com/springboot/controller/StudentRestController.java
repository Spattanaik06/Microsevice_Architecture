package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.student;
import com.springboot.repo.Repository;
@RestController
public class StudentRestController 
{
	@Autowired
	private Repository repository;
	
	@PostMapping("/add")
	public String getAddStudent(@RequestBody student s)
	{
		repository.save(s);
		return "Student Added";
	}
	
	@GetMapping("/students")
	public Iterable<student> getAllStudent()
	{
		return repository.findAll();
		
	}
}
