package com.capg.service;

import java.sql.SQLException;

import com.capg.doa.ITraineeDAO;
import com.capg.doa.TraineeDaodbcBased;
import com.capg.model.Trainee;

public class TraineeService implements ITraineeService{

	ITraineeDAO dao;
	public TraineeService() throws SQLException
	{
		//dao=new TraineeDAO();
		dao= new TraineeDaodbcBased();
	}
	
	
	public Trainee addTrainee(Trainee trainee) throws SQLException {
	return dao.addTrainee(trainee);
		
	}

	public Trainee findTrainee(int id) throws SQLException {
		
		return dao.findTrainee(id);
	}

	public boolean removeTrainee(int id) throws SQLException {
	return 	dao.removeTrainee(id);
		
	}

	
}
