package collegeProblems;

public class BinarySearch 
{

	public static void main(String[] args) 
	{
		int[] nums = {15,21,33,37,44,51,63,70,89,91};
		int n=21;
		search(nums, n);
		System.out.println(recSearch(nums, n, 0, nums.length-1));
		
	}
	static int recSearch(int[] nums, int n,int s, int e)
	{
		int mid= s + (e-s)/2;
		if(s>e)
		{
			return -1;
		}
		if(nums[mid]==n)
		{
			return mid;
		}
		if(nums[mid]<n)
		{
			return recSearch(nums, n, mid+1, e);
		}
		else 
		{
			return recSearch(nums, n, s, mid-1);
		}
	}
	
 	static void search(int[] nums,int n)
	{
		int s=0;
		int e=nums.length-1;
		
		
		while(s<e)
		{
			int mid= s + (e-s)/2;
			if(nums[mid]==n)
			{
				System.out.println(n + " is at index : " + mid);
				return;
			}
			if(n>nums[mid])
			{
				s=mid+1;
			}
			else 
			{
				e=mid-1;
			}
		}
		System.out.println(n + " is not present in the array" );
		
	}

}
