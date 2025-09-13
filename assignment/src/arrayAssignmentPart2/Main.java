package arrayAssignmentPart2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Question 1 : ");
		//q1(sc,1,3);
		
		System.out.println("Question 2 : ");
		//q2(sc);
		
		System.out.println("Question 3 : ");
		//q3(sc);
		
		System.out.println("Question 4 : ");
		//System.out.println(q4(sc));
		
		System.out.println("Question 5 : ");
		//System.out.println(q5(sc));
		
		System.out.println("Question 6 : ");
		System.out.println(q6(sc));

	}
	
	private static int q6(Scanner sc) 
	{
		int[] arr = input(sc);
		int min = Integer.MIN_VALUE;
		int min2 = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min2=min;
				min=arr[i];
			}
			else if(arr[i]<min2 && arr[i]!=min)
			{
				min2=arr[i];
			}
			
		}
		return min2==Integer.MAX_VALUE?-1:min2;
		
	}
	
	private static int q5(Scanner sc) 
	{
		int[] arr = input(sc);
		int min = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min2=min;
				min=arr[i];
			}
			else if(arr[i]<min2 && arr[i]!=min)
			{
				min2=arr[i];
			}
			
		}
		return min2==Integer.MAX_VALUE?-1:min2;
		
	}
	
	private static int q4(Scanner sc) 
	{
		int[] arr = input(sc);
		int max = -1;
		int max2 = -1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max2=max;
				max=arr[i];
			}
			else if(arr[i]>max2 && arr[i]!=max)
			{
				max2=arr[i];
			}
			
		}
		return max2;
		
	}

	//10 20 30 40 50

	private static void q3(Scanner sc) 
	{
		int[] arr = input(sc);
		System.out.print("Index:");
		int left =sc.nextInt()+1,right=arr.length-1;
		while(left<right)
		{
			int temp = arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		print(arr);
		
	}
	

	private static void q2(Scanner sc) 
	{
		int[] arr = input(sc);
		int left =0,right=arr.length-1;
		while(left<right)
		{
			int temp = arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		print(arr);
		
	}



	private static void q1(Scanner sc, int i, int j) 
	{
		int[] arr = input(sc);
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		print(arr);
		
	}
	
	private static void print(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	private static int[] input(Scanner sc) 
	{
		System.out.print("Enter Length of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements of array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	

}
