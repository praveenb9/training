package com.capg.springjpa.service;

import java.util.List;

import com.capg.springjpa.model.Trainee;

public interface ITraineeService {

	public Trainee addTrainee(Trainee trainee);
	public Trainee getTrainee(int traineeId);
	public List<Trainee> getAllTrainees();
	public void deleteTrainee(int traineeId);
	public Trainee updateTrainee(Trainee trainee);
}
