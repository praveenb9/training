package com.capg.labbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capg.labbook.model.Trainee;
import com.capg.labbook.service.TraineeService;


@Controller
public class TraineeController {

	@Autowired
	TraineeService service;
	
	@GetMapping
	public String loginPage()
	{
		return "login";
	}
	
	@PostMapping("/home")
	public String homePage(@RequestParam("uname") String name, @RequestParam("password") String password, Model m)
	{
	boolean flag=service.loginValidation(name, password);
	if(flag==true)
	{
		return "manage";
	}
	else {
		m.addAttribute("login","invalid Login");
		return "login";
	}
		
	}
	
	@PostMapping("/add")
	public String addTrainee(@ModelAttribute Trainee t1,Model m)
	{
		service.addTrainee(t1);
		m.addAttribute("traineeid", t1.getTraineeId());
		m.addAttribute("operation", "added successfullly");
		
		return "view";
	}
	
	@PostMapping("/deletetrainee")
	public String deleteTrainee(@RequestParam("traineeId") int id,Model m)
	{
		service.deleteTrainee(id);
		m.addAttribute("traineeid",id);
		m.addAttribute("operation", "deleted successfullly");

		return "view";
	}
	
	@PostMapping("/find")
	public String findTrainee(@RequestParam("traineeId") int id, Model m)
	{
		
		m.addAttribute("trainee",service.find(id) );
		m.addAttribute("information", "Trainee Info");
		return "delete-trainee";
	}
}
