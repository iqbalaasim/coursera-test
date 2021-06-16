package com.assignment6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestApp {
	
	public static void main(String args[]) {
		
		AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Student student=(Student)context.getBean("studentBean");
		System.out.println(student);
		context.close();
	}

}
