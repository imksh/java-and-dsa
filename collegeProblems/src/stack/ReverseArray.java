package stack;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray 
{

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8};
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<arr.length;i++)
		{
			stack.push(arr[i]);
		}
		int[] nums = new int[arr.length];
		int i=0;
		while(!stack.isEmpty())
		{
			nums[i]=stack.pop();
			i++;
		}
		System.out.println(Arrays.toString(nums));

	}

}
