package stackLinkedList;


public class Stack 
{
	private class Node 
	{
		int data;
		Node next;
		
		public Node(int data) 
		{
			this.data = data;
			next=null;
		}
	}
	
	Node head = null;
	
	public void push(int val) 
	{
		Node node = new Node(val);
		if(head==null)
		{
			head=node;
		}
		else
		{
			node.next=head;
			head=node;
		}
	}
	
	public int size() 
	{
		int count =0;
		Node curr = head;
		while(curr!=null)
		{
			curr=curr.next;
			count++;
		}
		return count;
	}
	
	public int pop() 
	{
		if(this.isEmpty())
		{
			System.out.println("Stack Underflow...");
			return -1;
		}
		int data = head.data;
		head=head.next;
		return data;
	}
	
	public int peek() 
	{
		if(this.isEmpty())
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		return head.data;
	}
	
	public int search(int val) 
	{
		int p = 1;
		Node curr = head;
		while(curr!=null)
		{
			if(curr.data==val)
			{
				return p;
			}
			p++;
			curr=curr.next;
		}
		return -1;
	}
	
	public boolean isEmpty() 
	{
		return head==null;
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
