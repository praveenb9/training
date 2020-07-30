package com.capg.labbook.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.capg.labbook.model.Trainee;

@Repository
public class TraineeDao {

Map<Integer, Trainee> traineeList =new HashMap<Integer, Trainee>();
	Map<String, String> logins= loginId();
	
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
	
	public boolean validateLogin(String uName,String password)
	{
		boolean flag=false;
		if(logins.containsKey(uName) && logins.get(uName)==password)
		{
			flag=true;
			System.out.println("truee");
			return flag;
		}
		else
		{
			return flag;

		}		
	}
	
	public HashMap<String, String> loginId() {
		HashMap<String, String> logins=new HashMap<String,String>();
		logins.put("praveen","12345678");
		logins.put("king","1234");
		return logins;
		}
}
