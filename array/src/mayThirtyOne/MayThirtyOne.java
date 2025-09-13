package mayThirtyOne;

import java.util.Arrays;
import java.util.Scanner;

public class MayThirtyOne 
{

	public static void main(String[] args) 
	{
		int[] arr;
		System.out.println("Question 1");
		arr= new int[] {12, 11, 13, 5, 6};
		q1(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Question 2");
		arr= new int[] {12, 11, 13, 5, 6};
		q2(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Question 3");
		String[] strings = new String[] {"banana", "apple", "pear","kiwi", "orange"};
		q3(strings);
		System.out.println(Arrays.toString(strings));
		
		System.out.println("Question 4");
		double[] d = new double[] {2.56, 1.1, 3.141, 0.567, 2.0};
		q4(d);
		System.out.println(Arrays.toString(d));
		
		System.out.println("Question 3");
		strings = new String[] {"apple", "banana", "grape", "kiwi"};
		q5(strings);
		System.out.println(Arrays.toString(strings));

	}
	
private static void q5(String[] strings) {
		// TODO Auto-generated method stub
		
	}

//	Que 4. Write a program to implement the Insertion
//	Sort algorithm for an array containing floating-point
//	numbers (double). The array should be sorted in
//	ascending order.
//	Example
//	Input: double[] arr = {2.56, 1.1, 3.141, 0.567, 2.0};
//	Output: 0.567 1.1 2.0 2.56 3.141
	
	private static void q4(double[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			double key =arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				 arr[j+1]=arr[j];
				 j--;
			}
			arr[j+1]=key;
			
		}
		
	}

//	Que 3. Write a program to implement the Insertion
//	Sort algorithm to sort an array of strings. The sorting
//	should be done based on the length of the strings in
//	ascending order. If two strings have the same length,
//	they should be sorted alphabetically.
//	Example
//	Input: String[] strings = {"banana", "apple", "pear",
//	"kiwi", "orange"};
//	Output: kiwi pear apple banana orange
	
	private static void q3(String[] arr) 
	{
		
		
	}

//	Que 2. Write a program to sort the following array in
//	decreasing order using the Insertion Sort algorithm.
//	Example
//	Input: arr = {12, 11, 13, 5, 6}
//	Output: Sorted array: {13, 12, 11, 6, 5}
	

	private static void q2(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			int key =arr[i];
			int j=i-1;
			while(j>=0 && arr[j]<key)
			{
				 arr[j+1]=arr[j];
				 j--;
			}
			arr[j+1]=key;
			
		}
		
	}

//	Que 1. Write a program to sort the following array in
//	increasing order using the Insertion Sort algorithm.
//	Example
//	Input: arr = {12, 11, 13, 5, 6}
//	Output: Sorted array: {5, 6, 11, 12, 13}
	
	private static void q1(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			int key =arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				 arr[j+1]=arr[j];
				 j--;
			}
			arr[j+1]=key;
			
		}
		
	}
	
	private static int[] input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length of array : ");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter Elements of array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	

}
