package array;

import java.util.Arrays;

public class JuneTwelve 
{

	public static void main(String[] args) 
	{
		//Insertion Sort
//		int[] arr = {12, 11, 13, 5, 6};
//		q2(arr);
//		System.out.println(Arrays.toString(arr));
//		
//		System.out.println("Question 4");
//		double[] d = {2.56, 1.1, 3.141, 0.567, 2.0};
//		q4(d);
//		System.out.println(Arrays.toString(d));
//		
//		String[] string = {"apple", "banana", "grape", "kiwi"};
//		q5(string);
//		System.out.println(Arrays.toString(string));
		
		
		// 2D array
		
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		print(arr);
		

	}
	
	private static void print(int[][] arr) 
	{
		for(int i =0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private static void q5(String[] arr) 
	{
		for(int i=1;i<arr.length;i++)
		{
			String key = arr[i];
			int j=i-1;
			while(j>=0 && vowels(arr[j])>=vowels(key))
			{
				if(vowels(arr[j])==vowels(key) && !checkAlphabet(arr[j],key))
				{
					break;
					
				}
				arr[j+1]=arr[j];
				j--;
			}
			arr[++j]=key;
		}
		
	}

	private static int vowels(String s)
	{
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			char a = s.charAt(i);
			
			if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
			{
				count++;
			}
		}
		return count;
	}

	private static void q4(double[] d) 
	{
		for(int i=1;i<d.length;i++)
		{
			double key = d[i];
			int j=i-1;
			while(j>=0 && d[j]>key)
			{
				d[j+1]=d[j];
				j--;
			}
			
			d[++j]=key;
			
		}
		
	}

	private static void q3(String[] strings) 
	{
		for(int i=1;i<strings.length;i++)
		{
			String key =strings[i];
			int j=i-1;
			while(j>=0 && strings[j].length()>=key.length())
			{
				if(strings[j].length()==key.length() && checkAlphabet(strings[j],key))
				{
					break;
				}
				strings[j+1]=strings[j];
				j--;
			}
			strings[j+1]=key;
		}
		
	}

	private static boolean checkAlphabet(String string, String key) 
	{
		int i=0;
		while(i<string.length() && i<key.length())
		{
			if(string.charAt(i)>key.charAt(i))
			{
				return false;
			}
			i++;
		}
		return true;
	}

	private static void q2(int[] arr) 
	{
		for(int i=1;i<arr.length;i++)
		{
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]<key) arr[j+1]=arr[j--];
			arr[++j]=key;
		}
		
	}
	
	

}
