package linkedList;

public class CircularLL 
{
	private Node head;
	private Node tail;
	private int size=0;
	public CircularLL() 
	{
		this.size=0;
	}
	
	public void addFirst(int data)
	{
		Node node = new Node(data);
		if(head==null)
		{
			head=node;
			tail=node;
			return;
		}
		node.next=head;
		head=node;
		tail.next=node;
		size++;
	}
	
	public void addLast(int data)
	{
		Node node = new Node(data);
		if(head==null)
		{
			head=node;
			tail=node;
			return;
		}
		if(tail==null)
		{
			addFirst(data);
			return;
		}
		tail.next=node;
		tail=node;
		node.next=head;
		size++;
	}
	
	public void addAtIndex(int data, int index)
	{
		if(head==null)
		{
			addFirst(data);
			return;
		}
		if(size==index)
		{
			addLast(data);
			return;
		}
		Node node = new Node(data);
		Node temp = head;
		for(int i=1;i<index;i++)
		{
			temp=temp.next;
		}
		node.next=temp.next;
		temp.next=node;
		size++;
		
	}
	
	public int deleteFirst()
	{
		int temp=head.data;
		head=head.next;
		tail.next=head;
		if(head==null)
		{
			tail=null;
		}
		size--;
		return temp;
	}
	
	public int deleteLast()
	{
		if(size<=1)
		{
			return deleteFirst();
		}
		int temp = tail.data;
		Node tempNode = head;
		for(int i=1;i<size;i++)
		{
			tempNode=tempNode.next;
		}
		tail=tempNode;
		tail.next=head;
		size--;
		return temp;
	}
	
	public int deleteAtIndex(int index)
	{
		if(index==0)
		{
			return deleteFirst();
		}
		if(index==size-1)
		{
			return deleteLast();
		}
		Node temp = head;
		for(int i=1;i<index;i++)
		{
			temp=temp.next;
		}
		int val=temp.next.data;
		temp.next=temp.next.next;
		return val;
	}
	
	public int findValue(int index)
	{
		Node tempNode= head;
		for(int i=0;i<index;i++)
		{
			tempNode=tempNode.next;
		}
		return tempNode.data;
	}
	public Node findNode(int val)
	{
		Node tempNode = head;
		while(tempNode.next!=null) 
		{
			if(val==tempNode.data)
			{
				return tempNode;
			}
			tempNode=tempNode.next;
		}
		return null;
	}
	
	public void display()
	{
		Node temp = head;
		do 
		{
			System.out.print(temp.data + " -> ");
			temp=temp.next;
		}while(temp!=head);
		System.out.println("HEAD");
	}
	

	private class Node
	{
		private int data;
		private Node next;
		
		public Node(int data) 
		{
			this.data=data;
		}
		
//		public Node(int data,Node next) 
//		{
//			this.data=data;
//			this.next=next;
//		}
	}
}
