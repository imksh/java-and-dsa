package bstInsertion;


public class BST 
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
	
	public void insert(int val)
	{
		Node node = new Node(val);
		if(root == null)
		{
			root= node;
			return;
		}
		
		Node curr = root;
		
		while(curr!=null)
		{
			if(node.val < curr.val)
			{
				if(curr.left==null)
				{
					curr.left=node;
					return;
				}
				curr= curr.left;
			}
			else if(node.val > curr.val)
			{
				if(curr.right==null)
				{
					curr.right=node;
					return;
					
				}
				curr=curr.right;
			}
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
	
	public void delete(int val)
	{
		root = deleteRec(root,val);
	}

	private Node deleteRec(Node node, int val) 
	{
		if(node == null) return null;
		
		if(val<node.val)
		{
			node.left=deleteRec(node.left, val);
		}
		else if(val>node.val)
		{
			node.right=deleteRec(node.right, val);
		}
		else
		{
			if(node.left == null)
			{
				return node.right;
			}
			else if(node.right == null)
			{
				return node.left;
			}
			else
			{
				node.val = minVal(node.right,val);
				
				node = deleteRec(node.right, node.val);
			}
		}
		return node;
	}

	private int minVal(Node node, int val) 
	{
		int min = node.val;
		while(node.left!=null)
		{
			min = node.left.val;
			node=node.left;
		}
		return min;
	}

	public void inorder()
	{
		inorderRec(root);
		System.out.println();
		
	
	}

	private void inorderRec(Node root) 
	{
		if(root==null) return;
		
		inorderRec(root.left);
		System.out.print(root.val+" ");
		inorderRec(root.right);
		
	}

	public static void main(String[] args) 
	{
		BST tree = new BST();
		
		tree.insertRec(50);
		tree.insertRec(30);
		tree.insertRec(40);
		tree.insertRec(10);
		tree.insertRec(20);
		tree.insertRec(60);
		tree.insertRec(70);
		
		tree.inorder();
		
		tree.delete(20);
		tree.inorder();
		
		tree.delete(30);
		tree.inorder();
		
		tree.delete(10);
		tree.inorder();
		
		tree.delete(50);
		tree.inorder();

	}

}
