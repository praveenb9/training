package com.capg.spring_framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//ApplicationContext container=new ClassPathXmlApplicationContext("spring.xml");
    	//Sim sim=container.getBean(Jio.class);
  //  	Sim sim=(Sim)container.getBean("idea");
    	
    	ApplicationContext container=new AnnotationConfigApplicationContext(AppConfig.class);
Mobile m=container.getBean("mobile",Mobile.class);
//m.setSim(sim);
m.call();
m.search();
m.showSupportedNets();
m.getSim().setBrowsingSpeed(15.5f);
m.getSim().setCallCharge(1.5f);

Mobile m2=container.getBean("mobile",Mobile.class);
m2.call();
m2.search();
m2.showSupportedNets();
m2.getSim().setBrowsingSpeed(15.5f);
m2.getSim().setCallCharge(1.5f);

Sim sim=(Sim)container.getBean("jio");
    }
}
