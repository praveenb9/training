package com.capg.resttemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.capg.resttemplate.model.Student;

@Controller
public class StudentController {
	@Autowired
	RestTemplate rt;

	@PostMapping("/addStudent")
	public String addStudent(@ModelAttribute(name = "student") Student student, Model m)
	{
 
	Student st=	rt.postForObject("http://localhost:8888/student", student, Student.class);
	
	m.addAttribute("operation", "Student With ID");
	m.addAttribute("student", st);
	m.addAttribute("status", "Added");
	return "success.jsp";
	}
	
	@GetMapping("/getStudentById")
	public String findStudent(@RequestParam("studentId") int id, Model m)
	{
		System.out.println(id);
	Student st=	rt.getForObject("http://localhost:8888/student/id/"+id, Student.class);
	m.addAttribute("student", st);
	m.addAttribute("status", "Found");
	m.addAttribute("operation", "Student With ID");

	return "success.jsp";
	}
	@GetMapping("/getStudentByName")
	public String findStudent(@RequestParam("studentName") String name, Model m)
	{
		//System.out.println(id);
	Student st=	rt.getForObject("http://localhost:8888/student/name/"+name, Student.class);
	m.addAttribute("student", st);
	m.addAttribute("status", "Found");
	m.addAttribute("operation", "Student With Name");

	return "success.jsp";
	}

	@PostMapping("/deleteStudent")
	public String deleteTrainee(@RequestParam("studentId") int id,Model m)
	{
		rt.delete("http://localhost:8888/student/id/"+id);
		//m.addAttribute("studentId", id);
		m.addAttribute("status", "deleted Successfully");
		m.addAttribute("operation", "Student With ID");

		//rt.postForObject("http://localhost:8888/student/id"+id , Student.class);
return "success.jsp";

	}
}
