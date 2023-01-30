package com.gl.lab3.balancingbrackets;

import java.util.Stack;

public class BalancingBrackets {
	
	public Boolean checkingBracketsBalanced(String bracketExpression) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i=0;i< bracketExpression.length();i++)
			
		{
			
			char character = bracketExpression.charAt(i);
			
			if(character =='(' ||  character =='[' || character =='{')
				
			{
				stack.push(character);
				continue;
				
			}
			
			if(stack.isEmpty())
				
				return false;
			
			char c;
			
			switch (character) {
			
			case '}' :
				
				c = stack.pop();
				
				if(c =='(' || c =='[')
					
					return false;
				   
				    break;
				    
            case ')' :
				
				c = stack.pop();
				
				if(c =='{' || c =='[')
					
					return false;
				   
				    break; 
				    
           case ']' :
				
				c = stack.pop();
				
				if(c =='{' || c =='(')
					
					return false;
				   
				    break; 
			}
		}
		
		return (stack.isEmpty());
		
	}

	public static void main(String[] args) {
		
		BalancingBrackets balancingBrackets = new BalancingBrackets();
		
		String bracketExpression = "([[{}]])";
		
		Boolean result;
		
		result = balancingBrackets.checkingBracketsBalanced(bracketExpression);
		
		if(result)
			
			System.out.println("The entered String has Balanced Brackets");
		
		else
			
			System.out.println("The entered String do not contain Balanced Brackets");

	}

	

}
