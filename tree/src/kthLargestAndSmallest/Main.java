package kthLargestAndSmallest;


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
	static int ans = -1;
	static int count = 0;
	
	public void  insert(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			root = insertRecHelper(root,arr[i]);
		}
		
	}
	
	public void  insertRec(int val)
	{
		root = insertRecHelper(root,val);
	}
	
	private Node insertRecHelper(Node node, int val) 
	{
		if(node == null)
		{
			Node newNode = new Node(val);
			return newNode;
		}
		
		if(val<node.val)
		{
			node.left= insertRecHelper(node.left,val);
		}
		else if(val>node.val)
		{
			node.right= insertRecHelper(node.right,val);
		}
		return node;
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
		int[] arr={5,3,7,2,4,8};
		Main tree = new Main();
		
		tree.insert(arr);
		System.out.println();
		printInorder(tree.root);
		int k =3;
		
		count = 0;
		ans=-1;
		System.out.println("Smallest: "+tree.kthSmallest(tree.root,3));
		
		
		count = 0;
		ans=-1;
		System.out.println("Largest: "+tree.kthLargest(tree.root,3));

	}

	private int kthSmallest(Node node, int k) 
	{
		if(node == null) return ans;
		
		kthSmallest(node.left, k);
		count++;
		if(count==k)
		{
			ans= node.val;
			return ans;
		}
		kthSmallest(node.right, k);
		return ans;
		
	}

	private int kthLargest(Node node, int k) 
	{
		if(node == null) return ans;
		
		kthSmallest(node.right, k);
		count++;
		if(count==k)
		{
			ans= node.val;
			return ans;
		}
		kthSmallest(node.left, k);
		return ans;
	}


}
