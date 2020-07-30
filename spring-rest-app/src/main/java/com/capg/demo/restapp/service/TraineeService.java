package com.capg.demo.restapp.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.demo.restapp.dao.TraineeDao;
import com.capg.demo.restapp.model.Trainee;


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
	
	public Trainee findTrainee(int id)
	{
		return dao.findTrainee(id);
	}
	 
	public  List<Trainee> TraineeList()
	{
		return dao.viewTrainees();
	}
}
