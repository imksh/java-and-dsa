package simpleQueuelinkedList;

public class Queue 
{
	class Node
	{
		int data;
		Node next;
		public Node(int val) 
		{
			this.data=val;
			this.next=null;
		}
	}
	
	private Node front;
	private Node rear;
	private int size;
	
	public Queue() 
	{
		front=rear=null;
		size=0;
	}
	
	public void enqueue(int val)
	{
		Node node = new Node(val);
		if(this.isEmpty())
		{
			front = rear = node;
		}
		else 
		{
			rear.next = node;
			rear= rear.next;
		}
		size++;
		System.out.println("Inserted : "+val);
	}
	
	public int dequeue()
	{
		if(this.isEmpty())
		{
			System.out.println("Queue is empty");
			return -1;
		}
		int data = front.data;
		size--;
		System.out.println("Removed : "+data);
		front=front.next;
		if(front==null)
		{
			rear=null;
		}
		return data;
	}
	
	public void print()
	{
		if(this.isEmpty())
		{
			System.out.println("Queue is empty");
			return;
		}
		Node curr = front;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
	
	public int length()
	{
		return size;
	}
	
	public int front()
	{
		if(this.isEmpty())
		{
			System.out.println("Queue is empty");
			return -1;
		}
		return front.data;
	}
	public int rear()
	{
		if(this.isEmpty())
		{
			System.out.println("Queue is empty");
			return -1;
		}
		return rear.data;
	}

	public boolean isEmpty() 
	{
		return size==0;
	}

	public static void main(String[] args) 
	{
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		
		queue.print();
		System.out.println("length : "+queue.length());
		queue.dequeue();
		System.out.println("length : "+queue.length());
		queue.print();
		System.out.println("front: "+ queue.front());
		System.out.println("rear: "+ queue.rear());

	}

}
