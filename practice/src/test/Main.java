package test;


import java.util.Arrays;

public class Main
{
	public static void main(String[] args) 
	{
        int[] arr = {1, 5, 2, 5, 2, 2, 1, 6};
        for(int i=0;i<arr.length;i++)
        {
            int count = 0;
            int num = arr[i];
            boolean flag = false;
            for(int j=i-1;j>=0;j--)
            {
                if(arr[j]==arr[i]) flag = true;
            }
            if(flag) continue;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j]) count++;

            }
            System.out.println("Occurrence of "+ arr[i] +" is "+count);
        }
	}
	
}
