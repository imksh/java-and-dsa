package sorting;

import java.util.Arrays;

public class QuickSort 
{

	public static void main(String[] args) 
	{
		int[] arr = {8,4,6,3,9,10,1,5,2,7};
		quickSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void quickSort(int[] arr) 
	{
		sort(arr,0,arr.length-1);
		
	}

	private static void sort(int[] arr, int low, int high) 
	{
		if(low<high)
		{
			int pivot = arr[high];
			int i = low-1;
			for(int j=low;j<high;j++)
			{
				if(arr[j]<=pivot)
				{
					i++;
					swap(arr,i,j);
				}
			}
			swap(arr, ++i, high);
			sort(arr, low, i-1);
			sort(arr, i+1, high);
		}
		
	}

	private static void swap(int[] arr, int i, int j) 
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	

}
