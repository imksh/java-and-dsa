package twoSum;

import java.util.ArrayList;



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
		System.out.println(findTarget(tree.root,120)?"yes":"No");
		
		printInorder(tree.root);
		

	}

	private static boolean findTarget(Node node, int i) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		inorder(node,list);
		int left = 0, right = list.size()-1;
		while(left<right)
		{
			int sum = list.get(left)+list.get(right);
			if(sum==i) return true;
			if(sum<i)
			{
				left++;
			}
			else 
			{
				right--;
			}
		}
		return false;
	}

	private static void inorder(Node node, ArrayList<Integer> list) 
	{
		if(node==null) return;
		
		inorder(node.left, list);
		list.add(node.val);
		inorder(node.right, list);
		
	}

}
