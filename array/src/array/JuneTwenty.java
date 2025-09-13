package array;

import java.util.Arrays;

public class JuneTwenty 
{

	public static void main(String[] args) 
	{
		int[][] arr = {
				{3, 4, 7, 9},
	            {12, 13, 16, 18},
	            {20, 21, 23, 29}
		};
		int target = 23;
		System.out.println(target+" is present : "+binarySearch(arr,target));
		
		arr = new int[][] {
			{1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
		};
		target = 14;
		System.out.println(target+" is present at index  : "+Arrays.toString(search(arr,target)));
		

	}

	private static int[] search(int[][] arr, int target) 
	{
		int row = 0;
		int col = arr[0].length-1;
		while(row<arr.length && col>=0)
		{
			if(arr[row][col]==target)
			{
				return new int[] {row,col};
			}
			else if(target>arr[row][col])
			{
				row++;
			}
			else 
			{
				col--;
			}
		}
		
		return new int[] {-1,-1};
	}

	private static boolean binarySearch(int[][] arr, int target) 
	{
		int n = arr.length;
		int m = arr[0].length;
		int left = 0;
		int right = (m*n)-1;
		while(left<=right)
		{
			int mid = (left+right)/2;
			int row=mid/m;
			int col=mid%m;
			if(arr[row][col]==target)
			{
				return true;
			}
			else if(arr[row][col]>target)
			{
				right = mid-1;
			}
			else 
			{
				left=mid+1;
			}
		}
		return false;
	}

}
