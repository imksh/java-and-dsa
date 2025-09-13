package stack;

public class CustomStack 
{
	private static final int DEFAULT_SIZE = 10;
	public int top=-1;
	protected int size;
	protected int[] data;
	
	public CustomStack()
	{
		this(DEFAULT_SIZE);
		size=DEFAULT_SIZE;
	}
	public CustomStack(int size)
	{
		this.data = new int[size];
		this.size=size;
	}
	
	public boolean push(int val) throws Exception
	{
		if(isFull())
		{
			throw new Exception("Stack is full");
		}
		top++;
		data[top]=val;
		return true;
	}
	
	public boolean isFull() {
		
		return top==size-1;
	}
	public int pop() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Stack is Empty");
		}
		top--;
		return data[top];
	}
	
	public boolean isEmpty() {
		
		return top==-1;
	}
	public int peek()
	{
		return data[top];
	}
	
}
