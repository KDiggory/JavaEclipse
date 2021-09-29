package com.example.starterproject;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;

public class Runner {

	public static void main(String[] args) {

	    ApplicationContext context = StarterProjectApplication.main(SpringExampleApplication.class, args); 
	    Object byName = context.getBean("greeting");
	    String byType = context.getBean(String.class);
	    String byBoth = context.getBean("greeting", String.class);

	    System.out.println(byName);
	    System.out.println(byType);
	    System.out.println(byBoth);

	}
}
