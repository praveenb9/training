package com.capg.spring_framework;

public class Mobile {
	
	private Sim sim;
	
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
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
}