package sheet2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) 
	{
		int[] arr;
		int n;
		
//		System.out.println("Question 1:");
//		arr = q1(input(),1,3);
//		print(arr);
//		
//		System.out.println("Question 2:");
//		arr = q2(input());
//		print(arr);
//		
//		System.out.println("Question 3:");
//		arr = q3(input(),2);
//		print(arr);
//		
//		System.out.println("Question 4:");
//		System.out.println(q4(input()));
//		
//		System.out.println("Question 5:");
//		System.out.println(q5(input()));
//		
//		System.out.println("Question 6:");
//		System.out.println(q6(input(),4));
//		
//		System.out.println("Question 7:");
//		System.out.println(q7(input(),3));
//		
//		System.out.println("Question 8:");
//		System.out.println(q8(input()));
//		
//		System.out.println("Question 9:");
//		System.out.println(q9(input()));
//		
//		System.out.println("Question 10:");
//		arr = q10(input());
//		print(arr);
//		
//		System.out.println("Question 11:");
//		arr = q11(input());
//		print(arr);
//		
//		System.out.println("Question 12:");
//		arr = q12(input());
//		print(arr);
//		
//		System.out.println("Question 13:");
//		arr = q13(input(),4);
//		print(arr);
//		
//		System.out.println("Question 14:");
//		arr = q14(new int[] {8,-2,-1,1,-3,5});
//		print(arr);
//		
		System.out.println("Question 15:");
		arr = q15(input(),input());
		print(arr);
		
		System.out.println("Question 16:");
		arr = q16(input(),input());
		print(arr);
		
		System.out.println("Question 17:");
		System.out.println(q17(input()));
		
		System.out.println("Question 18:");
		System.out.println(q18(input()));
		
		System.out.println("Question 19:");
		System.out.println(q19(input()));
		
		System.out.println("Question 20:");
		System.out.println(q20(input()));
		
		System.out.println("Question 21:");
		q21(input(),input());
		
		System.out.println("Question 22:");
		System.out.println(q22(input()));;
		
		System.out.println("Question 23:");
		arr = q23(input());
		print(arr);
		System.out.println("Question 24:");
		n=6;
		arr = q24(input(),n);
		print(arr);
		
		System.out.println("Question 25:");
		n=15;
		System.out.println(q25(new int[] {10, 5, 2, 7, 1, 9},n));
		
		System.out.println("Question 26:");
		System.out.println(q26(input()));
		
	}

	private static int q26(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			boolean check = true;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && i!=j) check=false;
			}
			if(check) return arr[i];
		}
		
		return -1;
	}

	private static int q25(int[] arr, int n) 
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			int j=i;
			int count =0;
			int sum=0;
			while(j<arr.length)
			{
				sum+=arr[j];
				count++;
				if(sum==n)
				{
					max = Math.max(max, count);
					break;
				}
				j++;
				
			}
		}
		return max;
	}

	private static int[] q24(int[] arr, int n) 
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==n) return new int[] {i,j};
			}
		}
		
		return new int[] {-1,-1};
	}

	private static int[] q23(int[] arr) 
	{
		
		int[] ans = new int[arr.length];
		int k=arr.length-1;
		int temp = Integer.MIN_VALUE;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]>temp)
			{
				ans[k--]=arr[i];
				temp=arr[i];
			}
		}
		int i=0;
		while(ans[i]==0)
		{
			i++;
		}
		int[] ans2 = new int[ans.length-i];
		int j=ans.length-i-1;
		for(i=arr.length-1;i>k;i--)
		{
			ans2[j--]=ans[i];
		}
		
		return ans2;
	}

	private static int q22(int[] arr) 
	{
		int i=0;
		
		while(i<arr.length)
		{
			if(i+1<arr.length && arr[i]<=arr[i+1])
			{
				while(i+1<arr.length && arr[i]<=arr[i+1])
				{
					i++;
				}
				return arr[i];
			}
			
			i++;
		}
		
		return -1;
	}

	private static void q21(int[] arr1, int[] arr2) 
	{
		for(int i=0;i<arr1.length;i++)
		{
			int temp = arr1[i];
			arr1[i]=arr2[i];
			arr2[i]=temp;
		}
		
		
	}

	private static int q20(int[] arr) 
	{
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])count++;
			}
			if(count>arr.length/2) return arr[i];
			count=0;
		}
		return -1;
	}

	private static int q19(int[] arr) 
	{
		int ans = 0;
		for(int i=0;i<arr.length;i++)
		{
			ans^=arr[i];
		}
		
		return ans;
	}

	private static int q18(int[] arr) 
	{
		int count =0;
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0) 
			{
				count++;
			}
			else
			{
				max=Math.max(max, count);
				count=0;
			}
		}
		max=Math.max(max, count);
		return max;
	}

	private static int q17(int[] arr) 
	{
		for(int i=0;i<=arr.length;i++)
		{
			boolean check = true;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==i) check=false;
			}

			if(check) 
			{
				return i;
			}
		}
		return -1;
		
	}

	private static int[] q16(int[] arr1, int[] arr2) 
	{
		
		int[] ans = new int[arr1.length+arr2.length];
		
		int k=0;
		for(int i=0;i<arr1.length;i++)
		{
			boolean check = true;
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j]) check=false;
			}
			if(check) ans[k++] =arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			boolean check = true;
			for(int j=i+1;j<arr2.length;j++)
			{
				if(arr1[i]==arr1[j]) check=false;
			}
			
			for(int j=0;j<k;j++)
			{
				if(arr2[i]==ans[j]) check=false;
			}
			if(check) ans[k++] =arr2[i];
		}
		
		int[] ans2 = new int[k];
		for(int i=0;i<ans2.length;i++)
		{
			ans2[i]=ans[i];
		}

		
		
		return ans2;
		
	}

	private static int[] q15(int[] arr1, int[] arr2) 
	{
		int[] ans = new int[arr1.length+arr2.length];
		
		int k=0;
		int i=0;
		int j=0;
		while(i<arr1.length && j< arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				ans[k]=arr1[i];
				i++;
			}
			else 
			{
				ans[k]=arr2[j];
				j++;
			}
			k++;
		}
		while(i<arr1.length)
		{
			ans[k++]=arr1[i];
			i++;
		}
		while(i<arr1.length)
		{
			ans[k++]=arr2[j];
			j++;
		}
		
		return ans;
	}

	private static int[] q14(int[] arr) 
	{
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				swap(arr, i, k);
				k++;
			}
		}
		return arr;
		
	}

	private static void swap(int[] arr, int i, int j) 
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

	private static int[] q13(int[] arr, int k) 
	{
		k=k%arr.length;
		
		int i=0;
		int j=k-1;
		while(i<j)
		{
			int temp  = arr[i];
			arr[i] = arr[j];
			arr[j]= temp;
			i++;
			j--;
		}
		i=k;
		j=arr.length-1;
		while(i<j)
		{
			int temp  = arr[i];
			arr[i] = arr[j];
			arr[j]= temp;
			i++;
			j--;
		}
		
		i=0;
		j=arr.length-1;
		while(i<j)
		{
			int temp  = arr[i];
			arr[i] = arr[j];
			arr[j]= temp;
			i++;
			j--;
		}
		
		return arr;
		
	}

	private static int[] q12(int[] arr) 
	{
		if(arr.length==0) return arr;
		int swap = arr[0];
		int n= arr.length-1;
		while(n>=0)
		{
			int temp = swap;
			swap = arr[n];
			arr[n] = temp;
			n--;
		}
		return arr;
		
	}

	private static int[] q11(int[] arr) 
	{
		if(arr.length==0) return arr;
		int swap = arr[arr.length-1];
		for(int i=0;i<arr.length;i++)
		{
			int temp = swap;
			swap = arr[i];
			arr[i] = temp;
		}
		return arr;
		
	}

	private static int[] q10(int[] arr) 
	{
		int[] ans = new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			boolean check=true;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) check=false;
			}
			if(check) ans[k++]=arr[i];
		}
		
		int[] ans2 = new int[k];
		for(int i=0;i<k;i++)
		{
			ans2[i]=ans[i];
		}
		
		return ans2;
		
	}

	private static int q9(int[] arr) 
	{
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			boolean check=true;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) check=false;
			}
			if(check) count++;
		}
		return count;
		
	}

	private static boolean q8(int[] arr) 
	{
		if(arr.length==0)
		{
			return true;
		}
		int prev=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<prev) 
			{
				return false;
			}
			prev=arr[i];
		}
		return true;
		
	}

	private static int q7(int[] arr, int k) 
	{
		int min=Integer.MIN_VALUE;
		int min2=Integer.MAX_VALUE;
		while(k>0)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]<min2 && arr[i]>min)
				{
					min2=arr[i];
				}
			}
			min=min2;
			min2=Integer.MAX_VALUE;
			k--;
		}
		
		return min==Integer.MAX_VALUE ?-1:min;

		
	}

	private static int q6(int[] arr, int k) 
	{
		int max=Integer.MAX_VALUE;
		int max2=Integer.MIN_VALUE;
		while(k>0)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>max2 && arr[i]<max)
				{
					max2=arr[i];
				}
			}
			max=max2;
			max2=Integer.MIN_VALUE;
			k--;
		}
		
		return max==Integer.MIN_VALUE?-1:max;

	}

	private static int q5(int[] arr) 
	{
		int min=Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min2=min;
				min=arr[i];
			}
			else if(arr[i]<min2 && arr[i] != min)
			{
				min2=arr[i];
			}
			
		}
		return min2==Integer.MAX_VALUE?-1:min2;
		
	}

	private static int q4(int[] arr) 
	{
		int max=Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max2=max;
				max=arr[i];
			}
			else if(arr[i]>max2 && arr[i] != max)
			{
				max2=arr[i];
			}
			
		}
		return max2==Integer.MIN_VALUE?-1:max2;
		
	}

	private static int[] q3(int[] arr,int k) 
	{
		int left = k+1;
		int right = arr.length-1;
		while(left<right)
		{
			int temp = arr[left];
			arr[left]=arr[right];
			arr[right]= temp;
			left++;
			right--;
		}
		return arr;
		
	}

	private static int[] q2(int[] arr) 
	{
		int left = 0;
		int right = arr.length-1;
		while(left<right)
		{
			int temp = arr[left];
			arr[left]=arr[right];
			arr[right]= temp;
			left++;
			right--;
		}
		return arr;
		
	}

	private static int[] q1(int[] arr, int i, int j) 
	{
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]= temp;
		return arr;
		
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
