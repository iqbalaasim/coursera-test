package com.assignment7;
import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser;  
import org.springframework.expression.spel.support.StandardEvaluationContext;  

public class CalcTest {
	public static void main(String[] args) {  
		Calc calculation=new Calc();  
		StandardEvaluationContext context=new StandardEvaluationContext(calculation);  
		      
		ExpressionParser parser = new SpelExpressionParser();  
		parser.parseExpression("number").setValue(context,"5");  
		      
		System.out.println(calculation.cube());  
		}  
}  


