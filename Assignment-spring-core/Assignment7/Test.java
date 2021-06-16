package com.assignment7;
import org.springframework.expression.Expression;  
import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser;  
  
public class Test {  
	public static void main(String[] args) {  
		ExpressionParser parser = new SpelExpressionParser(); 
		
		Expression exp = parser.parseExpression("new String('hello world').toUpperCase()");  
		String message = exp.getValue(String.class);  
		System.out.println(message);  
		
		System.out.println(parser.parseExpression("'hello world'.toUpperCase()").getValue());  
	}  
}
	