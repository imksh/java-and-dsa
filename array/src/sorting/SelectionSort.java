package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) 
	{
		int[] arr = {15,16,6,8,5};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void selectionSort(int[] arr) 
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
			int temp=arr[k];
			arr[k]=arr[i];
			arr[i]=temp;
		}
		
	}

}
