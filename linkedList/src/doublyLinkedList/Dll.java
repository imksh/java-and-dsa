package doublyLinkedList;
public class Dll 
{
	class Node
	{
		Node prev;
		Node next;
		int data;
		Node(int data)
		{
			this.data=data;
		}
	}
	
	Node head;
	Node tail;
	int size=0;
	
	public void addLast(int data) 
	{
		Node node = new Node(data);
		if(head==null)
		{
			head=node;
			tail = node;
		}
		else 
		{
			tail.next=node;
			node.prev= tail;
			tail=node;
		}
		size++;
		
	}
	
	public void addFirst(int data) 
	{
		Node node = new Node(data);
		if(head==null)
		{
			head=node;
			tail = node;
		}
		else 
		{
			node.next=head;
			head.prev=node;
			head=node;
			
		}
		size++;
	}
	
	public void print() 
	{
		Node curr = head;
		while(curr!=null)
		{
			System.out.print(curr.data + " <-> ");
			curr=curr.next;
		}
		System.out.println("NULL");
		
	}
	
	public void printFordward() 
	{
		Node curr = head;
		System.out.print("Head =>");
		while(curr!=null)
		{
			System.out.print(curr.data + " <-> ");
			curr=curr.next;
		}
		System.out.println("NULL");
		
	}
	
	public void printBackward() 
	{
		Node curr = tail;
		System.out.print("Tail =>");
		while(curr!=null)
		{
			System.out.print(curr.data + " <-> ");
			curr=curr.prev;
		}
		System.out.println("NULL");
		
	}
	
	
	public void deleteAtPosition(int p) 
	{
		if(p<0 || p>=size)
		{
			System.out.println("Invalid position");
			return;
		}
		
		if(p==0)
		{ 
			deleteFirst();
			return;
		}
		
		if(p==size-1)
		{
			deleteLast();
			return;
		}
		
		Node curr = head;
		
		int i=0;
		while(curr!=null && i<p-1)
		{
			i++;
			curr=curr.next;
		}
		curr.next.next.prev=curr;
		curr.next=curr.next.next;
		size--;
		
	}

	private void deleteFirst() 
	{
		if(head==null)
		{
			return;
		}
		head=head.next;
		if(head==null)
		{
			tail=null;
		}
		else 
		{
			head.prev=null;
		}
		size--;
	}

	private void deleteLast() 
	{
		if(head==null) return;
		tail=tail.prev;
		if(tail==null)
		{
			head=null;
		}
		else 
		{
			tail.next=null;
			
		}
		size--;
		
	}
	
	public void deleteByValue(int val) 
	{
		if(head==null) return;
		
		if(head.data==val)
		{
			deleteFirst();
			return;
		}
		
		if(tail.data==val)
		{
			deleteLast();
			return;
		}
		
		Node curr = head;
		
		while(curr!=null && val!=curr.data)
		{
			curr=curr.next;
		}
		
		if(curr==null)
		{
			System.out.println("No data found");
			return;
		}
		
		curr.prev.next=curr.next;
		curr.next.prev=curr.prev;
		size--;
		
	}
	
	public void reverse() 
	{
		Node curr = head;
		
		while(curr!= null)
		{
			Node temp = curr.next;
			curr.next=curr.prev;
			curr.prev=temp;
			curr=temp;
		}
		
		Node temp = head;
		head=tail;
		tail = temp;
		
	}
	
	public int mid()
	{
		Node fast = head;
		Node slow = head;
		if(head==null) 
		{
			System.out.println("List is Empty");
			return -1;
		}
		while(fast!=null && fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		
		return slow.data;
	}

	public static void main(String[] args) 
	{
		Dll list = new Dll();
		
		list.addFirst(10);
		list.print();
		list.addFirst(20);
		list.print();
		list.addLast(30);
		list.print();
		list.addLast(40);
		list.print();
		list.deleteAtPosition(2);
		list.print();
		list.deleteByValue(40);
		list.print();
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.print();
		list.reverse();
		list.print();
		System.out.println(list.mid());

	}

}
