package leetcode;

public class Q11BruteForce {

	public static void main(String[] args) 
	{
		int[] height = {8,7,2,1};
		
		int contain=0;
		int max=0;
        for(int i=0;i<height.length;i++)
        {
            contain=getMax(height,i);
            
            if(contain>max)
            {
                max=contain;
            }
        }
        System.out.println(max);

	}
	static int getMax(int[] arr,int i)
    {
        int contain=0;
        int maxcontain=0;
        int j=i-1;
        while(j>=0)
        {
            if(arr[i]<arr[j])
            {
                contain=arr[i]*(i-j);
            }else
            {
                contain=arr[j]*(i-j);
            }
            if(maxcontain<contain)
            {
                maxcontain=contain;
            }
            j--;
        }
        j=i+1;
        while(j<arr.length)
        {
            if(arr[i]<arr[j])
            {
                contain=arr[i]*(j-i);
            }else
            {
                contain=arr[j]*(j-i);
            }
            if(maxcontain<contain)
            {
                maxcontain=contain;
            }
            j++;
        }
        return maxcontain;
    }

	
}