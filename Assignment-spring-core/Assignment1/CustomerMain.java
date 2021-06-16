package com.assignment.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerMain {
	
	public static void main(String args[]) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaTest.class);
		Customer obj=(Customer)context.getBean("customer");
		obj.show();
		
		
	}

}
