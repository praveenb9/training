package com.capg.demo.restapp.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.capg.demo.restapp.model.Trainee;


@Repository
public class TraineeDao {

	Map<Integer, Trainee> traineeList =new HashMap<Integer, Trainee>();
	
	
	public Trainee addTrainee(Trainee t)
	{
		traineeList.put(t.getTraineeId(), t);
		return t;
	}
	
	public int  deleteTrainee(int id)
	{ 
				traineeList.remove(id);
				return id;
	}
	
	public Trainee findTrainee(int id)
	{
		return traineeList.get(id);
	}
	
	public List< Trainee> viewTrainees()
	{
		return traineeList.values().stream().collect(Collectors.toList());

	}
}
