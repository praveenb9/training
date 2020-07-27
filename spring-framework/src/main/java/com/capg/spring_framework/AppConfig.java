package com.capg.spring_framework;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.capg.spring_framework"})
public class AppConfig {

	@Bean(name = "jio")
	public Jio getJioBean()
	{
		Jio jio=new Jio(2.5f,25.5f);
		List<String> netList=Arrays.asList("Edge","HSPA","LTE","VoLTE");
	jio.setSupportedNetworks(netList);
		return jio;
	}
	
	@Bean(name = "idea")
	public Idea getIdeaBean()
	{
		Idea idea=new Idea(1.5f,15.5f);
		
		List<String> netList=Arrays.asList("Edge","HSPA","LTE");
		idea.setSupportedNetworks(netList);

		return idea;
	}
	
//	
//	@Bean(name = "mobile")
//	public Mobile getMobileBean()
//	{
//		Mobile m=new Mobile();
//		m.setSim(getIdeaBean());
//		return m;
//	}

}
