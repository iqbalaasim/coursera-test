package com.assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext factory= new AnnotationConfigApplicationContext(AppConfig.class);
		Question ques=factory.getBean(Question.class);
		ques.viewDetails();
		((AbstractApplicationContext) factory).close();

	}

}
