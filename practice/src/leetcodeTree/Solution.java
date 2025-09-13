package leetcodeTree;
import java.util.*;

public class Solution 
{

	public static void main(String[] args) 
	{
		
		TreeBuilder builder = new TreeBuilder();
        Integer[] arr = {3, 1, 4, 3, null, 1, 5};

        TreeNode root = builder.buildTree(arr);

        System.out.println(good(root,0,0));
	}
	
	static int good(TreeNode node,int max,int ans)
    {
        if(node==null) return ans;
        max=Math.max(node.val,max);
        if(node.val>=max)
        {
            ans+=1;
        } 
        ans = good(node.left,ans,max);
        ans = good(node.right,ans,max);
        return ans;
        
    }

}
























class TreeNode {
    int val;            // The value/data stored in the node
    TreeNode left;      // Reference to the left child node
    TreeNode right;     // Reference to the right child node

    TreeNode() {}       // No-argument constructor

    TreeNode(int val) { // Constructor to initialize the node with a value
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) { // Constructor with value and children
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class TreeBuilder {
    public TreeNode buildTree(Integer[] arr) {
        if (arr.length == 0 || arr[0] == null) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();

            // Left child
            if (i < arr.length && arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.offer(current.left);
            }
            i++;

            // Right child
            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }
        return root;
    }
}
