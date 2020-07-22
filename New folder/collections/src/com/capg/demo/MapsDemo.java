package com.capg.demo;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> traineeBatchCode=new HashMap<>();
		traineeBatchCode.put("benny", 3);
		traineeBatchCode.put("kanisk", 4);
		traineeBatchCode.put("nikhil", 2);
		
		System.out.println(traineeBatchCode.get("nikhil"));
		traineeBatchCode.forEach((k,v)->System.out.println(k+"-"+v));
		
		for (String trainee : traineeBatchCode.keySet()) {
			System.out.println(trainee+"-"+traineeBatchCode.get(trainee));
		}
	}
}
