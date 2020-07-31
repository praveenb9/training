package com.capg.springjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springjpa.model.Trainee;
import com.capg.springjpa.service.ITraineeService;

@RestController
public class TraineeController {

	@Autowired
	ITraineeService service;
	
	@PostMapping("/trainees")
	public Trainee addTrainee(@RequestBody Trainee trainee)
	{
		return service.addTrainee(trainee);
	}
	
	@GetMapping("/trainees/id/{id}")
	public Trainee getTrainee(@PathVariable int id)
	{
		return service.getTrainee(id);
	}
	@GetMapping("/trainees")
	public List<Trainee> getAllTrainees()
	{
		return service.getAllTrainees();
	}
	@DeleteMapping("/trainees/id/{id}")
	public void deleteTrainee(@PathVariable int id)
	{
		service.deleteTrainee(id);
	}
	
	@PutMapping("/trainees")
	public Trainee updateTrainee(@RequestBody Trainee trainee)
	{
		return service.updateTrainee(trainee);
	}
}
