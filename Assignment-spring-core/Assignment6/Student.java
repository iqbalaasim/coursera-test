package com.assignment6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("10")
	private int rollNo;
	@Value("Chetan")
	private String studentName;
	@Value("67.4")
	private Double percentage;
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", percentage=" + percentage + "]";
	}
	
	

}
