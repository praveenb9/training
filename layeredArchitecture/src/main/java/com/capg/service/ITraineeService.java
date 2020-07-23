package com.capg.service;

import java.sql.SQLException;

import com.capg.model.Trainee;

public interface ITraineeService {

	public Trainee addTrainee(Trainee trainee) throws SQLException;
	public Trainee findTrainee(int id) throws SQLException;
	public boolean removeTrainee(int id) throws SQLException;
}
