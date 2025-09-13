package searching;

import java.util.Arrays;

public class LinearSearch 
{

	public static void main(String[] args) 
	{
		int[] arr = {8,4,6,3,9,10,1,5,2,7};
		int key =10;
		linearSearch(arr,key);
		
		System.out.println("Question 9 : ");
		arr= new int[] {5, 10, 15, 20};
		
		System.out.println(Arrays.toString(q9(arr)));;
		System.out.println("Question 10 : ");
		arr= new int[] {2, 3, 16, 7, 11};
		System.out.println(Arrays.toString(q10(arr)));;

	}
	
//	Que 10. Write a program to check if an array contains any
//	perfect square. If a perfect square is found, return its value;
//	otherwise, return -1.
//	Example
//	Input: arr = {2, 3, 16, 7, 11}
//	Output: 16

	private static int[] q10(int[] arr) 
	{
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			if(Math.sqrt(arr[i])==(int)Math.sqrt(arr[i]))
			{
				count++;
			}
		}
		int[] ans = new int[count];
		int k=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(Math.sqrt(arr[i]) == (int) Math.sqrt(arr[i]) )
			{
				ans[k++]=arr[i];
			}
		}
		if(count != 0)
		{
			return ans;
		}
		else 
		{
			return new int[] {-1};
		}
	}

//	Que 9. Given an array of integers, write a program to find all
//	the elements in the array whose value is equal to their index.
//	The index starts from 0. If no such element exists, return -1.
//	Example
//	Input: Array = {0, 2, 3, 7, 4}
//	Output: Elements equal to their index: [0, 4]
	
	private static int[] q9(int[] arr) 
	{
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==i)
			{
				count++;
			}
		}
		
		int[] ans = new int[count];
		int k=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==i)
			{
				ans[k++]=i;
			}
		}
		if(count != 0)
		{
			return ans;
		}
		else 
		{
			return new int[] {-1};
		}
		
	}

	private static void linearSearch(int[] arr, int key) 
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println(key +" is found at index "+i);
				return;
			}
		}
		System.out.println(key +" is not found ");
		
	}

}
