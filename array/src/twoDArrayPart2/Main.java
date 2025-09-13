package twoDArrayPart2;

import java.util.Arrays;

public class Main 
{

	public static void main(String[] args) 
	{
		int[][] arr;
		int n;
		int i;
		int j;
		System.out.println("Question 1 :");
		n=16;
		q1(new int[][] {{11, 12, 13},{14, 15, 16},{17, 18, 19}},n);
		
		System.out.println("Question 2 :");
		arr = q2(new int[][] { {2, 4, 6},{8, 10, 12},{14, 16, 18} },new int[][] { {1, 3, 5},{7, 9, 11},{13, 15, 17} });
		print(arr);
		
		System.out.println("Question 3 :");
		arr = q3(new int[][] { {15, 20, 25},{30, 35, 40},{45, 50, 55} },new int[][] { {5, 10, 15},{10, 15, 20},{15, 20, 25} });
		print(arr);
		
		System.out.println("Question 4 :");
		//arr = q4(new int[][] { {2, 3, 4},{1, 0, 5} },new int[][] { {1, 2},{3, 4},{5, 6} });
		//print(arr);
		
		
		System.out.println("Question 5 :");
		q5(new int[][] { {10, 20, 30, 40},{50, 60, 70, 80},{90, 100, 110, 120},{130, 140, 150, 160} });
		
		System.out.println("Question 6 :");
		q6(new int[][] { {10, 20, 30, 40},{50, 60, 70, 80},{90, 100, 110, 120},{130, 140, 150, 160} });
		
		System.out.println("Question 7 :");
		q7(new int[][] { {1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12} });
		System.out.println();
		System.out.println("Question 8 :");
		q8(new int[][] { { 5, 10, 15},{20, 25, 30},{35, 40, 45} });
		System.out.println();
		System.out.println("Question 9 :");
		q9(new int[][] { { 1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}, {13, 14, 15, 16} });
		System.out.println();
		System.out.println("Question 10 :");
		q10(new int[][] { { 10, 20, 30, 40},{50, 60, 70, 80},{90, 100, 110, 120}, {130, 140, 150, 160} });
		System.out.println();
		System.out.println("Question 11 :");
		q11(new int[][] { { 10, 20, 30, 40},{50, 60, 70, 80},{90, 100, 110, 120}, {130, 140, 150, 160} });
		
		System.out.println("Question 12 :");
		q12(new int[][] { { 5, 6, 7, 8},{8, 6, 5, 9},{5, 10, 6, 8} });
		
		System.out.println("Question 13 :");
		System.out.println(q13(new int[][] { { 5, 3, 1},{4, 6, 7},{8, 2, 9} }));
		
		System.out.println("Question 14 :");
		i=3;
		j=3;
		arr = q14(new int[] {1, 2, 3, 4, 5},i,j);
		print(arr);
		
		System.out.println("Question 15 :");
		q15(new int[][] { { 0, 0, 1, 0},{ 1, 0, 0, 1},{ 0, 0, 0, 1}, { 1, 0, 1, 0} });
		

		
	}
	
