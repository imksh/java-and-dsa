package collegeProblems;

public class LinearSearch 
{

	public static void main(String[] args) 
	{
		int[] nums = {2,4,1,6,8,4,9,0};
		int n=8;
		search(nums, n);

	}
	
	static void search(int[] nums, int n)
	{
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==n)
			{
				System.out.println(n + " is at index : " + i);
				return;
			}
		}
		System.out.println(n + " is not present in the array" );
	}

}
