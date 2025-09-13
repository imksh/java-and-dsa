package inorderPreorderSuccessor;


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
		int[] arr={1,2,6,8,9};
		Main tree = new Main();
		tree.insert(arr);
		
		
		
		

	}
}
