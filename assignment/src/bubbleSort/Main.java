package bubbleSort;

import java.util.Arrays;

public class Main 
{

	public static void main(String[] args) 
	{
		int[] arr;
		int k;
		System.out.println("Question 1");
		arr= new int[] {12, 8, 15, 6, 10};
		q1(arr);
		System.out.println(Arrays.toString(arr));

		
		System.out.println("Question 2");
		arr= new int[] {12, 8, 15, 6, 10};
		q2(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Question 3");
		arr= new int[] {9, 3, 7, 5, 8, 1};
		k=4;
		q3(arr,k);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Question 4");
		arr= new int[] {4, 3, 1, 2};
		System.out.println(q4(arr));
		
		System.out.println("Question 5");
		arr= new int[] {10, 20, 15, 30, 40};
		k=3;
		System.out.println(q5(arr,k));
		
		System.out.println("Question 6");
		arr= new int[] {-4,-1,0,3,10};
		System.out.println(Arrays.toString(q6(arr)));
		
		System.out.println("Question 7");
		String[] names = {"Alice","Bob","Mark"};
		int[] heights = new int[] {155,185,150};

		q7(names,heights);
		System.out.println(Arrays.toString(names));
		
		System.out.println("Question 8");
		arr= new int[] {2,0,2,1,1,0};
		q8(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Question 9");
		arr= new int[] {1, 2, 3, 4, 5};
		q9(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Question 10");
		arr= new int[] {10, 9, 7, 8, 5, 13};
		q10(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	
//	Que 10. You are given an array of integers. Your task is
//	to sort only the odd elements of the array using the
//	Bubble Sort algorithm while keeping the even elements
//	in their original positions. After sorting the odd
//	elements, the array should remain in the same order
//	except for the odd elements which should be sorted in
//	ascending order.
//	Example
//	Input: arr = [10, 9, 7, 8, 5, 2]
//	Output: [10, 5, 7, 8, 9, 2]
	
	private static void q10(int[] arr) 
	{
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				int first =j;
				int second=j+1;
				while(arr[first]%2==0)
				{
					first++;
				}
				
				while(arr[second]%2==0)
				{
					second++;
				}
				if(arr[second]<arr[first])
				{
					swap(arr, first, second);
				}
			}
		}
//		for(int i=0;i<arr.length-1;i++)
//		{
//			boolean flag = true;
//			
//			for(int j=0;j<arr.length-1-i;j++)
//			{
//				if(arr[j]%2!=0)
//				{
//					int k=j+1;
//					while(k<arr.length && arr[k]%2==0)k++;
//					
//					if(arr[j]>arr[k])
//					{
//						flag=false;
//						swap(arr,j,k);
//					}
//				}
//			}
//			if(flag) break;
//		}
		
		
	}



//	Que 9. Implement an optimized version of Bubble Sort
//	that stops the sorting process early if no swaps are
//	made during a complete pass through the array,
//	indicating that the array is already sorted.
//	Example
//	Input: arr = {1, 2, 3, 4, 5}
//	Output: Array is Sorted
	
	private static void q9(int[] arr) 
	{
		
		for(int i=0;i<arr.length-1;i++)
		{
			boolean flag = true;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					flag=false;
					swap(arr,j,j+1);
				}
			}
			if(flag)
			{
				System.out.println("Array is Sorted");
				break;
			}
		}
	}


//	Que 8. Given an array nums with n objects colored red,
//	white, or blue, sort them in-place so that objects of the
//	same color are adjacent, with the colors in the order
//	red, white, and blue.
//	We will use the integers 0, 1, and 2 to represent the
//	color red, white, and blue, respectively.
//	Example
//	Input: nums = [2,0,2,1,1,0]
//	Output: [0,0,1,1,2,2]
	
	private static void q8(int[] arr) 
	{
		
		for(int i=0;i<arr.length-1;i++)
		{
			boolean flag = true;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					flag=false;
					swap(arr,j,j+1);
				}
			}
			if(flag) break;
		}
	}


