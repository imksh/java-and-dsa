package burnTree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

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
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(3);
		root.left.right = new Node(4);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.right.right = new Node(8);
		root.left.right.right.left = new Node(9);
		root.left.right.right.right = new Node(10);
		
		System.out.println("Min time to burn the tree : "+ minTime(root,8));
	}
	
	private static int minTime(Node root, int t) 
	{
		HashMap<Node, Node> map = new HashMap<>();
		Node target = helper(root,map,8);
		return burnTree(target,map);
	}
	
	private static int burnTree(Node target, HashMap<Node, Node> map) 
	{
		Queue<Node> q = new LinkedList<>();
		HashSet<Node> visited = new HashSet<>();
		
		q.offer(target);
		visited.add(target);
		
		int time=0;
		
		while(!q.isEmpty())
		{
			int size = q.size();
			boolean flag = false;
			for(int i=0;i<size;i++)
			{
				Node curr = q.poll();
				
				if(curr.left!=null && !visited.contains(curr.left))
				{
					q.offer(curr.left);
					visited.add(curr.left);
					flag=true;
				}
				
				if(curr.right!=null  && !visited.contains(curr.right))
				{
					q.offer(curr.right);
					visited.add(curr.right);
					flag=true;
				}
				
				if(map.containsKey(curr)  && !visited.contains(map.get(curr)))
				{
					q.offer(map.get(curr));
					visited.add(map.get(curr));
					flag=true;
				}
			}
			if(flag) time++;
		}
		
		
		
		return time;
		
	}

	private static Node helper(Node root, HashMap<Node, Node> map, int t) 
	{
		Queue<Node> q  = new LinkedList<>();
		q.offer(root);
		Node target =null;
		while(!q.isEmpty())
		{
			int size = q.size();
			for(int i=0;i<size;i++)
			{
				Node curr = q.poll();
				if(curr.data==t)
				{
					target=curr;
				}
				if(curr.left!=null)
				{
					map.put(curr.left, curr);
					q.offer(curr.left);
				}
				if(curr.right!=null)
				{
					map.put(curr.right, curr);
					q.offer(curr.right);
				}
			}
		}
		return target;
		
	}
}
