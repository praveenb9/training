package com.capg.spring_labbook.lab1_2;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	private SBU busiessUnit;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public SBU getBusiessUnit() {
		return busiessUnit;
	}
	public void setBusiessUnit(SBU busiessUnit) {
		this.busiessUnit = busiessUnit;
	}
	
	
	public SBU  getSbuDetails()
	{
		return busiessUnit;
		
	}
	
}
