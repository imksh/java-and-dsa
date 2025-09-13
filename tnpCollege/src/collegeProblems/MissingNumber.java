package collegeProblems;

public class MissingNumber 
{

	public static void main(String[] args) 
	{
		cyclicSort();
		sum();

	}
	
	static void sum()
	{
		int[] nums = {2,3,1,5,4,6,7,9,10};
		int n= nums.length +1;
		int actualSum=(n*(n+1))/2;
		int arrSum=0;
		for(int i=0;i<nums.length;i++)
		{
			arrSum+=nums[i];
		}
		System.out.println(actualSum-arrSum);
		
	}
	
	
	static void cyclicSort()
	{
		int[] nums = {2,3,1,5,4,6,7,9,10};
		int j=0;
		while(j < nums.length){
            int correct = nums[j]-1;
            if(nums[j] < nums.length && nums[j] != nums[correct]){
                 int temp = nums[j];
                 nums[j]= nums[correct];
                 nums[correct]= temp;
            }else{
                j++;
            }
        }
		int i=0;
        while(i<nums.length){
        		if(nums[i]!=i+1)
        		{
        			System.out.println(i+1);
        			break;
        		}
        		i++;
        }
        if(i==nums.length)
        {
        	   System.out.println(i+1);
        }
	}
	

}
