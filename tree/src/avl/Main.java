package avl;

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
	Node root = null;
	public void  insert(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			root = helper(root,arr[i]);
		}
	}
	
	private Node helper(Node node, int val) 
	{
		if(node == null)
		{
			Node newNode = new Node(val);
			return newNode;
		}
		
		if(val<node.val)
		{
			node.left = helper(node.left, val);
		}
		else 
		{
			node.right= helper(node.right, val);
		}
		
		int heightL = height(node.left);
		int heightR = height(node.left);
		int bf = heightL-heightR;
		
		if(bf>1 && val<node.left.val)
		{
			node=rotatell(node);
		}
		if(bf<-1 && val>node.right.val)
		{
			node=rotaterr(node);
		}
		if(bf>1 && val>node.right.val)
		{
			node=rotaterl(node);
		}
		if(bf<-1 && val<node.right.val)
		{
			node=rotatelr(node);
		}
		
		return node;
	}
	
	private Node rotatelr(Node node) 
	{
		Node parent = node;
		Node child = node.left;
		node=child;
		int val = parent.val;
		Node temp = node.right;
		while(temp!=null)
		{
			if(val<temp.val)
			{
				temp=temp.left;
			}
			else 
			{
				temp=temp.right;
			}
		}
		temp=parent;
		
		return node;
	}

	private Node rotaterl(Node node) 
	{
		Node parent = node;
		Node child = node.right;
		node=child;
		int val = parent.val;
		Node temp = node.left;
		while(temp!=null)
		{
			if(val<temp.val)
			{
				temp=temp.left;
			}
			else 
			{
				temp=temp.right;
			}
		}
		temp=parent;
		return node;
	}

	private Node rotaterr(Node node) 
	{
		Node t = node.right.left;
		Node parent = node;
		Node child = node.right;
		node=child;
		node.left=parent;
		parent.right=t;
		return node;
	}

	private Node rotatell(Node node) 
	{
		Node t = node.left.right;
		Node parent = node;
		Node child = node.left;
		node=child;
		node.right=parent;
		parent.left=t;
		return node;
	}

	private int height(Node node) 
	{
		if(node==null) return 0;
		
		return Math.max(height(node.left), height(node.right))+1;
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
		int[] arr={1,2,6,8,9};
		Main tree = new Main();
		tree.insert(arr);
		printInorder(tree.root);
		

	}

}
