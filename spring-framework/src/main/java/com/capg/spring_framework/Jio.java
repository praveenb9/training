package com.capg.spring_framework;

public class Jio implements Sim {

	private float browsingSpeed;
	private float callCharge;
	
	
	public float getBrowsingSpeed() {
		return browsingSpeed;
	}

	public void setBrowsingSpeed(float browsingSpeed) {
		this.browsingSpeed = browsingSpeed;
	}

	public float getCallCharge() {
		return callCharge;
	}

	public void setCallCharge(float callCharge) {
		this.callCharge = callCharge;
	}
	
	
	public Jio() {
		// TODO Auto-generated constructor stub
	}

	public Jio(float browsingSpeed, float callCharge) {
		super();
		System.out.println("Setting properties through constructor");
		this.browsingSpeed = browsingSpeed;
		this.callCharge = callCharge;
	}

	public void call() {
System.out.println("Jio calling  call charge: "+callCharge);		
	}

	public void search() {
System.out.println("Searching with Jio... browsing speed: "+browsingSpeed);		
	}

}
