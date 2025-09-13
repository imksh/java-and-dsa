package stack1;

import java.util.Stack;

public class Main 
{

	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("search 20 : " + stack.search(20));
		
		System.out.println("isEmpty : "+ stack.isEmpty());
		
		System.out.println("peek element : "+stack.peek());
		
		while(!stack.isEmpty())
		{
			System.out.println("Poped : "+stack.pop());
		}
	}

}
