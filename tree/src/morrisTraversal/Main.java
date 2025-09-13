package morrisTraversal;

import java.util.function.Predicate;

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
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(30);
		root.left.left = new Node(-2);
		root.left.right = new Node(6);
		root.right.right = new Node(40);
		root.left.left.right = new Node(2);
		root.left.right.right = new Node(8);
		root.left.left.right.left = new Node(-1);
		
		
		morrisTraversal(root);
		
		

	}

	private static void morrisTraversal(Node root) 
	{
		Node curr = root;
		
		while(curr != null)
		{
			if(curr.left == null)
			{
				System.out.print(curr.data+" ");
				curr=curr.right;
			}
			else 
			{
				Node pre = findPre(curr);
				if(pre.right == null)
				{
					pre.right=curr;
					curr=curr.left;
					
				}
				else
				{
					pre.right=null;
					System.out.print(curr.data+" ");
					curr=curr.right;
				}
			}
		}
		System.out.println();
		
	}

	private static Node findPre(Node curr) 
	{
			Node pre =curr.left;
			
			while(pre.right!=null && pre.right != curr)
			{
				pre=pre.right;
			}
			return pre;
	}

}
