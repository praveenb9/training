package com.capg.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.capg.controller.TraineeController;
import com.capg.model.Trainee;

public class App {

	public static void main(String[] args) throws SQLException  {
		
		Trainee t1;
		TraineeController controller = new TraineeController();
		
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("choose an option");
			System.out.println("1.Add Trainee");
			System.out.println("2.Find Trainee");
			System.out.println("3.Delete Trainee");
			System.out.println("4.View Trainees");
			int choice=sc.nextInt();
			
			
			switch (choice) {
			case 1:System.out.println("Enter details-(ID,Name,Dept)");
			System.out.println("Enter ID");
			int id=sc.nextInt();
			System.out.println("Enter Name");
			String name=sc.next()+sc.nextLine();
			System.out.println("Enter dept");
			String dept=sc.next()+sc.nextLine();
			
			Trainee trainee=new Trainee(id, name, dept);
			try {
				t1=controller.addTrainee(trainee);
				System.out.println("Trainee Added "+t1);
			} catch (SQLException e) {
				System.out.println("Error ");
				e.printStackTrace();
			}
				
				break;
			case 2:System.out.println("Enter ID of Trainee");
			int tId=sc.nextInt();
			Trainee foundTrainee=controller.findTrainee(tId);
			System.out.println(foundTrainee);
			break;
			case 3: System.out.println("Entetr ID of Trainee To Delete");
			int traineeId=sc.nextInt();
			boolean flag=controller.deleteTrainee(traineeId);
			System.out.println(flag);
			if(flag==true)
			{
				System.out.println("Trainee Deleted");
			}
			else
				System.out.println("unable to delete Trainee");
			break;
			default:
				break;
			}
			
		
		
	}
}
}
