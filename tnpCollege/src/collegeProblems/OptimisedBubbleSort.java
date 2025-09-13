package collegeProblems;

public class OptimisedBubbleSort 
{

	public static void main(String[] args) 
	{
		code();

	}
	static void code()
	{
		int[] nums = {3,5,0,2,1};
		int i=0;
		while(i<nums.length)
		{
			int check =0;
			int j=0;
			while(j<nums.length-i-1)
			{
				if(nums[j]>nums[j+1])
				{
					check=1;
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
				j++;
				
			}
			if(check==0)
			{
				break;
			}
			i++;
		}
		int j=0;
		while(j<nums.length)
		{
			System.out.println(nums[j] + " ");
			j++;
		}
		System.out.println();
	}

}
