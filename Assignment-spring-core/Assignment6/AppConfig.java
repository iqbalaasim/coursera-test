package com.assignment6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.assignment6")
public class AppConfig {
	
	@Bean
	public Student studentBean() {
		return new Student();
	}

}
