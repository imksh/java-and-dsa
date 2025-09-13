package assendingPriorityQueue;

public class Queue 
{
	int[] arr;
	int max;
	int nItems;
	
	public Queue(int capacity) 
	{
		max=capacity;
		nItems=0;
		arr=new int[max];
	}
	
	public void enqueue(int val)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
			return;
		}
		if(isEmpty())
		{
			arr[0]=val;
		}
		else
		{

			int i;
			for(i=nItems-1;i>=0;i--)
			{
				if(val<arr[i])
				{
					arr[i+1]=arr[i];
				}
				else
				{
					break;
				}
			}
			arr[i+1]=val;
		}
		System.out.println("Inserted: "+val);
		nItems++;
	}
	
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		
		int data = arr[0];
		for(int i=0;i<nItems-1;i++)
		{
			arr[i]=arr[i+1];
		}
		nItems--;
		System.out.println("Removed: "+data);
		return data;
	}
	
	public void print()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return;
		}
		System.out.println("Priority Queue in asscending");
		for(int i = 0;i < nItems;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		return arr[0];
	}

	private boolean isEmpty() 
	{
		return nItems==0;
	}

	private boolean isFull() 
	{
		return nItems==max;
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
		queue.dequeue();
		queue.enqueue(14);
		queue.enqueue(60);
		queue.print();

	}

}
