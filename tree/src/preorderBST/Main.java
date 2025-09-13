package preorderBST;

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

	public static void printInorder(Node node)
	{
		if(node == null) return;
		printInorder(node.left);
		System.out.print(node.data+" ");
		printInorder(node.right);
	}

	public static void main(String[] args) 
	{
		int[] arr = {50,30,20,40,70,60,80};
		
		Node root = tree(arr);
		
		printInorder(root);
		

	}
	
	


	private static Node tree(int[] arr) 
	{
		int[] indx = {0};
		return helper(arr,indx,Integer.MIN_VALUE, Integer.MAX_VALUE);
	}


	private static Node helper(int[] arr, int[] indx, int min , int max) 
	{
		if(indx[0]>=arr.length || arr[indx[0]]<min || arr[indx[0]]>max) return null;
		
		Node node = new Node(arr[indx[0]]);
		indx[0]++;
		node.left= helper(arr, indx, min, node.data);
		node.right = helper(arr, indx, node.data, max);
		return node;
	}

}
