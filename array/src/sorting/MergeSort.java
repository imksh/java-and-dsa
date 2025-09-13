package sorting;

import java.util.Arrays;

public class MergeSort 
{

	public static void main(String[] args) 
	{
		int[] arr = {8,4,6,3,9,10,1,5,2,7};
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void mergeSort(int[] arr) 
	{
		divide(arr,0,arr.length-1);
		
	}

	private static void divide(int[] arr, int left, int right) 
	{
		if(left<right)
		{
			int mid = left + (right-left)/2;
			
			divide(arr, left, mid);
			divide(arr, mid+1, right);
			
			merge(arr,left,mid,right);
			
		}
		
	}

	private static void merge(int[] arr, int left, int mid, int right) 
	{
		
		int n1 = mid-left+1;
		int n2 = right-mid;
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			arr1[i]=arr[left+i];
		}
		
		for(int i=0;i<n2;i++)
		{
			arr2[i]=arr[mid+1+i];
		}
		
		int i = 0;
		int j=0;
		int k=left;
		
		while(i<n1 && j<n2)
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
		
		while(i<n1)
		{
			arr[k++]=arr1[i++];
		}
		
		while(j<n2)
		{
			arr[k++]=arr2[j++];
		}
		
	}

}