	private static void q15(int[][] arr) 
	{
//		boolean left = false;
//		boolean right = true;
//		boolean top = false;
//		boolean bottom = false;
//		int i=0;
//		int j=0;
//		int[] indx = new int[2];
//		while(true)
//		{
//			if(i>=arr.length || i<0 || j>=arr[0].length || j<0)
//			{
//				System.out.println(indx[0]+","+indx[1]);
//			    return;
//			}
//			if(arr[i][j]==1)
//			{
//				if(left) 
//				{
//					left=false;
//					top=true;
//				}
//				else if(right) 
//				{
//					right=false;
//					bottom=true;
//				}
//				else if(top) 
//				{
//					top=false;
//					right=true;
//				}
//				else if(bottom) 
//				{
//					bottom=false;
//					left=true;
//				}
//			}
//			if(left)
//			{
//				indx[0]=i;
//				indx[1]=j;
//				j--;
//			}
//			else if(right)
//			{
//				indx[0]=i;
//				indx[1]=j;
//				j++;
//			}
//			else if(top)
//			{
//				indx[0]=i;
//				indx[1]=j;
//				i--;
//			}
//			else if(bottom)
//			{
//				indx[0]=i;
//				indx[1]=j;
//				i++;
//			}
//		}
		
		
		int i=0;
		int j=0;
		int dir = 0;
		while(true)
		{
			dir+=arr[i][j];
			
			
			
			
			if(dir%4 ==0)
			{
				j++;
			}
			else if(dir%4 ==1)
			{
				i++;
			}
			else if(dir%4 ==2)
			{
				j--;
			}
			else if(dir%4 ==3)
			{
				i--;
			}
			
			if(i<0)
			{
				i++;
				System.out.println(i+" "+j);
				return;
			}
			else if (i>=arr.length)
			{
				i--;
				System.out.println(i+" "+j);
				return;
			}
			else if (j<0)
			{
				j++;
				System.out.println(i+" "+j);
				return;
			}
			else if (j>=arr[0].length)
			{
				j--;
				System.out.println(i+" "+j);
				return;
			}
		}
	}

	private static int[][] q14(int[] arr,int i,int j) 
	{
		int[][] ans = new int[i][j];
		int k=0;
		for(int[] a : ans) Arrays.fill(a,-1);
		for(int x=0;x<ans.length;x++)
		{
			for(int y=0;y<ans[x].length &&  k<arr.length;y++)
			{
				ans[x][y]=arr[k++];
			}
		}
		return ans;
	}



