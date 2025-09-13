package sheet1;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] arr;
		System.out.println("Question 1: ");
		arr = q1();
		print(arr);
		
		System.out.println("Question 2: ");
		q2(input());
		
		System.out.println("Question 3: ");
		q3(input());
		
		System.out.println("Question 4: ");
		q4(input());
		
		System.out.println("Question 5: ");
		q5(input());
		
		System.out.println("Question 6: ");
		q6(input());
		
		System.out.println("Question 7: ");
		q7(input());
		
		System.out.println("Question 8: ");
		q8(input());
		
		System.out.println("Question 9: ");
		q9(input());
		
		System.out.println("Question 10: ");
		q10(input());
		
		System.out.println("Question 11: ");
		q11(input(),input());
		
		System.out.println("Question 12: ");
		q12(input());
		
		System.out.println("Question 13: ");
		arr = q13(input());
		print(arr);
		
		System.out.println("Question 14: ");
		arr = q14(input());
		print(arr);
		
		System.out.println("Question 15: ");
		q15(input());
		
		System.out.println("Question 16: ");
		q16(input());
		
		System.out.println("Question 17: ");
		q17(input());
		
		System.out.println("Question 18: ");
		q18(input());
		
		System.out.println("Question 19: ");
		q19(input());
		
		System.out.println("Question 20: ");
		q20(input());
		
		System.out.println("Question 21: ");
		q21(input(),input());
		
		System.out.println("Question 22: ");
		arr = q22(input());
		print(arr);
		
		System.out.println("Question 23: ");
		q23(input());
		
		System.out.println("Question 24: ");
		arr = q24(input());
		print(arr);
		
		System.out.println("Question 25: ");
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println(q25(input(),n));
		
		System.out.println("Question 26: ");
		System.out.println("Enter n");
		n=sc.nextInt();
		System.out.println(q26(input(),n));
		
		System.out.println("Question 27: ");
		q27(input());
		
		System.out.println("Question 28: ");
		arr = q28(input(),input());
		print(arr);
		
		System.out.println("Question 29: ");
		arr = q29(input(),input());
		print(arr);
		
		System.out.println("Question 30: ");
		q30(input(),input());
	
	}
	
	private static void q30(int[] arr1, int[] arr2) 
	{
		int[] ans = new int[Math.max(arr1.length, arr2.length)];
		int[] ans2 = new int[Math.max(arr1.length, arr2.length)];
		
		int i=0;
		while(i<arr1.length && i<arr2.length)
		{
			ans[i]=arr1[i]+arr2[i];
			ans2[i]=arr1[i]*arr2[i];
			
			i++;
		}
		while(i<arr1.length)
		{
			ans[i]=arr1[i];
			ans2[i]=arr1[i];
			i++;
		}
		while(i<arr2.length)
		{
			ans[i]=arr2[i];
			ans2[i]=arr2[i];
			i++;
		}
		
		System.out.print("Sum= ");
		print(ans);
		System.out.print("Product= ");
		print(ans2);
		
	}

	private static int[] q29(int[] arr1, int[] arr2)
	{
		int[] ans = new int[Math.max(arr1.length, arr2.length)];
		
		int i=0;
		while(i<arr1.length && i<arr2.length)
		{
			ans[i]=arr1[i]*arr2[i];
			i++;
		}
		while(i<arr1.length)
		{
			ans[i]=arr1[i];
			i++;
		}
		while(i<arr2.length)
		{
			ans[i]=arr2[i];
			i++;
		}
		
		return ans;
		
	}

	private static int[] q28(int[] arr1, int[] arr2) 
	{
		int[] ans = new int[Math.max(arr1.length, arr2.length)];
		
		int i=0;
		while(i<arr1.length && i<arr2.length)
		{
			ans[i]=arr1[i]+arr2[i];
			i++;
		}
		while(i<arr1.length)
		{
			ans[i]=arr1[i];
			i++;
		}
		while(i<arr2.length)
		{
			ans[i]=arr2[i];
			i++;
		}
		
		return ans;
		
	}

	private static void q27(int[] arr) 
	{
		int[] ans = new int[arr.length];
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==arr[i]) count++;
			}
			ans[i]=count;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			int j=0;
			for(j=0;j<=i;j++)
			{
				if(arr[i]==arr[j]) break;
				
			}
			if(j==i)System.out.println("Occurence of "+arr[i]+" is "+ans[i]);
		}
		
	}

	private static int q26(int[] arr, int n) 
	{
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				count++;
			}
		}
		return count;
	}

	private static String q25(int[] arr, int n) 
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				
				return "Yes";
			}
		}
		return "No";
		
	}

	private static int[] q24(int[] arr) 
	{
		int[] ans = new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(prime(arr[i])) ans[k++]=arr[i];
		}
		int[] ans2 = new int[k];
		for(int i=0;i<k;i++)
		{
			ans2[i]=ans[i];
		}
		return ans2;
		
	}

	private static boolean prime(int i) 
	{
		int count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)count++;
		}
		return count==2;
	}

	private static void q23(int[] arr) 
	{
		int[] ans = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			ans[i]=digit(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" is a "+ans[i]+ " digit number");
		}
		
	}

	private static int[] q22(int[] arr) 
	{
		int[] ans = new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(digit(arr[i])==2) ans[k++]=arr[i];
		}
		int[] ans2 = new int[k];
		for(int i=0;i<k;i++)
		{
			ans2[i]=ans[i];
		}
		return ans2;
		
	}
	

	private static int digit(int i) 
	{
		int digit = 0;
		while(i!=0)
		{
			digit++;
			i/=10;
		}
		return digit;
	}

	private static void q21(int[] arr1, int[] arr2) 
	{
		int[] square = new int[arr1.length];
		int[] cube = new int[arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			square[i]=(int)Math.sqrt(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			cube[i]=(int)Math.cbrt(arr2[i]);
		}
		System.out.print("sqrt= ");
		print(square);
		System.out.print("cbrt= ");
		print(cube);
		
	}

	private static void q20(int[] arr) 
	{
		int[] square = new int[arr.length];
		int[] cube = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			square[i]=arr[i]*arr[i];
			cube[i]=arr[i]*arr[i]*arr[i];
		}
		System.out.print("Square= ");
		print(square);
		System.out.print("Cube= ");
		print(cube);
		
	}

	private static void q19(int[] arr) 
	{
		int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0) even+=1;
			if(arr[i]%2!=0) odd+=1;
		}
		System.out.println("Even= "+even+" Odd= "+odd);
		
	}

	private static void q18(int[] arr) 
	{
		int sum=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0) sum*=arr[i];
		}
		System.out.println(sum);
		
	}

	private static void q17(int[] arr) 
	{
		int sum=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0) sum*=arr[i];
		}
		System.out.println(sum);
		
	}

	private static void q16(int[] arr) 
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0) sum+=arr[i];
		}
		System.out.println(sum);
		
	}

	private static void q15(int[] arr) 
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0) sum+=arr[i];
		}
		System.out.println(sum);
	}

	private static int[] q14(int[] arr) 
	{
		int[] ans = new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0) ans[k++]=arr[i];
		}
		int[] ans2 = new int[k];
		for(int i=0;i<k;i++)
		{
			ans2[i]=ans[i];
		}
		return ans2;
		
	}

	private static int[] q13(int[] arr) 
	{
		int[] ans = new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0) ans[k++]=arr[i];
		}
		int[] ans2 = new int[k];
		for(int i=0;i<k;i++)
		{
			ans2[i]=ans[i];
		}
		return ans2;
		
	}

	private static void q12(int[] arr) 
	{
		int sum = 0;
		for(int i=0;i<arr.length;i++)sum+=arr[i];
		System.out.println(sum);
		
	}

	private static void q11(int[] arr1, int[] arr2) 
	{
		for(int i=0;i<Math.min(arr1.length, arr2.length);i++)
		{
			System.out.println(arr1[i]+" "+arr2[i]);
		}
		
	}

	private static void q10(int[] arr) 
	{
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max) max=arr[i];
			if(arr[i]<min) min=arr[i];
		}
		System.out.println("Span = "+ (max-min));
		
	}

	private static void q9(int[] arr) 
	{
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max) max=arr[i];
		}
		System.out.println(max);
		
	}

	private static void q8(int[] arr) 
	{
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min) min=arr[i];
		}
		System.out.println(min);
		
	}

	private static void q7(int[] arr) 
	{
		for(int i=arr.length/2;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

	private static void q6(int[] arr) 
	{
		for(int i=(arr.length/2)-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	private static void q5(int[] arr) 
	{
		for(int i=arr.length-1;i>=arr.length/2;i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

	private static void q4(int[] arr) 
	{
		for(int i=0;i<arr.length/2;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

	private static void q3(int[] arr)
	{
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	private static void q2(int[] arr) 
	{
		print(arr);
		
	}


	private static int[] q1() 
	{
		int[] arr = input();
		
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
