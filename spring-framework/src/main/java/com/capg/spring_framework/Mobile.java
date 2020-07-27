package com.capg.spring_framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mobile")
public class Mobile {
	
	@Autowired
	@Qualifier("jio")
	private Sim sim;
	
//	public Sim getSim() {
//		return sim;
//	}
//	public void setSim(Sim sim) {
//		this.sim = sim;
//	}
	
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
}