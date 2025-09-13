package collegeProblems;

public class SelectionSort 
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
			int j=i+1;
			while(j<nums.length)
			{
				if(nums[j]<nums[i])
				{
					int temp=nums[j];
					nums[j]=nums[i];
					nums[i]=temp;
				}
				j++;
				
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
