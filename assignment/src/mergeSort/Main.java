package mergeSort;

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

	}

	private static void q1(int[] arr) 
	{
		sort(arr);
		
	}

	private static void sort(int[] arr) 
	{
		
		divide(arr,0,arr.length-1);
	}

	private static int[] divide(int[] arr, int i, int j) 
	{
		if(i==j) return new int[] {arr[i]};
		int mid = i+(j-i)/2;
		int[] arr1 = divide(arr, i, mid);
		int[] arr2 = divide(arr, mid+1, j);
		
		return merge(arr1,arr2);
		
	}

	private static int[] merge(int[] arr1,int[] arr2) 
	{
		int[] arr = new int[arr1.length+arr2.length];
		int k=0;
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				arr[k++]=arr1[i++];
			}
			else 
			{
				arr[k++]=arr2[j++];
				
			}
		}
		
		while(i<arr1.length)
		{
			arr[k++]=arr1[i++];
		}
		
		while(j<arr2.length)
		{
			arr[k++]=arr2[j++];
		}
		return arr;
	}

}
