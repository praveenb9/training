package com.capg.service;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.capg.model.Trainee;



class TraineeServiceTest {

	static ITraineeService service;
	static Trainee trainee;

	
	@BeforeAll
	public static void Init() throws SQLException
	{
		service=new TraineeService();
		trainee=new Trainee(12, "praveen", "oracle"); 
	}
	@Test
	void testAddTrainee() throws SQLException {
Trainee newTrainee=service.addTrainee(trainee);
System.out.println(newTrainee+"is");
assertEquals(newTrainee, null);

	}

	@Test
	void testFindTrainee() throws SQLException {
		Trainee t=service.findTrainee(trainee.gettId());
		System.out.println(t);
		assertEquals(t, trainee);
	}

	@Test
	void testRemoveTrainee() throws SQLException {
boolean flag=service.removeTrainee(trainee.gettId());
System.out.println(flag);
assertEquals(flag, true);
	}

}
