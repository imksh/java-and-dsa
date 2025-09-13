package collegeProblems;

import java.util.ArrayList;
import java.util.HashSet;

public class Intersection 
{

	public static void main(String[] args) 
	{
		int[] arr1 = {3,2,1,1,1,1,5,7};
		int[] arr2 = {10,1,5,1,1,1};
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			set.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			if(set.contains(arr2[i]))
			{
				list.add(arr2[i]);
				set.remove(arr2[i]);
				
			}
		}
		System.out.println(list);

	}

}
