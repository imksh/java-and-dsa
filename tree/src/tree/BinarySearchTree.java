package tree;

public class BinarySearchTree 
{
	Node root;
	public BinarySearchTree()
	{
		
	}
	public BinarySearchTree(int val)
	{
		root=new Node(val);
	}
	
	//Insertion in tree
	
	void insert(int val)
	{
		root=insertHelp(root,val);
	}
	
	private Node insertHelp(Node node, int val)
	{
		if(node==null)
		{
			node=new Node(val);
			return node;
		}
		if(val<node.val)
		{
			node.left = insertHelp(node.left,val);
		}else 
		{
			node.right = insertHelp(node.right,val);
		}
		node.height = Math.max(height(node.left), height(node.right))+1;
		return node;
	}
	
	public void populate(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			insert(arr[i]);
		}
	}
	
	public void populateSorted(int[] arr)
	{
		populateSortedHelp(arr, 0, arr.length);
	}
	
	private void populateSortedHelp(int[] arr, int start, int end)
	{
		if(start>=end)
		{
			return;
		}
		int mid=start + (end - start) / 2;
		this.insert(arr[mid]);
		populateSortedHelp(arr, start, mid);
		populateSortedHelp(arr,mid+1,end);
		
	}
	
	//Tree Traversal
	
	public void preOrder()
	{
		preOrderHelper(root);
		System.out.println();
	}
	
	
	private void preOrderHelper(Node node) 
	{
		if(node==null)
		{
			return;
		}
		System.out.print(node.val + " ");
		preOrderHelper(node.left);
		preOrderHelper(node.right);
	}
	
	public void inOrder()
	{
		inOrderHelper(root);
		System.out.println();
	}
	
	
	private void inOrderHelper(Node node) 
	{
		if(node==null)
		{
			return;
		}
		inOrderHelper(node.left);
		System.out.print(node.val + " ");
		inOrderHelper(node.right);
	}
	
	public void posrOrder()
	{
		postOrderHelper(root);
		System.out.println();
	}
	
	
	private void postOrderHelper(Node node) 
	{
		if(node==null)
		{
			return;
		}
		postOrderHelper(node.left);
		postOrderHelper(node.right);
		System.out.print(node.val + " ");
	}
	
	//Display Tree
	
 	void display()
	{
		displayHelp(root,0);
	}
	
	private void displayHelp(Node node,int level) 
	{
		if(node==null)
		{
			return;
		}
		displayHelp(node.right, level+1);
		if(level!=0)
		{
			for(int i=0;i<level-1;i++)
			{
				System.out.print("|\t");
			}
			System.out.println("|-------->" + node.val);
		}else 
		{
			System.out.println(node.val);
		}
		displayHelp(node.left, level+1);
	}
	
	//Height of Tree
	
		public int height()
		{
			return height(root);
		}
		
		private int height(Node node)
		{
			if(node==null)
			{
				return -1;
			}
			return node.height;
		}
		
	
	//Additional Functions 
	public boolean balanced()
	{
		return balancedHelp(root);
	}
	
	private boolean balancedHelp(Node node)
	{
		if(node==null)
		{
			return true;
		}
		return Math.abs(height(node.left) - height(node.right)) <=1 && balancedHelp(node.left) && balancedHelp(node.right);
	}
	
	public boolean isEmpty()
	{
		if(this.root==null)
		{
			return true;
		}
		return true;
	}

	//Node Class
	
	private class Node
	{
		int val;
		int height;
		Node left;
		Node right;
		
		public Node() 
		{
			
		}
		public Node(int val)
		{
			this.val=val;
		}
	}
}
