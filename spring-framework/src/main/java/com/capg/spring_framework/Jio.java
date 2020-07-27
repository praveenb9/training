package com.capg.spring_framework;

import java.util.List;

public class Jio implements Sim {

	private float browsingSpeed;
	private float callCharge;
	private List<String> supportedNetworks;
	
	
	public List<String> getSupportedNetworks() {
		return supportedNetworks;
	}

	public void setSupportedNetworks(List<String> supportedNetworks) {
		this.supportedNetworks = supportedNetworks;
	}

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

	public void showSupportedNets()
	{
		System.out.println("supported networks are ");
		supportedNetworks.forEach(n->System.out.println(n));
	}
}
