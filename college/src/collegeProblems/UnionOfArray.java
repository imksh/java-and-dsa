package collegeProblems;

import java.util.HashSet;

public class UnionOfArray 
{
	public static void main(String[] args) 
	{
		int[] arr1 = {3,2,1,1,1,1,5,7};
		int[] arr2 = {10,1,5,1,1,1};
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			set.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			set.add(arr2[i]);
		}
		System.out.println(set);
	}
}
