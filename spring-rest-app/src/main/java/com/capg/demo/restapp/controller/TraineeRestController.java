package com.capg.demo.restapp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.restapp.model.Trainee;
import com.capg.demo.restapp.service.TraineeService;

@RestController
public class TraineeRestController {

	@Autowired
	TraineeService service;
	
	@GetMapping("/traineelist")
//	@ResponseBody
	public List<Trainee> getAllTrainees()
	{
		return service.TraineeList();
	}
	
	@PostMapping("/addtrainee")
	public Trainee addTrainee(@RequestBody Trainee t)
	{
		service.addTrainee(t);
		return t;
		
	}
	@DeleteMapping("/trainee/id/{id}")
	public void deleteTrainee(@PathVariable("id") int tId)
	{
		service.deleteTrainee(tId);
	}
	
	@GetMapping("/trainee/id/{id}")
	public Trainee findTrainee(@PathVariable("id") int tId)
	{
		service.findTrainee(tId);
		System.out.println(tId);
		return service.findTrainee(tId);
	}
}
