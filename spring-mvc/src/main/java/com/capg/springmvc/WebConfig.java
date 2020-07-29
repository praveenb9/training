package com.capg.springmvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = {"com.capg.springmvc"})
public class WebConfig {

	public InternalResourceViewResolver getViewResolver()
	{
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setSuffix(".jsp");
		return vr;
	}
}