//	Que 7. You are given an array of strings names, and an
//	array heights that consists of distinct positive integers.
//	Both arrays are of length n.
//	For each index i, names[i] and heights[i] denote the
//	name and height of the ith person.
//	Return names sorted in descending order by the
//	people's heights.
//	Example
//	Input: names = ["Mary","John","Emma"],
//	heights = [180,165,170]
//	Output: ["Mary","Emma","John"]
//	Input: names = ["Alice","Bob","Mark"],
//	heights = [155,185,150]
//	Output: ["Bob","Alice","Mark"]
	
	private static void q7(String[] names, int[] heights) 
	{
		for(int i=0;i<heights.length-1;i++)
		{
			boolean flag = true;
			for(int j=0;j<heights.length-1-i;j++)
			{
				if(heights[j]<heights[j+1])
				{
					flag=false;
					swap(heights,j,j+1);
					swapString(names,j,j+1);
				}
			}
			if(flag) break;
		}
	}

//	Que 6. Given an integer array nums sorted in non-
//	decreasing order, return an array of the squares of
//	each number sorted in non-decreasing order.
//	Example
//	Input: nums = [-4,-1,0,3,10]
//	Output: [0,1,9,16,100]
	
	private static int[] q6(int[] arr) 
	{
		int[] square = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			square[i]=arr[i]*arr[i];
		}
		
		for(int i=0;i<square.length-1-i;i++)
		{
			boolean flag = true;
			for(int j=0;j<square.length-1;j++)
			{
				if(square[j]>square[j+1])
				{
					flag=false;
					swap(square,j,j+1);
				}
			}
			if(flag) break;
		}
		return square;
	}


//	Que 5. Write a program that uses Bubble Sort to find
//	the kth largest element in the array. After sorting the
//	array using Bubble Sort, return the kth largest element.
//	Example
//	Input: {10, 20, 15, 30, 40}, k = 3
//	Output: 20
	
	private static int q5(int[] arr, int k) 
	{
		for(int i=0;i<arr.length-1;i++)
		{
			boolean flag = true;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					flag=false;
					swap(arr,j,j+1);
				}
			}
			if(flag) break;
		}
		
		arr = removeDuplicates(arr);
		
		return arr[k-1];
	}


	private static int[] removeDuplicates(int[] arr) 
	{
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			boolean check=true;
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					check=false;
				}
			}
			if(check) count++;
		}
		
		int[] ans = new int[count];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			boolean check=true;
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					check=false;
				}
			}
			if(check) ans[k++]=arr[i];
		}
		return ans;
	}


//	Que 4. Write a program to count the minimum number
//	of swaps required to sort an array using Bubble Sort.
//	Example
//	Input: {4, 3, 1, 2}
//	Output: 5
	
	private static int q4(int[] arr) 
	{
		int count =0;
		for(int i=0;i<arr.length-1;i++)
		{
			boolean flag = true;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					count++;
					flag=false;
					swap(arr,j,j+1);
				}
			}
			if(flag) break;
		}
		
		return count;
	}


//	Que 3. Sort only the first k elements of an array in
//	ascending order using Bubble Sort, leaving the rest of
//	the array unsorted.
//	Example
//	Input: {9, 3, 7, 5, 8, 1}, k = 4
//	Output: {3, 5, 7, 9, 8, 1}
	
	private static void q3(int[] arr,int k) 
	{
		for(int i=0;i<k-1;i++)
		{
			boolean flag = true;
			for(int j=0;j<k-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					flag=false;
					swap(arr,j,j+1);
				}
			}
			if(flag) break;
		}
		
	}


//	Que 2. Write a program to sort an array in decreasing
//	order using the Bubble Sort algorithm.
//	Example
//	Input: arr = {12, 8, 15, 6, 10}
//	Output: arr = {15, 12, 10, 8, 6}
	
	private static void q2(int[] arr) 
	{
		for(int i=0;i<arr.length-1;i++)
		{
			boolean flag = true;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					flag=false;
					swap(arr,j,j+1);
				}
			}
			if(flag) break;
		}
		
	}


//	Que 1. Write a program to sort an array in non-
//	decreasing order (ascending order) using the Bubble
//	Sort algorithm.
//	Example
//	Input: arr = {12, 8, 15, 6, 10}
//	Output: arr = {6, 8, 10, 12, 15}
	
	private static void q1(int[] arr) 
	{
		for(int i=0;i<arr.length-1;i++)
		{
			boolean flag = true;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					flag=false;
					swap(arr,j,j+1);
				}
			}
			if(flag) break;
		}
		
	}


	private static void swap(int[] arr, int j, int i) 
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	
	}
	
	private static void swapString(String[] arr, int j, int i) 
	{
		String temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	
	}

}
