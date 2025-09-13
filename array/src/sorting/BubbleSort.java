package sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int[] arr = {15,16,6,8,5};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void bubbleSort(int[] arr) 
	{
		for(int i = 0;i<arr.length-1;i++)
		{
			boolean flag = true;
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag = false;
				}
			}
			if(flag) break;
		}
		
	}
	

}
