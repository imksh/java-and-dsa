package validateBst;


public class Main 
{
	static class Node 
	{
		int val;
		Node left;
		Node right;
		public Node( int data) 
		{
			this.val=data;
			this.left=null;
			this.right=null;
		}
	}
	

	public static void printInorder(Node node)
	{
		if(node == null) return;
		printInorder(node.left);
		System.out.print(node.val+" ");
		printInorder(node.right);
	}

	public static void main(String[] args) 
	{
		
		Node root = new Node(10);
		root.left=new Node(5);
		root.right=new Node(15);
		root.right.left=new Node(12);
		root.right.right=new Node(20);
		
		
		System.out.println(validate(root));
		

	}
	
	
	private static boolean validate(Node node) 
	{
		return helper(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private static boolean helper(Node node, int min , int max) 
	{
		if(node==null) return true;
		
		if(node.val<=min || node.val>=max)
		{
			return false;
		}
		
		
		return helper(node.left, min, node.val) && helper(node.right, node.val, max);
	}

}
