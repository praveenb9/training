package com.capg.labbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.labbook.dao.TraineeDao;
import com.capg.labbook.model.Trainee;


@Service
public class TraineeService {

	@Autowired
	TraineeDao dao;
	
	public Trainee addTrainee(Trainee t)
	{
		return dao.addTrainee(t);
	}
	
	public int deleteTrainee(int id)
	{
		return dao.deleteTrainee(id);
	}
	
	
	public boolean loginValidation(String uName,String password)
	{
		return dao.validateLogin(uName, password);
		
	}
}