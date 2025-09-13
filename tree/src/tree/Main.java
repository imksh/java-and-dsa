package tree;


public class Main 
{

	public static void main(String[] args) 
	{
//		Tree tree = new Tree();
//		tree.add();
//		tree.display();
		BinarySearchTree bst =new BinarySearchTree();
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
//		bst.insert(10);
//		bst.insert(15);
//		bst.insert(7);
//		bst.insert(3);
//		bst.insert(20);
//		bst.insert(13);
//		bst.insert(5);
//		bst.populate(nums);
		bst.populateSorted(nums);
		bst.display();
//		bst.preOrder();
//		bst.inOrder();
//		bst.posrOrder();
//		System.out.println(bst.balanced());
//		System.out.println(bst.height());
	}

}
