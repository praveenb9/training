package com.capg.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {
	
		/*
		 * List trainees= new ArrayList(); trainees.add("Praveen");
		 * trainees.add("kohli"); trainees.add(99); trainees.add(false);
		 * 
		 * trainees.remove((Object)99); for(Object trainee:trainees) {
		 * System.out.println(trainee); }
		 */
		
		
		
//		Set trainees= new HashSet(); 
//		trainees.add("Praveen");
//		  trainees.add("kohli");
//		  trainees.add(99);
//		  trainees.add(false);
//		
//		  trainees.forEach(System.out::println);
		
		
		List<Trainee> trainees=Arrays.asList(
				new Trainee("praveen","12",24),
				new Trainee("suresh","11",30),
				new Trainee("hanish","1",22)
				);
				
	//s	Set<Trainee> traineeSet=new HashSet<>();
		
		Collections.sort(trainees,(t1,t2)->t1.age-t2.age);
		//Collections.sort(trainees);
		trainees.forEach(t->System.out.println(t));
		
	}
}
//class SortByAge implements Comparator<Trainee>
//{
//
//	@Override
//	public int compare(Trainee o1, Trainee o2) {
//
//		return o1.age-o2.age;
//	}	
//}
//class SortByName implements Comparator<Trainee>
//{
//
//	@Override
//	public int compare(Trainee o1, Trainee o2) {
//
//		return o1.tName.compareTo(o2.tName);
//	}	
//}
//class SortByBatch implements Comparator<Trainee>
//{
//
//	@Override
//	public int compare(Trainee o1, Trainee o2) {
//
//	return o1.batchName.compareTo(o2.batchName);
//	}	
//}