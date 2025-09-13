package stackArrayList;

import java.util.ArrayList;

public class Stack 
{
	ArrayList<Integer> list = new ArrayList<>();
	public void push(int val) 
	{
		list.add(val);
	}
	
	public int size() 
	{
		return list.size();
	}
	
	public int pop() 
	{
		if(this.isEmpty())
		{
			System.out.println("Stack Underflow...");
			return -1;
		}
		return list.remove(list.size()-1);
	}
	
	public int peek() 
	{
		if(this.isEmpty())
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		return list.get(list.size()-1);
	}
	
	public int search(int val) 
	{
		int i=list.size()-1;
		int p = 1;
		while(i>=0)
		{
			if(list.get(i)==val)
			{
				return p;
			}
			p++;
			i--;
		}
		return -1;
	}
	
	public boolean isEmpty() 
	{
		return list.isEmpty();
	}
	

	public static void main(String[] args) 
	{
		Stack stack = new Stack();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println("position of 20 : "+stack.search(20));
		
		System.out.println("isEmpty : "+ stack.isEmpty());
		
		System.out.println("peek element : "+stack.peek());
		
		System.out.println("size : "+stack.size());
		
		while(!stack.isEmpty())
		{
			System.out.println("Poped : "+stack.pop());
		}
		
		System.out.println("size : "+stack.size());

	}

}
