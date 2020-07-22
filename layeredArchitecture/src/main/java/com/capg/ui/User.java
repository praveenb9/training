package com.capg.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.capg.model.Trainee;
import com.capg.service.ITraineeService;
import com.capg.service.TraineeService;

public class User {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		ITraineeService service=new TraineeService();
		
		while (true) {
			
			
			
			System.out.println("Choose An Operation On Trainee");
			System.out.println("1. Add Trainee");
			System.out.println("2. delete Trainee");
			System.out.println("3. find Trainee");
			System.out.println("4.Exit");
			int choice=input.nextInt();
			
			switch (choice) 
			{
			
			case 1:System.out.println("enter trainee details");
			System.out.println("Enter trainee ID");
			int tId=input.nextInt();
			System.out.println("Enter trainee Name");
			String tName=input.next();
			System.out.println("Enter trainee dept");
			String dept=input.next();
			Trainee traineeObj=new Trainee(tId, tName, dept);
			Trainee obj=service.addTrainee(traineeObj);
			if(obj==null)
			{
				System.out.println("trainee added successfully");
			}
			else
				System.out.println("trainee not added");
				
				break;
			case 2:System.out.println("enter the id of trainee you want to remove");
			int id=input.nextInt();
			boolean flag=service.removeTrainee(id);
			if(flag==true)
			{
				System.out.println("trainee deleted");
			}
			else
			{
				System.out.println("trainee not found");
			}
			break;
			
			case 3:
				System.out.println("Enter the id of trainee");
				int traineeId=input.nextInt();
				Trainee trainee=service.findTrainee(traineeId);
				if(trainee==null)
				{
					System.out.println("Trainee not found");
				}
				else
					System.out.println("Trainee found - "+trainee);
				break;
			case 4:System.exit(0);
			break;
			default:
				break;
			}	
		
		
}
		}
}
