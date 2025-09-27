package linkedList;

public class LL 
{
	private Node head;
	private Node tail;
	private int size=0;
	public LL() 
	{
		this.size=0;
	}
	
	public void addFirst(int data)
	{
		Node node = new Node(data);
		node.next=head;
		head=node;
		if(tail==null)
		{
			tail=head;
		}
		size++;
	}
	
	public void addLast(int data)
	{
		if(tail==null)
		{
			addFirst(data);
			return;
		}
		Node node = new Node(data);
		tail.next=node;
		tail=node;
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
	public void addRec(int val,int index)
	{
		head = addrec(val, index, head);
	}
	private Node addrec(int val, int index, Node node)
	{
		if(index==0)
		{
			Node temp = new Node(val);
			temp.next=node;
			return temp;
		}
		node.next = addrec(val, index--, node.next);
		return node;
	}
	
	public int deleteFirst()
	{
		int temp=head.data;
		head=head.next;
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
		for(int i=1;i<size-1;i++)
		{
			tempNode=tempNode.next;
		}
		tail=tempNode;
		tail.next=null;
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
		while(temp!=null) 
		{
			System.out.print(temp.data + " -> ");
			temp=temp.next;
		}
		System.out.println("END");
	}
	public void reverse()
	{
		reverseLL(head);
	}
	private void reverseLL(Node node)
	{
		if(node==tail)
		{
			head=tail;
			return;
		}
		reverseLL(node.next);
		tail.next=node;
		tail=node;
		tail.next=null;
	}
	
	

	private class Node
	{
		private int data;
		private Node next;
		
		public Node(int data) 
		{
			this.data=data;
		}
		
	}
}
