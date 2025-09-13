package collegeProblems;

public class MedianOfArray 
{

	public static void main(String[] args) 
	{
		int[] nums = {3,5,0,2,1,32,63,87,4};
		sort(nums);
		if(nums.length%2!=0)
		{
			System.out.println(nums[nums.length/2]);
		}
		else 
		{
			System.out.println((nums[nums.length/2] + nums[(nums.length/2)-1])/2.0);
		}

	}
	static void sort(int[] nums)
	{
		int i=0;
		while(i<nums.length)
		{
			boolean check = true;
			int j=0;
			while(j<nums.length-1-i)
			{
				if(nums[j]>nums[j+1])
				{
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
					check = false;
				}
				j++;
			}
			i++;
			if(check) 
				return;
		}
	}

}
