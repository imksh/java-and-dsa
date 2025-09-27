package singlyLinkedList;

public class Sll 
{
	
	class Node
	{
		int data;
		Node next = null;
		Node(int val)
		{
			this.data = val;
		}
	}
	
	
	Node head;
	Node tail;
	int size;
	
	//1. Insert at the begining
	public void insertAtBegining(int data)
	{
		Node node = new Node(data);
		if(head==null)
		{
			head=node;
			tail=node;
		}
		else 
		{
			node.next=head;
			head=node;
		}
		size++;
	}
	
	//2. Insert at the end
	public void insertAtEnd(int data)
	{
		Node node = new Node(data);
		if(head==null)
		{
			head=node;
			tail=node;
		}
		else 
		{
			tail.next=node;
			tail=tail.next;
		}
		size++;
	}
	
	//3.insert at position
		public void insertAtPosition(int k,int data)
		{
			if(k<0)
			{
				System.out.println(k+" position doesnot exist");
				return;
			}
			if(k==0)
			{
				insertAtBegining(data);
				return;
			}
			int i =1;
			Node temp = head;
			while(i<k)
			{
				i++;
				temp=temp.next;
				if(temp==null)
				{
					System.out.println(k+" position doesnot exist");
					return;
				}
			}
			if(temp.next==null)
			{
				insertAtEnd(data);
				return;
			}
			
			Node node = new Node(data);
			Node n1=temp.next;
			temp.next = node;
			node.next=n1;
			
		}
	
	//4.delete at start
		public int deleteAtStart()
		{
			int val;
			if(head==null)
			{
				System.out.println("Linked list is empty");
				return -1;
			}
			else 
			{
				val = head.data;
				head=head.next;
			}
			size--;
			return val;
		}
	
	//5.delete at end
	public int deleteAtEnd()
	{
		int val;
		if(tail==null)
		{
			System.out.println("Linked list is empty");
			return -1;
		}
		else 
		{
			val = tail.data;
			Node temp= head;
			while(temp.next!=tail)
			{
				temp=temp.next;
			}
			temp.next=null;
			tail=temp;
			
		}
		size--;
		return val;
	}
	
	//6. delete by value
	
	public int deleteByValue(int val)
	{  
		if(tail==null)
		{
			return -1;
		}
		
		Node temp = head;
		if(head.data==val)
		{
			head=head.next;
			if(head==null)
			{
				tail=null;
			}
			size--;
			return val;
		}
		while(temp.next!=null && temp.next.data!=val)
		{
			temp=temp.next;
		}
		
		if(temp.next==null) return -1;
		
		if(temp.next.next==null) 
		{
			temp.next=null;
			tail=temp;
			return val;
		}
		
		temp.next=temp.next.next;
		size--;
		return val;
	}
	
	//7. Update
	
	public void update(int val1, int val2)
	{
		Node curr = head;
		boolean flag = false;
		while(curr!=null)
		{
			if(curr.data==val1)
			{
				curr.data= val2;
				flag=true;
				break;
			}
			curr=curr.next;
			
		}
		if(flag)
		{
			System.out.println("Updated");
		}
		else 
		{
			System.out.println("Not found");
		}
	}
	
	
	
	//8. Search
	
		public boolean search(int val)
		{
			Node curr = head;
			while(curr!=null)
			{
				if(curr.data==val)
				{
					return true;
				}
				curr=curr.next;
				
			}
			return false;
		}
	
	//9. length
		
	public int length()
	{
		int count=0;
		Node curr = head;
		while(curr!=null)
		{
			count++;
			curr=curr.next;
		}
		return count;
	}
	
	
	//10. Print
	public void print()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
		System.out.println("NULL");
	}
	
	
	
	//11. reverse
	public void reverse()
	{
		Node curr = head;
		Node prev=null;
		while(curr!=null)
		{
			Node node1 = curr.next;
			curr.next=prev;
			prev=curr;
			curr=node1;
		}
		tail=head;
		head=prev;
	}
	
	//12. mid (Slow and fast pointer)
	
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
	
	//13. sort
	
	public void sort()
	{
		Node i = head;
		if(head==null || head.next==null) return;
//		while(i.next!=null)
//		{
//			Node j = i.next;
//			while(j!=null)
//			{
//				if(i.data>j.data)
//				{
//					int temp = i.data;
//					i.data=j.data;
//					j.data=temp;
//				}
//				j=j.next;
//			}
//			i=i.next;
//		}
		
		
		for(i=head;i!=null;i=i.next)
		{
			for(Node j=head;j.next!=null;j=j.next)
			{
				if(j.data>j.next.data)
				{
					int temp = j.data;
					j.data=j.next.data;
					j.next.data=temp;
				}
			}
		}
	}
	

	public static void main(String[] args) 
	{
		Sll ll = new Sll();
		
		ll.insertAtEnd(10);
		ll.insertAtEnd(20);
		ll.insertAtEnd(30);
		ll.insertAtEnd(40);
		ll.insertAtEnd(50);
		ll.insertAtEnd(60);
		
		ll.print();
		
		System.out.println("Deleted at end val : "+ll.deleteAtEnd());
		
		ll.print();
		
		System.out.println("Deleted at start val : "+ll.deleteAtStart());
		
		ll.print();
		
		ll.reverse();
		
		ll.print();
		
		System.out.println(ll.deleteByValue(50));
		ll.print();
		
		ll.update(10, 400);
		
		ll.print();
		
		System.out.println(ll.search(400));
		
		System.out.println(ll.length());
		System.out.println(ll.size);
		
		ll.insertAtBegining(400);
		ll.print();
		
		System.out.println(ll.mid());
		ll.print();
		ll.sort();
		ll.print();

	}
	
	
}
