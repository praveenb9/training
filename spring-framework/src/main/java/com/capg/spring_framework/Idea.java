package com.capg.spring_framework;

import java.util.List;

public class Idea implements Sim {
	
	private float callCharge;
	private float browsingSpeed;
	private List<String> supportedNetworks;
	

	public List<String> getSupportedNetworks() {
		return supportedNetworks;
	}

	public void setSupportedNetworks(List<String> supportedNetworks) {
		this.supportedNetworks = supportedNetworks;
	}

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
			public void showSupportedNets()
			{
				System.out.println("supported networks are ");
				supportedNetworks.forEach(n->System.out.println(n));
			}

}
