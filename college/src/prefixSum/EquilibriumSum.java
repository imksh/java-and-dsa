package prefixSum;


public class EquilibriumSum 
{
	

	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 0, 3};
		int total=0;
		for(int i=0;i<arr.length;i++)
		{
			total+=arr[i];
		}
		int prefixSum=0;
		int i=0;
		while(i<arr.length)
		{
			int suffixSum= total-prefixSum-arr[i];
			if(suffixSum==prefixSum)
			{
				System.out.println(i);
				return;
			}
			prefixSum+=arr[i];
			i++;
		
		}
		
		System.out.println(-1);

	}

}

 /*
Equilibrium Index:-

Given an array arr[] of size n, the task is to return an equilibrium index (if any) or -1 if no equilibrium index exists. The equilibrium index of an array is an index such that the sum of all elements at lower indexes equals the sum of all elements at higher indexes.

Note: When the index is at the start of the array, the left sum is 0, and when it’s at the end, the right sum is 0.


 */
