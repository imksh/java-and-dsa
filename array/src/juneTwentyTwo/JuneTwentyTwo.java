package juneTwentyTwo;

public class JuneTwentyTwo 
{

	public static void main(String[] args) 
	{
		System.out.println("Two Dimensional Array : Sheet Number 2 :- ");
		
		System.out.println("Question 2");
		q2(new int[][] { {2, 4, 6},{8, 10, 12},{14, 16, 18} },new int[][] { {1, 3, 5},{7, 9, 11},{13, 15, 17} } );
		
		System.out.println("Question 3");
		q3(new int[][] { {15, 20, 25},{30, 35, 40},{45, 50, 55} },new int[][] { {5, 10, 15},{10, 15, 20},{15, 20, 25} });
		
		System.out.println("Question 7");
		q7(new int[][] { {1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12} });
		
		System.out.println("Question 8 :");
		q8(new int[][] { { 5, 10, 15},{20, 25, 30},{35, 40, 45} });
		
		System.out.println("Question 9 :");
		q9(new int[][] { { 1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}, {13, 14, 15, 16} });
		
	}
	
	private static void q9(int[][] arr) 
	{
		int k=0;
		
		while(k<arr.length)
		{
			int i = k;
			int j=0;
			while(i>=0)
			{
				System.out.print(arr[i--][j++]+" ");
			}
			k++;
		}
		
		k=1;
		while(k<arr[0].length)
		{
			int j = k;
			int i=arr.length-1;
			while(j<arr[0].length)
			{
				System.out.print(arr[i--][j++]+" ");
			}
			k++;
		}
		
	}

	private static void q8(int[][] is) 
	{
		
		
	}

//	Write a program to perform snake traversal of
//	the given 2D matrix. Snake traversal of a matrix
//	involves traversing it in a zigzag manner. For example,
//	the first row is traversed left to right, the second row is
//	traversed right to left, and so on.
	
	private static void q7(int[][] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				for(int j=arr[i].length-1;j>=0;j--)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			else 
			{
				for(int j=0;j<arr[i].length;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
		}
		
	}

//	Que 2.Write a program to perform the addition of two
//	matrices. The program should take two 2D arrays of
//	the same size as input and output their sum matrix.
//	Example
//	Input: Matrix A: { {2, 4, 6},
//	{8, 10, 12},
//	{14, 16, 18} };
//	Matrix B: { {1, 3, 5},
//	{7, 9, 11},
//	{13, 15, 17} };
	
	
	private static void q2(int[][] arr1, int[][] arr2) 
	{
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				System.out.print((arr1[i][j]+arr2[i][j])+" ");
			}
			System.out.println();
		}
		
	}
	
	private static void q3(int[][] arr1, int[][] arr2) 
	{
		if(arr1.length!=arr2.length || arr1[0].length!=arr1[0].length)
		{
			System.out.println("Not Possible");
			return;
		}
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				System.out.print((arr1[i][j]-arr2[i][j])+" ");
			}
			System.out.println();
		}
		
	}

	

}
