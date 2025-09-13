package tree;

import java.util.Scanner;

public class Tree 
{
	Scanner sc = new Scanner(System.in);
	private Node root;
	
	public Tree() 
	{
		
	}
	
	
	
	public void add()
	{
		
		System.out.println("Enter the Root Node value : ");
		int val=sc.nextInt();
		root = new Node(val);
		addrec(sc,root);
	}
	
	private void addrec(Scanner sc, Node node)
	{
		System.out.println("Do you want to Enter Left Node of " +  node.val);
		boolean choose = sc.nextBoolean();
		if(choose)
		{
			System.out.println("Enter the Left Node value : ");
			int val=sc.nextInt();
			Node left = new Node(val);
			node.left = left;
			addrec(sc,left);
		}
		
		System.out.println("Do you want to Enter Right Node of " +  node.val);
		choose = sc.nextBoolean();
		if(choose)
		{
			System.out.println("Enter the Right Node value : ");
			int val=sc.nextInt();
			Node right = new Node(val);
			node.right = right;
			addrec(sc,right);
		}
	}
	
	public void display()
	{
		displayHelper(root,0);
	}
	
	private void displayHelper(Node node, int level)
	{
		if(node==null)
		{
			return;
		}

		displayHelper(node.right, level+1);

		if(level!=0)
		{
			for(int i=0;i<level-1;i++)
			{
				System.out.print("|\t");
			}
			System.out.println("|------->" + node.val);
			
		}
        else
		{
			System.out.println(node.val);
		}
		displayHelper(node.left, level+1);
		
	}
	
	
	private class Node
	{
		int val;
		Node left;
		Node right;
		
		public Node() 
		{
			
		}
		public Node(int val)
		{
			this.val=val;
		}
		public Node(int val, Node left, Node right)
		{
			this.val=val;
			this.left = left;
			this.right = right;
		}
		
	}

}
