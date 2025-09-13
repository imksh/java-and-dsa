package flattenLL;

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
		root.right.right = new Node(6);
		
		convert(root);
		
		Node curr = root;
		while(curr != null)
		{
			System.out.print(curr.data+"->");
			curr=curr.right;
		}
		System.out.println("NULL");

	}

	private static void convert(Node root) 
	{
		Node curr  = root;
		
		while(curr != null)
		{
			if(curr.left!=null)
			{
				Node pre = findPre(curr);
				pre.right=curr.right;
				curr.right=curr.left;
				curr.left=null;
				
			}
			curr=curr.right;
		}
		
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
