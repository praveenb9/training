package com.capg.examquestion2.ui;

import java.util.ArrayList;
import java.util.Collections;

import com.capg.examquestion2.modelandsorting.SortByAge;
import com.capg.examquestion2.modelandsorting.SortByName;
import com.capg.examquestion2.modelandsorting.Student;

public class Presentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        ArrayList<Student> ar = new ArrayList<Student>(); 
        ar.add(new Student("harsh", 21, 5.0)); 
        ar.add(new Student("akhil", 19, 6.0)); 
        ar.add(new Student("mani", 18, 4.0)); 
  
  
        Collections.sort(ar, new SortByAge()); 
  
       System.out.println("Sorted by age");
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
  
        Collections.sort(ar, new SortByName()); 
  
        System.out.println("Sorted by name"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
	}

}
