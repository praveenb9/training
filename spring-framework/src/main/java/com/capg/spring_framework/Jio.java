package com.capg.spring_framework;

import java.util.List;
import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("jio")
@Lazy
@Scope("prototype")
public class Jio implements Sim , InitializingBean, DisposableBean{

	@Value("${jio.browsingSpeed}")
	private float browsingSpeed;
	
	@Value("${jio.callCharge}")
	private float callCharge;
	
	@Value("${jio.supportedNetworks}")
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
		System.out.println("jio bean is created");

	}
	
//	@PostConstruct
//	public void init()
//	{
//		System.out.println("x");
//	}

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

	@Override
	public void afterPropertiesSet() throws Exception {
System.out.println("Jio sim initialized");		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
