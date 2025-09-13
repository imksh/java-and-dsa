package mergeTwoBst;

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
		int[] arr1={3,4,7,10,12};
		Main tree1 = new Main();
		Main tree2 = new Main();
		
		tree1.insert(arr);
		tree2.insert(arr1);
		
		Main tree=merge(tree1.root,tree2.root);
		
		printInorder(tree.root);
		System.out.println();
		
		System.out.println(tree.root.val + " ");
		System.out.print(tree.root.left.val + " ");
		System.out.println(tree.root.right.val + " ");
		System.out.print(tree.root.left.left.val + " ");
		System.out.print(tree.root.left.right.val + " ");
		System.out.print(tree.root.right.left.val + " ");
		System.out.print(tree.root.right.right.val + " ");
		
		
		

	}

	private static Main merge(Node node1, Node node2) 
	{
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		helper(node1,list1);
		helper(node2,list2);
		
		ArrayList<Integer> list = new ArrayList<>();
		int i = 0;
		int j=0;
		while(i<list1.size() && j<list2.size())
		{
			if(list1.get(i)<list2.get(j))
			{
				list.add(list1.get(i));
				i++;
			}
			else
			{
				list.add(list2.get(j));
				j++;
			}
		}
		while(i<list1.size())
		{
			list.add(list1.get(i));
			i++;
		}
		while(j<list2.size())
		{
			list.add(list2.get(j));
			j++;
		}
		
		int arr[] = new int[list.size()];
		int k=0;
		while(k<arr.length)
		{
			arr[k]=list.get(k);
			k++;
		}
		Main tree = new Main();
		tree.root = construct(0,arr.length-1,arr);
		return tree;
	}

	private static Node construct(int i, int j, int[] arr) 
	{
		if(i>j) return null;
		int mid = (i+j)/2;
		Node node = new Node(arr[mid]);
		node.left=construct(i, mid-1, arr);
		node.right=construct(mid+1, j, arr);
		
		return node;
	}

	private static void helper(Node node, ArrayList<Integer> list) 
	{
		if(node==null)return;
		helper(node.left, list);
		list.add(node.val);
		helper(node.right, list);
		
	}

}
