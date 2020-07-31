package com.capg.springjpa.dao;

import java.util.List;

import com.capg.springjpa.model.Trainee;

public interface ITraineeJpaRepo {

	public Trainee addTrainee(Trainee trainee);
	public Trainee getTrainee(int traineeId);
	public List<Trainee> getAllTrainees();
	public void deleteTrainee(int traineeId);
}
