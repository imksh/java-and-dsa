package insertionSort;

import java.util.Arrays;

public class Main 
{

	public static void main(String[] args) 
	{
		int[] arr;
		int k;
		System.out.println("Question 1");
		arr= new int[] {12, 11, 13, 5, 6};
		q1(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Question 2");
		arr= new int[] {12, 11, 13, 5, 6};
		q2(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Question 3");
		String[] strings= new String[] {"banana", "apple","zbad", "pear","kiwi","ciku", "orange"};
		q3(strings);
		System.out.println(Arrays.toString(strings));
		
		System.out.println("Question 4");
		 double[] d = {2.56, 1.1, 3.141, 0.567, 2.0};
		q4(d);
		System.out.println(Arrays.toString(d));
		
		System.out.println("Question 5");
		strings= new String[] {"apple", "banana", "grape", "kiwi"};
		q5(strings);
		System.out.println(Arrays.toString(strings));
		

	}
	
//	Que 5. Write a program to sort an array of strings
//	based on the number of vowels in each string using
//	insertion sort. If two strings have the same number of
//	vowels, sort them alphabetically.
//	Example
//	Input: Words: ["apple", "banana", "grape", "kiwi"]
//	Output: Sorted Words: ["apple", "kiwi", "grape",
//	"banana"]
	
	
	private static void q5(String[] strings) 
	{
		for(int i=1;i<strings.length;i++)
		{
			String key =strings[i];
			int j=i-1;
			while(j>=0 && vowels(strings[j]) >= vowels(key))
			{
				if(vowels(strings[j])==vowels(key) && !checkAlphabet(strings[j],key)) break;
				strings[j+1]=strings[j];
				j--;
			}
			strings[j+1]=key;
		}
		
	}

	private static int vowels(String string)
	{
		int count =0;
		for(int i=0;i<string.length();i++)
		{
			char ch = string.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		return count;
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
		for(int i=1;i<arr.length;i++)
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
	
	private static void q3(String[] strings) 
	{
		for(int i=1;i<strings.length;i++)
		{
			String key =strings[i];
			int j=i-1;
			while(j>=0 && strings[j].length()>=key.length())
			{
				if(strings[j].length()==key.length() && checkAlphabet(strings[j],key))
				{
					break;
				}
				strings[j+1]=strings[j];
				j--;
			}
			strings[j+1]=key;
		}
		
	}

	private static boolean checkAlphabet(String string, String key) 
	{
		int i=0;
		while(i<string.length() && i<key.length())
		{
			if(string.charAt(i)>key.charAt(i))
			{
				return false;
			}
			i++;
		}
		return true;
	}

//	Que 2. Write a program to sort the following array in
//	decreasing order using the Insertion Sort algorithm.
//	Example
//	Input: arr = {12, 11, 13, 5, 6}
//	Output: Sorted array: {13, 12, 11, 6, 5}
	
	private static void q2(int[] arr) 
	{
		for(int i=1;i<arr.length;i++)
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
		for(int i=1;i<arr.length;i++)
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
