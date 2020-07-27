package com.capg.spring_framework;

public class Idea implements Sim {
	
	private float callCharge;
	private float browsingSpeed;
	

	public float getCallCharge() {
		return callCharge;
	}

	public void setCallCharge(float callCharge) {
		this.callCharge = callCharge;
	}

	public float getBrowsingSpeed() {
		return browsingSpeed;
	}

	public void setBrowsingSpeed(float browsingSpeed) {
		this.browsingSpeed = browsingSpeed;
	}
	
	
	public Idea() {
		// TODO Auto-generated constructor stub
	}
	
	public Idea(float callCharge, float browsingSpeed) {
		super();
		System.out.println("Setting properties through constructor");
		this.callCharge = callCharge;
		this.browsingSpeed = browsingSpeed;
	}

	public void call() {
		System.out.println("idea calling  call charge: "+callCharge);		
			}

			public void search() {
		System.out.println("Searching with idea... browsing speed: "+browsingSpeed);		
			}


}
