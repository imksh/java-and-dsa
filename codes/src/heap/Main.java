package heap;

import java.util.ArrayList;

public class Main 
{

	public static void main(String[] args) 
	{
		Heap heap = new Heap();
		heap.insert(4);
		heap.insert(2);
		heap.insert(5);
		heap.insert(1);
		heap.insert(24);
		heap.insert(20);
		heap.insert(9);
		heap.insert(10);
		heap.display();
		System.out.println();
		System.out.println(heap.get());
		System.out.println();
		heap.display();
		
	}
	
}

class Heap
{
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	public void insert(int n)
	{
		list.add(n);
		heapUp(list.size()-1);
	}
	public void display()
	{
		for(int i=0;i<list.size();i++) System.out.println(list.get(i));
	}
	
	private void heapUp(int idx)
	{
		if(idx==0)return;
		int parent = (idx-1)/2;
		if(list.get(parent)>=list.get(idx)) return;
		
		int temp= list.get(parent);
		list.set(parent,list.get(idx));
		list.set(idx,temp);
		
		heapUp(parent);
	}
	
	public int get()
	{
		int data = list.get(0);
		list.set(0,list.get(list.size()-1));
		list.remove(list.size()-1);
		heapDown(0);
		return data;
	}

	private void heapDown(int idx) 
	{
		if(idx>=list.size())return;
		int left = 2*idx+1;
		int right = 2*idx+2;
		if(list.size()>right && list.get(right)>list.get(left) && list.get(idx)<list.get(right))
		{
			int temp= list.get(right);
			list.set(right,list.get(idx));
			list.set(idx,temp);
			heapDown(right);
		}
		else if(list.size()>left && list.get(idx)<list.get(left))
		{
			int temp= list.get(left);
			list.set(left,list.get(idx));
			list.set(idx,temp);
			heapDown(left);
		}
		
	}
}







