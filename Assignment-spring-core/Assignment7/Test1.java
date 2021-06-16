package com.assignment7;
import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser;  

public class Test1 {
	

	public static void main(String[] args) {  
		ExpressionParser parser = new SpelExpressionParser();  
		  
		  
		System.out.println(parser.parseExpression("'Welcome Aasim'+'!'").getValue());  
		System.out.println(parser.parseExpression("15 * 15/2").getValue());  
		System.out.println(parser.parseExpression("'Date Is: '+ new java.util.Date()").getValue());  
		  
	
		System.out.println(parser.parseExpression("true and true").getValue());  
		System.out.println(parser.parseExpression("true and false").getValue());   
	
		System.out.println(parser.parseExpression("'kalua'.length()==5").getValue());  
		}
}  
	