	private static int q13(int[][] arr) 
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(ascending(arr[i]) || descending(arr[i]))
			{
				count++;
			}
		}
		return count;
		
	}



	private static boolean ascending(int[] arr) 
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i+1]<=arr[i]) return false;
		}
		return true;
	}



	private static boolean descending(int[] arr) 
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i+1]>=arr[i]) return false;
		}
		return true;
	}



	private static void q12(int[][] arr) 
	{
		for(int j=0;j<arr[0].length;j++)
		{
			int n = arr[0][j];
			int count = 1;
			for(int i=1;i<arr.length;i++)
			{
				for(int k=0;k<arr[i].length;k++)
				{
					if(n==arr[i][k]) count++;
				}
			}
			if(count==arr.length) System.out.print(n+" ");
		}
		System.out.println();
		
	}



	private static void q11(int[][] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==0 || i==arr.length-1)
				{
					System.out.print(arr[i][j]+" ");
				}
				else 
				{
					if(j==0 || j==arr[i].length-1)
					{
						System.out.print(arr[i][j]+" ");
					}
					else 
					{
						System.out.print("   ");
					}
				}
			}
			System.out.println();
		}
		
	}



	private static void q10(int[][] arr) 
	{
		boolean check = true;
		int k=0;
		int i=0;
		int j=0;
		while(k<arr.length)
		{
			if(check)
			{
				j=0;
				i=k;
				while(i>=0)
				{
					System.out.print(arr[i--][j++]+" ");
				}
			}
			else 
			{
				j=k;
				i=0;
				while(j>=0)
				{
					System.out.print(arr[i++][j--]+" ");
				}
			}
			k++;
			check=!check;
		}
		
		
		
		check = true;
		k=1;
		while(k<arr.length)
		{
			if(check)
			{
				j=arr[0].length-1;
				i=k;
				while(i<arr.length)
				{
					System.out.print(arr[i++][j--]+" ");
				}
			}
			else 
			{
				j=arr[0].length-k;
				i=arr.length-1;
				while(j<arr[0].length)
				{
					System.out.print(arr[i--][j++]+" ");
				}
			}
			k++;
			check=!check;
		}
		
	}



	private static void q9(int[][] arr) 
	{
		int k=0;
		int i=0;
		int j=0;
		while(k<arr.length)
		{
			j=0;
			i=k;
			while(i>=0)
			{
				System.out.print(arr[i--][j++]+" ");
			}
			k++;
		}
		k=1;
		while(k<arr[0].length)
		{
			j=k;
			i=arr.length-1;
			while(j<arr[0].length)
			{
				System.out.print(arr[i--][j++]+" ");
			}
			k++;
		}
		
	}



	private static void q8(int[][] arr) 
	{
		int k=0;
		int i=0;
		int j=0;
		while(k<arr.length)
		{
			i=0;
			j=k;
			while(j<arr[0].length)
			{
				System.out.print(arr[i++][j++]+" ");
			}
			k++;
		}
		
	}



	private static void q7(int[][] arr) 
	{
		int i=0;
		int j=0;
		boolean left = true;
		while(i<arr.length)
		{
			if(left)
			{
				while(j<arr[0].length)
				{
					System.out.print(arr[i][j]+" ");
					j++;
				}
				j--;
			}
			else
			{
				while(j>=0)
				{
					System.out.print(arr[i][j]+" ");
					j--;
				}
				j++;
			}
			i++;
			left=!left;
		}
		
	}
	
	private static void q6(int[][] arr) 
	{
		int i=arr.length-1;
		int j=arr[0].length-1;
		boolean down = false;
		while(j>=0)
		{
			if(down)
			{
				while(i<arr.length)
				{
					System.out.print(arr[i][j]+" ");
					i++;
				}
				i--;
			}
			else
			{
				while(i>=0)
				{
					System.out.print(arr[i][j]+" ");
					i--;
				}
				i++;
			}
			j--;
			down=!down;
		}
		System.out.println();
		
	}

	private static void q5(int[][] arr) 
	{
		int i=0;
		int j=0;
		boolean down = true;
		while(j<arr[0].length)
		{
			if(down)
			{
				while(i<arr.length)
				{
					System.out.print(arr[i][j]+" ");
					i++;
				}
				i--;
			}
			else
			{
				while(i>=0)
				{
					System.out.print(arr[i][j]+" ");
					i--;
				}
				i++;
			}
			j++;
			down=!down;
		}
		System.out.println();
		
		
	}

	private static int[][] q4(int[][] arr1, int[][] arr2) 
	{
		if(arr1.length!=arr2[0].length)
		{
			System.out.println("Matrix are not of same size");
			return null;
		}

		int[][] ans = new int[(int)Math.min(arr1.length, arr2.length)][(int)Math.min(arr1[0].length, arr2[0].length)];
		
		if(arr1.length<arr2.length)
		{
			int k=0;
			for(int i=0;i<arr1.length;i++)
			{
				int sum =0;
				for(int j=0;j<arr2[i].length;j++)
				{
					sum+=arr1[i][j]*arr2[j][i];
				}
				ans[i][k++]=sum;
			}
		}
		else 
		{
			for(int i=0;i<arr2.length;i++)
			{
				int sum=0;
				int k=0;
				for(int j=0;j<arr1[i].length;j++)
				{
					sum+=arr2[i][j]*arr1[j][i];
				}
				ans[i][k++]=sum;
			}
		}
		return ans;
	}

	private static int[][] q3(int[][] arr1, int[][] arr2) 
	{
		if(arr1.length!=arr2.length || arr1[0].length!=arr2[0].length)
		{
			System.out.println("Matrix are not of same size");
			return null;
		}
		int[][] ans = new int[arr1.length][arr1[0].length];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				ans[i][j]=arr1[i][j]-arr2[i][j];
			}
		}
		return ans;
	}

	
	private static int[][] q2(int[][] arr1, int[][] arr2) 
	{
		int[][] ans = new int[arr1.length][arr1[0].length];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				ans[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		return ans;
	}

	private static void q1(int[][] arr, int n) 
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]==n)
				{
					System.out.println("Element "+n+" found at index : ["+i+"]"+"["+j+"]" );
				}
			}
		}
	}

	private static void print(int[][] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
