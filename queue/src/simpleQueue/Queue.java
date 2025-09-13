package simpleQueue;

public class Queue 
{
	private int front;
	private int rear;
	private int size;
	private int[] arr;
	private int capacity;
	
	public Queue(int capacity) 
	{
		this.capacity=capacity;
		arr= new int[capacity];
		this.front=0;
		this.rear=-1;
		this.size=0;
	}
	
	public void enqueue(int val)
	{
		if(isFull())
		{
			System.out.println("Queue is Full");
			return;
		}
		rear++;
		size++;
		arr[rear]=val;
		System.out.println("inserted : "+val);
	}
	
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		int data = arr[front];
		front++;
		size--;
		System.out.println("removed : "+data);
		return data;
	}
	
	public int length()
	{
		return size;
	}
	
	public void print()
	{
		if(this.isEmpty())
		{
			System.out.println("Queue is empty");
			return;
		}
		for(int i=front;i<=rear;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	
	public int front()
	{
		if(this.isEmpty())
		{
			System.out.println("Queue is empty");
			return -1;
		}
		return arr[front];
	}
	public int rear()
	{
		if(this.isEmpty())
		{
			System.out.println("Queue is empty");
			return -1;
		}
		return arr[rear];
	}

	public boolean isFull() 
	{
		return size==capacity;
	}

	public boolean isEmpty() 
	{
		return size==0;
	}

	public static void main(String[] args) 
	{
		Queue queue = new Queue(5);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		
		queue.print();
		queue.length();
		queue.dequeue();
		queue.length();
		queue.print();
		System.out.println("front: "+ queue.front());
		System.out.println("rear: "+ queue.rear());
		

	}

}
