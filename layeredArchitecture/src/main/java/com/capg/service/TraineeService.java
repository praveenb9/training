package com.capg.service;

import com.capg.doa.ITraineeDAO;
import com.capg.doa.TraineeDAO;
import com.capg.model.Trainee;

public class TraineeService implements ITraineeService{

	ITraineeDAO dao;
	public TraineeService()
	{
		dao=new TraineeDAO();
	}
	public Trainee addTrainee(Trainee trainee) {
	return dao.addTrainee(trainee);
		
	}

	public Trainee findTrainee(int id) {
		
		return dao.findTrainee(id);
	}

	public boolean removeTrainee(int id) {
	return 	dao.removeTrainee(id);
		
	}

	
}
