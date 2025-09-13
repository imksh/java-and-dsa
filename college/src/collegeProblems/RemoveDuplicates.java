package collegeProblems;

public class RemoveDuplicates {

	public static void main(String[] args) 
	{
		code2();

	}
	static void code1()
	{
		int[] nums = {2,2,3,3,3,10,12,12,15,15};
		int i=0;
		int j=1;
		while(i<nums.length)
		{
			if(j==nums.length)
			{
				break;
			}
			if(nums[i]==nums[j] )
			{
				j++;
			}
			else 
			{
				int temp=nums[i+1];
				nums[i+1]=nums[j];
				nums[j]=temp;
				j++;
				i++;
			}
		}
		i=0;
		while(i<nums.length)
		{
			
			System.out.println(nums[i]);
			i++;
		}
		
	}
	static void code2()
	{
		int[] nums = {2,2,3,3,3,10,12,12,15,15};
		int i=0;
		int j=1;
		while(j<nums.length)
		{
			if(nums[i]!=nums[j])
			{
				i++;
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
			}
			j++;
		}
		
		j=0;
		while(j<=i)
		{
			System.out.print(nums[j] + " ");
			j++;
		}
		System.out.println();
	}

}
