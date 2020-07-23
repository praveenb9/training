package com.capg.controller;

import java.sql.SQLException;

import com.capg.model.Trainee;
import com.capg.service.TraineeService;

public class TraineeController {

	TraineeService service;

	public TraineeController() throws SQLException {
	service=new TraineeService();
	}
	
	public Trainee addTrainee(Trainee trainee) throws SQLException {
		return service.addTrainee(trainee);
		
	}
public Trainee findTrainee(int id) throws SQLException
{
	return service.findTrainee(id);
}
	public boolean deleteTrainee(int id) throws SQLException
	{
		return service.removeTrainee(id);
	}
}
