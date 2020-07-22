package com.capg.doa;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

import com.capg.model.Trainee;


public class TraineeDAO implements ITraineeDAO{

	 Map<Integer,Trainee> listOfTrainees=new HashMap<Integer,Trainee>();	

	public Trainee addTrainee(Trainee trainee) {

		Trainee flag=listOfTrainees.put(trainee.gettId(), trainee);
		System.out.println(listOfTrainees);
		return flag;
		
	}

	public Trainee findTrainee(int id) {
		Trainee trainee = null;
		for (Map.Entry<Integer, Trainee> mapper:listOfTrainees.entrySet()) {
			
			
			if(mapper.getKey().equals(id))
			{
				trainee=mapper.getValue();
			}
		
		}
		return trainee;
		
	}

	public boolean removeTrainee(int id) {
		boolean flag = false;
		Trainee delete =listOfTrainees.remove(id);

		
		if (delete != null) {
			flag = true;
		}

		return flag;
	}

}
