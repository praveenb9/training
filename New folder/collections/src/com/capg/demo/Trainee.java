package com.capg.demo;

public class Trainee implements Comparable<Trainee>{

	String tName;
	String batchName;
	int age;
	public Trainee(String tName, String batchName, int age) {
		super();
		this.tName = tName;
		this.batchName = batchName;
		this.age = age;
	}
	public Trainee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Trainee [tName=" + tName + ", batchName=" + batchName + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Trainee o) {
		//return this.age-o.age;
		return this.batchName.compareTo(o.batchName);
	}
	
}
