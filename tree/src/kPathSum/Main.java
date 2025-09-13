package kPathSum;

import java.util.ArrayList;


public class Main 
{
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

	public static void main(String[] args) 
	{
		Node root = new Node(1);
		root.left = new Node(3);
		root.right = new Node(-1);
		root.left.left = new Node(2);
		root.left.right = new Node(1);
		root.right.left = new Node(4);
		root.right.right = new Node(5);
		root.left.left.left = new Node(1);
		root.right.right.left = new Node(2);
		root.right.right.right = new Node(6);
		
		
		int k = 5;
		int count = find(root,new ArrayList<Integer>(),k,0);
		System.out.println(count);

	}

	private static int find(Node node, ArrayList<Integer> list, int k,int count) 
	{
		if(node == null)
		{
			return count;
		}
		
		list.add(node.data);
		
		count+= check(list,k);
		
		count = find(node.left, list, k, count);
		
		count = find(node.right, list, k, count);
		
		list.remove(list.size()-1);
		
		return count;
	}

	private static int check(ArrayList<Integer> list, int k) 
	{
		int sum =0;
		int count=0;
		
		for (int i = list.size() - 1; i >= 0; i--) {
	        sum += list.get(i);
	        if (sum == k) 
	        {
	        		System.out.println(list);
	            count++;
	        }
	    }
		
		return count;
	}

}
