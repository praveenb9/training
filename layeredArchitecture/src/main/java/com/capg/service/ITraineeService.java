package com.capg.service;

import com.capg.model.Trainee;

public interface ITraineeService {

	public Trainee addTrainee(Trainee trainee);
	public Trainee findTrainee(int id);
	public boolean removeTrainee(int id);
}
