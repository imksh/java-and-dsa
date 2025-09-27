package stack;

import java.util.Stack;

public class paindromeString 
{

	public static void main(String[] args) 
	{
		Stack<Character> stack = new Stack<>();
		String s ="madam";
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<s.length();i++)
		{
			stack.push(s.charAt(i));
		}
		while(!stack.isEmpty())
		{
			sb.append(stack.pop());
		}
		String s1=sb.toString();
		
		if(s.equals(s1)) 
		{
			System.out.println("It is plaindrome");
		}
		else 
		{
			System.out.println("It is not a plaindrome");
		}
		

	}

}
