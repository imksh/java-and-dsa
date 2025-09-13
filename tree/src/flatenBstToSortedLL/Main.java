package flatenBstToSortedLL;

import java.util.ArrayList;

public class Main {
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
		printInorder(tree.root);
		System.out.println();
		tree.flatten(tree.root);
		
		printInorder(tree.root);
		
		System.out.println();
		System.out.println("Print current.right");
		Node curr = tree.root;
		while(curr!=null)
		{
			System.out.print(curr.val+" ");
			curr=curr.right;
		}
		System.out.println();
		

	}

	private void flatten(Node node) 
	{
		ArrayList<Node>list = new ArrayList<>();
		inorder(node,list);
		helper(list);
		
	}

	private void inorder(Node node, ArrayList<Node> list) 
	{
		if(node==null) return;
		inorder(node.left, list);
		list.add(node);
		inorder(node.right, list);
		
	}

	private void helper(ArrayList<Node> list) 
	{
		for(int i=0;i<list.size()-1;i++)
		{
			Node curr = list.get(i);
			Node next = list.get(i+1);
			curr.left=null;
			curr.right=next;
		}
		list.get(list.size()-1).left=null;
		list.get(list.size()-1).right=null;
		this.root=list.get(0);
		
	}

	

}
