package treeCreation;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Tree 
{
	Queue<Node> q = new LinkedList<>();
	static class Node 
	{
		int data;
		Node left;
		Node right;
		public Node( int data) 
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	Node root=null;
	public boolean addAll(int[] arr)
	{
		Queue<Integer> temp = new LinkedList<>();
		for(int i=0;i<arr.length;i++)
		{
			temp.offer(arr[i]);
		}
		if(root == null)
		{
			Node node = new Node(temp.poll());
			q.offer(node);
			while(true)
			{
				int size = q.size();
				for(int i=0;i<q.size();i++)
				{
					if(temp.isEmpty()) break;
					Node curr = q.poll();
					
					
					
				}
				
			}
		}
		return true;
	}

	public static void main(String[] args) 
	{
		
		Node root = new Node(7);
		root.left = new Node(5);
		root.left.left = new Node(3);
		root.left.left.left = new Node(1);
		root.left.left.right = new Node(4);
		root.left.right = new Node(6);
		
		root.right = new Node(12);
		root.right.left = new Node(9);
		root.right.left.left = new Node(8);
		root.right.left.right = new Node(10);
		root.right.right = new Node(15);
		root.right.right.left = new Node(13);
		root.right.right.right = new Node(17);
		
	}

}
