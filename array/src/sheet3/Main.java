package sheet3;

import java.util.*;

public class Main 
{
	
	public static void main(String[] args) 
	{
		
		int[] arr;
		System.out.println("Question 1:");
		q1(new int[] {1, -10, 20, -30, 5});
		
		System.out.println("Question 2:");
		q2(new int[] {-1, 0, 1, 2, -1, -4});
		
		System.out.println("Question 3:");
		System.out.println(q3(new int[] {1, 0, -4, 3, 1, 0}));
		
		System.out.println("Question 4:");
		System.out.println(q4(new int[] {1, 2, 3, 4, 5}));
		
		System.out.println("Question 5:");
		System.out.println(q5(new int[] {1, 1, 2, 3, 5, 5}));
		
		System.out.println("Question 6:");
		q6(new int[] {1, 1, 3, 4, 5});
		
		System.out.println("Question 7:");
		arr = q7(new int[] {1, 2, 3, 4, 5, 6});
		print(arr);
		
		System.out.println("Question 8:");
		//System.out.println(q8(new int[] {2, 3, 1, 1, 4}));
		
		System.out.println("Question 9:");
		System.out.println(q9(new int[] {7, 1, 5, 3, 6, 4}));
		
		
		System.out.println("Question 10:");
		q10(new int[] {1,2,3},new int[] {1,2,3},0);
		//print(arr);

	}
	
	static boolean a = false;
	
	private static void q10(int[] arr,int[] arr1,int x) 
	{
		if(x==arr.length)
		{
			if(a)
			{
				a=false;
				arr=arr1;
				return ;
			}
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=arr1[i])
				{
					return;
				}
			}
			a=true;
			return;
		}
		
		for(int i=x;i<arr.length;i++)
		{
			swap(arr1,x,i);
			q10(arr,arr1,x+1);
			swap(arr1,x,i);
			
		}
		
	}
	
	static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
	
	
	


	private static int q9(int[] arr) 
	{
		int minPrice =Integer.MAX_VALUE;
		int maxProfit=0;
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]-minPrice)>maxProfit)
			{
				maxProfit=arr[i]-minPrice;
			}
			if(arr[i]<minPrice) minPrice=arr[i];
		}
		return maxProfit;
	}

	private static char[] q8(int[] arr) 
	{
		
		
		return null;
	}

	private static int[] q7(int[] arr) 
	{
		int left = 1;
		int right = arr.length%2==0?arr.length-1:arr.length-2;
		while(left<right)
		{
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left+=2;
			right-=2;
		}
		return arr;
	}

	private static void q6(int[] arr) 
	{
		int n = arr.length;
		int total = n*(n+1)/2;
		int sum=arr[0];
		
		int repeated=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				repeated = arr[i];
			}
			sum+=arr[i+1];
		}
		int missing = total-(sum-repeated);
		System.out.println("Missing: "+missing+"\nRepeated: "+repeated);
	}

	private static boolean q5(int[] arr) 
	{
		int totalSum =0;
		int prefixSum =0;
		for(int i=0;i<arr.length;i++) totalSum+=arr[i];
		
		for(int i=0;i<arr.length;i++)
		{

			prefixSum+=arr[i];
			int suffixSum = totalSum-prefixSum;
			if(prefixSum==suffixSum) return true;
			
		}
		return false;
	}

	private static int q4(int[] arr) 
	{
		int max=-1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]-arr[i]>max)max=arr[j]-arr[i];
			}
		}
		return max;
	}

	private static int q3(int[] arr) 
	{
		int max=0;
		for(int i=0; i<arr.length;i++)
		{
			int sum=0;
			int count=0;
			for(int j=i;j<arr.length;j++)
			{
				count++;
				sum+=arr[j];
				if(sum==0)
				{
					max=Math.max(max, count);
				}
			}
		}
		return max;
		
	}

	private static void q2(int[] arr) 
	{
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			int left = i+1;
			int right = arr.length-1;
			while(left<right)
			{
				int sum = arr[i]+arr[left]+arr[right];
				if(sum==0)
				{
					System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);
					break;
				}
				if(sum<0)
				{
					left++;
				}
				if(sum>0)
				{
					right--;
				}
			}
		}
		
	}

	private static void q1(int[] arr) 
	{
		int[] maxPair = new int[2];
		int[] minPair = new int[2];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int product = arr[i]*arr[j];
				if(product>max)
				{
					max=product;
					maxPair[0]=arr[i];
					maxPair[1]=arr[j];
				}
				
				if(product<min)
				{
					min=product;
					minPair[0]=arr[i];
					minPair[1]=arr[j];
				}
			}
		}
		
		System.out.println("Maximum Product : " + maxPair[0]+" "+ maxPair[1]);
		
		System.out.println("Minimum Product : " + minPair[0]+" "+ minPair[1]);
		
	}
	
	

	private static void print(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

	private static int[] input() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length of Array: ");
		int n =sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	

}
