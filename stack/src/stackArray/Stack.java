package stackArray;

public class Stack 
{
	private int[] arr;
	private int size;
	private int top=-1;
	
	public Stack(int size) 
	{
		this.size=size;
		arr = new int[size];
	}
	
	public void push(int val) 
	{
		if(this.isFull())
		{
			System.out.println("Stack Overflow...");
			return;
		}
		arr[++top]=val;
	}
	
	public int size() 
	{
		return top+1;
	}
	
	public int pop() 
	{
		if(this.isEmpty())
		{
			System.out.println("Stack Underflow");
			return -1;
		}
		int data = arr[top];
		top--;
		return data;
	}
	
	public int peek() 
	{
		if(this.isEmpty())
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		return arr[top];
	}
	
	public int search(int val) 
	{
		int i=top;
		int p = 1;
		while(i>=0)
		{
			if(arr[i]==val)
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
		return top==-1;
	}
	
	private boolean isFull() 
	{
		return top==size-1;
	}
	
	public static void main(String[] args) 
	{
		Stack stack = new Stack(10);
		
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
