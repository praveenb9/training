package com.capg.spring_framework;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("mobile")
@Lazy
@Scope("prototype")
public class Mobile implements InitializingBean {
	
	@Autowired
	@Qualifier("idea")
	private Sim sim;


	
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	public Mobile() {
		// TODO Auto-generated constructor stub
	System.out.println("mobile bean is created");
	}
	void call()
	{
		if(sim==null)
		{
			System.out.println("please insert sim first");
		}
		else {
		sim.call();
	}
	}
	void search()
	{
		if(sim==null)
		{
			System.out.println("please insert sim first");
		}
		else {
			sim.search();
	}

}
	public void showSupportedNets()
	{
		if(sim==null)
		{
			System.out.println("please insert sim first");
		}
		else {
			sim.showSupportedNets();;
	}
}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Mobile initialized......");		
		
	}
	
}