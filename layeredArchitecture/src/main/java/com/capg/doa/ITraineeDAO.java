package com.capg.doa;

import com.capg.model.Trainee;

public interface ITraineeDAO {

	public Trainee addTrainee(Trainee trainee);
	public Trainee findTrainee(int id);
	public boolean removeTrainee(int id);
}
