package com.capg.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.capg.dao.IStudentDaoJpa;
import com.capg.dao.StudentDaoJpa;
import com.capg.model.Student;

public class App 
{
	static Scanner scan;
	static IStudentDaoJpa impl;
    public static void main( String[] args )
    {
    	int choice =0;
    	boolean flag=false;
    	
        while(true)
        {
        	do {
        		scan= new Scanner(System.in);
        		System.out.println("Select the operation to be performed");
        		System.out.println("Enter 1 for add");
        		System.out.println("Enter 2 for remove student");
        		System.out.println("Enter 3 for find the student");
        		try {
        			choice =  scan.nextInt();
        			flag=true;
        		}
        		catch (InputMismatchException e) {
					// TODO: handle exception
        			System.err.println("Enter the valid number from above");
				}
        	}
        	while(!flag);
        	switch(choice)
        	{
        	case 1:
        		
        		boolean flag1=false;
        		int id=0;
        		do {        
        			scan=new Scanner(System.in);
            		System.out.println("Enter the id");
        			try {
        				 id=scan.nextInt();
                		flag=true;
        				
        		}
        			catch (InputMismatchException e) {
        				System.err.println("Enter digits");
						// TODO: handle exception
					}
        		
        		}
        		while(!flag1);
        		
        		System.out.println("Enter the name");
        		String name=scan.next();
        		double  height=0;
        		do {
        			impl=new StudentDaoJpa();
        		System.out.println("Enter the height");
        		try {
        		height=scan.nextDouble();
        		}
        		catch (InputMismatchException e) {
					// TODO: handle exception
        			System.err.println("Enter the valid number");
				}
        		
        		}
        		while(!flag1);
        		Student s=new Student(id,name,height);
        		
        		if(!(impl.addStudent(s)==null))
        		{
        			System.out.println("Added");
        		}
        		else {
        			System.out.println("Not added");
        		}
        		break;
        	case 2:
        		scan=new Scanner(System.in);
        		boolean flag2 = false;int idForRemoval=0;
        		do {
        			impl=new StudentDaoJpa();
        		System.out.println("Enter the id");
        		try {
        			
        		idForRemoval =scan.nextInt();
        		flag2=true;
        		}
        		catch (InputMismatchException e) {
					// TODO: handle exception
        			System.out.println("Exception caught please enter number");
				}
        		}while(!flag2);
        	
        		if(!(impl.removeStudent(idForRemoval)==false))
        		{
        			System.out.println("removed");
        		}
        		else {
        			System.out.println("Not exist");
        		}
        		break;
        	case 3:
        		boolean flag3=false;
        		int idForFind=0;
        		scan=new Scanner(System.in);
        		do {
        			impl=new StudentDaoJpa();
        		System.out.println("Enter the id");
        		try {
        			idForFind =scan.nextInt();
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Enter number");
				}
        		
        		}
        		while(!flag3);
        		
        		if((impl.findStudent(idForFind)==null))
        		{
        			System.out.println("Not Exist");
        		}
        		else {
        			System.out.println("found");
        		}
        		break;
        	default:
        		System.out.println("Enter from the above numbers");
        	}
        }
    }
}
