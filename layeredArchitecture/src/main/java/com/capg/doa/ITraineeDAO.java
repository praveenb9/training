package com.capg.doa;

import java.sql.SQLException;

import com.capg.model.Trainee;

public interface ITraineeDAO {

	public Trainee addTrainee(Trainee trainee) throws SQLException;
	public Trainee findTrainee(int i) throws SQLException;
	public boolean removeTrainee(int id) throws SQLException;
}
