package com.capg.spring_framework;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("idea")
@Lazy
@Scope("prototype")
public class Idea implements Sim , InitializingBean{
	
	@Value("${idea.callCharge}")
	private float callCharge;
	
	@Value("${idea.browsingSpeed}")
	private float browsingSpeed;
	
	@Value("${idea.supportedNetworks}")
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
		System.out.println("idea bean is created");

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

			@Override
			public void afterPropertiesSet() throws Exception {
				System.out.println("idea sim initialized");		
				
			}

}
