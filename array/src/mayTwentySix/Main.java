package mayTwentySix;

import java.util.Arrays;

public class Main 
{
	public static void main(String[] args) 
	{
		moveNegative(new int[] {8,-2,-1,1,-3,9});
	}

	private static void moveNegative(int[] arr) 
	{
//		int k=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>=0)
//			{
//				swap(arr, i, k);
//				k++;
//			}
//		}
		
		int[] ans = new int[arr.length];
		int k=0;
		int j = arr.length-1;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>=0)
//			{
//				ans[k++] = arr[i];
//			}
//			else 
//			{
//				ans[j--]=arr[i];
//			}
//		}
//		reverse(ans,j+1,arr.length-1);
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=0)
			{
				ans[k++]=arr[i];
			}
			if(arr[arr.length-i-1]<0)
			{
				ans[j--]=arr[arr.length-i-1];
			}
		}
//		8,-2,-1,1,-3,9
//		int k=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]<0)
//			{
//				swap(arr, i, k);
//				k++;
//			}
//		}
//		rotate(arr, k);
		System.out.println(Arrays.toString(ans));
	}
	
	private static void reverse(int[] arr, int i, int j) 
	{
		while(i<j)
		{
			swap(arr, i, j);
			i++;
			j--;
		}
		
	}
	
	private static void rotate(int[] arr, int k) 
	{
		reverseArr(arr,0,k-1);
		reverseArr(arr,k,arr.length-1);
		reverseArr(arr,0,arr.length-1);
		
	}

	private static void reverseArr(int[] arr, int i, int j) 
	{
		while(i<j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
	}

	private static void swap(int[] arr, int i, int j) 
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
}
