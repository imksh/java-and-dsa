package kthLargestAndSmallest;


public class UsingMorris 
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
		UsingMorris tree = new UsingMorris();
		
		tree.insert(arr);
		System.out.println();
		int k =3;
		
		count = 0;
		ans=-1;
		System.out.println("Smallest: "+tree.kthSmall(tree.root,3));
		

	}
	
	private int kthSmall(Node node, int k) 
	{
		Node curr = root;
		
		while(curr != null)
		{
			if(curr.left == null)
			{
				count++;
				ans=curr.val;
				if(count==k)
				{
					return ans;
				}
				curr=curr.right;
			}
			else 
			{
				Node pre = findPre(curr);
				if(pre.right == null)
				{
					pre.right=curr;
					curr=curr.left;
					
				}
				else
				{
					pre.right=null;
					count++;
					ans=curr.val;
					if(count==k)
					{
						return ans;
					}
					curr=curr.right;
				}
			}
		}
		return ans;
		
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
