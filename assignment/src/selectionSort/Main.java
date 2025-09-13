package selectionSort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) 
	{
		int[] arr;
		int k;
		System.out.println("Question 1");
		arr= new int[] {45, 12, 89, 23, 5, 67};
		q1(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Question 2");
		arr= new int[] {10, 50, 1, 29, 32, 12, 43};
		q2(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Question 3");
		arr= new int[] {7, 10, 4, 3, 20, 15};
		k=3;
		System.out.println(q3(arr,k));
		
		System.out.println("Question 4");
		String[] names = {"Alice", "Bob", "Charlie"};
		int[] scores = new int[] {50,80, 70};
		q4(names,scores);
		System.out.println(Arrays.toString(names));
		
		System.out.println("Question 5");
		arr= new int[] {4, 1, 7, 2, 3, 5};
		q5(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Question 6");
		arr= new int[] {4, 1, 2, 3};
		q6(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Question 7");
		arr= new int[] {1,1,2,2,2,3};
		q7(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Question 6");
		arr= new int[] {42, 31, 63, 74, 25};
		q8(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Question 6");
		arr= new int[] {23, 45, 12, 56, 34};
		q9(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Question 10");
		arr= new int[] {123, 45, 6, 7890, 12};
		q10(arr);
		System.out.println(Arrays.toString(arr));

	}

//	Que 10. Sort the array in ascending order based on the
//	number of digits in each number. If multiple numbers
//	have the same number of digits, sort them in
//	ascending order.
//	Example
//	Input: arr = [123, 45, 6, 7890, 12]
//	Output: [6, 12, 45, 123, 7890]
	
	private static void q10(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			int k=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(digit(arr[j])<digit(arr[k]))
				{
					
					k=j;
					
				}
				else if(digit(arr[j])==digit(arr[k]) && arr[j]<arr[k])
				{
					k=j;
				}
			}
			
			swap(arr, k, i);
		}
		
	}

	private static int digit(int i) 
	{
		int count=0;
		while(i!=0)
		{
			i/=10;
			count++;
		}
		return count;
	}

//	Que 9. Sort the array in ascending order based on the
//	sum of the digits of each number using Selection Sort.
//	Example
//	Input: arr = [23, 45, 12, 56, 34]
//	Output: [12, 23, 34, 45, 56]
	
	private static void q9(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			int k=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(sum(arr[j])<sum(arr[k]))k=j;
			}
			swap(arr, k, i);
		}
		
	}

	private static int sum(int i) 
	{
		int sum=0;
		while(i>0)
		{
			sum+=i%10;
			i/=10;
		}
		return sum;
	}

//	Que 8. Sort the array based on the units digit of each
//	number in ascending order using Selection Sort.
//	Example:
//	Input: arr = [42, 31, 63, 74, 25]
//	Output: [31, 42, 63, 74, 25]
	
	private static void q8(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			int k=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]%10<arr[k]%10)k=j;
			}
			swap(arr, k, i);
		}
		
	}

//	Que 7. Given an array of integers nums, sort the array
//	in increasing order based on the frequency of the
//	values. If multiple values have the same frequency,
//	sort them in decreasing order.
//	Return the sorted array.
//	Example
//	Input: nums = [1,1,2,2,2,3]
//	Output: [3,1,1,2,2,2]
	
	
	private static void q7(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			int k=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(occur(arr,arr[k])>occur(arr,arr[j]))
				{
					
					k=j;
				}
				else if(occur(arr,arr[k])==occur(arr,arr[j]) && arr[k]>arr[j])
				{
					k=j;
				}
			}
			swap(arr, k, i);
		}
		
		
		
	}
	
	private static int occur(int[] arr,int j) 
	{
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==j)count++;
		}
		return count;
	}

//	Que 6. Sort Even and Odd Indices Independently
//	You are given a 0-indexed integer array nums.
//	Rearrange the values of nums according to the
//	following rules:
//	1. Sort the values at odd indices of nums in non-
//	increasing order.
//	• For example, if nums = [4,1,2,3] before this
//	step, it becomes [4,3,2,1] after. The values at
//	odd indices 1 and 3 are sorted in non-
//	increasing order.
//	2. Sort the values at even indices of nums in non-
//	decreasing order.
//	• For example, if nums = [4,1,2,3] before this
//	step, it becomes [2,1,4,3] after. The values at
//	even indices 0 and 2 are sorted in non-
//	decreasing order.
//	Return the array formed after rearranging the values
//	of nums.
//	Example
//	Input: nums = [4,1,2,3]
//	Output: [2,3,4,1]
	
	
	
	private static void q6(int[] arr) 
	{
		
		for(int i=0;i<arr.length;i+=2)
		{
			int k=i;
			for(int j=i+2;j<arr.length;j+=2)
			{
				if(arr[j]<arr[k])k=j;
			}
			swap(arr, k, i);
		}
		
		for(int i=1;i<arr.length;i+=2)
		{
			int k=i;
			for(int j=i+2;j<arr.length;j+=2)
			{
				if(arr[j]>arr[k])k=j;
			}
			swap(arr, k, i);
		}
	}




//	Que 5. Sort only the elements at even indices of the
//	array in ascending order using Selection Sort, while
//	keeping the odd-indexed elements unchanged.
//	Example
//	Input: arr = [4, 1, 7, 2, 3, 5]
//	Output: [3, 1, 4, 2, 7, 5]
	
	
	private static void q5(int[] arr) 
	{
		
		for(int i=0;i<arr.length;i+=2)
		{
			int k=i;
			for(int j=i+2;j<arr.length;j+=2)
			{
				if(arr[j]<arr[k])k=j;
			}
			swap(arr, k, i);
		}
	}
	
	
//	Que 4. Given two arrays: one with student names and
//	another with their scores, sort the students by their
//	scores using Selection Sort.
//	Example
//	Input: names = ["Alice", "Bob", "Charlie"], scores = [50,
//	80, 70]
//	Output: ["Alice", "Charlie", "Bob"]
	
	private static void q4(String[] names, int[] scores) 	
	{
		for(int i=0;i<scores.length;i++)
		{
			int k=i;
			for(int j=i+1;j<scores.length;j++)
			{
				if(scores[k]>scores[j])
				{
					k=j;
				}
			}
			swap(scores, k, i);
			swapString(names, k, i);
		}
		
	}


//	Que 3. You are given an array of integers and a positive
//	integer k. Use the Selection Sort algorithm to find the
//	Kth smallest element in the array.
//	Input: arr = [7, 10, 4, 3, 20, 15], k = 3
//	Output: 7
	
	private static int q3(int[] arr, int x) 
	{
		for(int i=0;i<arr.length;i++)
		{
			int k=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[k]>arr[j])
				{
					k=j;
				}
			}
			swap(arr, k, i);
		}
		arr = removeDuplicates(arr);
		
		return arr[x-1];
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

//	Que 2. Write a program to sort an array in decreasing
//	order using Selection Sort.
//	Example
//	Input: [10, 50, 1, 29, 32, 12, 43]
//	Output: [50, 43, 32, 29, 12, 10, 1]
	
	
	private static void q2(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			int k=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[k]<arr[j])
				{
					k=j;
				}
			}
			swap(arr, k, i);
		}
	}

//	Que 1. Write a program to sort an array in non-
//	decreasing(increasing) order using Selection Sort.
//	Example
//	Input: arr = [45, 12, 89, 23, 5, 67]
//	Output: [5, 12, 23, 45, 67, 89]
			
	private static void q1(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			int k=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[k]>arr[j])
				{
					k=j;
				}
			}
			swap(arr, k, i);
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
