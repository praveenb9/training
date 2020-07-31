package com.capg.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.assignment.model.Student;
import com.capg.assignment.service.IStudentService;

@RestController
public class StudentController {

	@Autowired
	IStudentService service;
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student)
	{
		return service.addStudent(student);
	}
	
	@GetMapping("/student/id/{id}")
	public Student findStudent(@PathVariable int id)
	{
		return service.findStudent(id);
	}
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student)
	{
		return service.updateStudent(student);
	}
	@GetMapping("/student")
	public List<Student> getAllStudents()
	{
		return service.getAllStudents();
	}
	
	@DeleteMapping("/student/id/{id}")
	public void deleteStudent(@PathVariable int id)
	{
		service.deleteStudent(id);
	}
}
