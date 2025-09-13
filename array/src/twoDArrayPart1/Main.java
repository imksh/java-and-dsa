package twoDArrayPart1;

public class Main {

	public static void main(String[] args) 
	{
		int[][] arr;
		System.out.println("Question 1 :");
		q1(new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} });
		
		System.out.println("Question 2 :");
		q2(new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} });
		
		System.out.println("Question 3 :");
		q3(new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} });
		
		System.out.println("Question 4 :");
		q4(new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} });
		
		System.out.println("Question 5 :");
		q5(new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} });
		
		System.out.println("Question 6 :");
		q6(new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} });
		
		System.out.println("Question 7 :");
		q7(new int[][] { {12, 5, 18}, {7, 16, 23}, {20, 30, 45} });
		
		System.out.println("Question 8 :");
		arr= q8(new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} });
		print(arr);
		
		System.out.println("Question 9 :");
		arr= q9(new int[][] { {5, -2, 3},{-4, 7, -1},{8, -9, 10}});
		print(arr);
		
		System.out.println("Question 10 :");
		arr= q10(new int[][] { {15, 25, 35},{40, 50, 60},{70, 80, 90} });
		print(arr);
		
		System.out.println("Question 11 :");
		arr= q11(new int[][] { {15, 25, 35},{40, 50, 60},{70, 80, 90} });
		print(arr);
		
		System.out.println("Question 12 :");
		arr= q12(new int[][] { {12, 5, 8},{22, 11, 18},{9, 25, 16} });
		print(arr);
		
		System.out.println("Question 13 :");
		arr= q13(new int[][] { {12, 5, 8},{22, 11, 18},{9, 25, 16} });
		print(arr);
		
		System.out.println("Question 14 :");
		System.out.println(q14(new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }));
		
		System.out.println("Question 15 :");
		arr= q15(new int[][] { {1, 2, 3},{4, 5, 6},{7, 8, 9} });
		print(arr);
		
		System.out.println("Question 15 :");
		arr= q16(new int[][] { {1, 2, 3},{4, 5, 6},{7, 8, 9} });
		print(arr);
		
		System.out.println("Question 17 :");
		q17(new int[][] { {34, 12, 56},{87, 9, 14},{42, 73, 5}});
		
		System.out.println("Question 18 :");
		q18(new int[][] { {34, 12, 56},{87, 9, 14},{42, 73, 5}});
		
		System.out.println("Question 19 :");
		q19(new int[][] { {34, 12, 56},{87, 9, 14},{42, 73, 5}});
		
		System.out.println("Question 20 :");
		q20(new int[][] { {15, 32, 9, 18},{40, 27, 56, 3},{8, 13, 22, 7},{41, 12, 17, 24} });
		

	}

	private static void q20(int[][] arr) 
	{
		int odd=0;
		int even = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]%2==0) even++;
				if(arr[i][j]%2!=0) odd++;
			}
		}
		System.out.println("Even element count = "+even);
		System.out.println("Odd element count = "+odd);
		
	}

	private static void q19(int[][] arr) 
	{
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				min = Math.min(min, arr[i][j]);
				max=Math.max(max, arr[i][j]);
			}
		}
		System.out.println("Maximum element = "+max);
		System.out.println("Minimum element = "+min);
		
	}

	private static void q18(int[][] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			int max = Integer.MIN_VALUE;
			int x=0;
			int y=0;
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[j][i]>max)
				{
					max=arr[j][i];
					x=j;
					y=i;
				}
			}
			System.out.println("Column "+ i + " : Max = "+ max + " , Index = ("+ x +", "+y+")");
		}
		
	}

	private static void q17(int[][] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			int min = Integer.MAX_VALUE;
			int x=0;
			int y=0;
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]<min)
				{
					min=arr[i][j];
					x=i;
					y=j;
				}
			}
			System.out.println("Row "+ (i+1) + " : Min = "+ min + " , Index = ("+ x +", "+y+")");
		}
		
	}

	private static int[][] q16(int[][] arr) 
	{
		int[][] ans = new int[arr.length][1];
		for(int i=0;i<arr.length;i++)
		{
			int sum =0;
			for(int j=0;j<arr.length;j++)
			{
				sum+=arr[j][i];
			}
			ans[i][0]=sum;
		}
		return ans;
	}

	private static int[][] q15(int[][] arr) 
	{
		int[][] ans = new int[arr.length][1];
		for(int i=0;i<arr.length;i++)
		{
			int sum =0;
			for(int j=0;j<arr[i].length;j++)
			{
				sum+=arr[i][j];
			}
			ans[i][0]=sum;
		}
		return ans;
	}

	private static int q14(int[][] arr) 
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==j || i+j==arr.length-1)
				{
					sum+=arr[i][j];
				}
			}
			
		}
		return sum;
	}

	private static int[][] q13(int[][] arr) 
	{
		for(int j=0;j<arr.length;j++)
		{
			for(int i=0;i<arr.length;i++)
			{
				for(int k=0;k<arr.length-i-1;k++)
				{
					if(arr[k][j]>arr[k+1][j])
					{
						int temp = arr[k][j];
						arr[k][j]=arr[k+1][j];
						arr[k+1][j]=temp;
					}
				}
			}
		}
		return arr;
	}
	
	private static int[][] q13A(int[][] arr) 
	{
		int cols = arr[0].length;
		int rows = arr.length;
		for(int col =0;col<cols;col++)
		{
			int[] temp = new int[arr.length];
			for(int row = 0;row <rows;row++)
			{
				temp[row]=arr[row][col];
			}
			
			sort(temp);
			for(int row = 0;row <rows;row++)
			{
				arr[row][col]=temp[row];
			}
			
		}
		return arr;
	}
	
	

	private static int[][] q12(int[][] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i].length-j-1;k++)
				{
					if(arr[i][k]>arr[i][k+1])
					{
						int temp = arr[i][k];
						arr[i][k]=arr[i][k+1];
						arr[i][k+1]=temp;
					}
				}
			}
		}
		return arr;
	}

	private static int[][] q11(int[][] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			int temp = arr[i][0];
			arr[i][0]=arr[i][arr[i].length-1];
			arr[i][arr[i].length-1]=temp;
		}
		return arr;
	}

	private static int[][] q10(int[][] arr) 
	{
		int[] temp = arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		return arr;
	}

	private static int[][] q9(int[][] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]<0) arr[i][j]=0;
			}
		}
		return arr;
	}

	private static int[][] q8(int[][] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]*=10;
			}
			
		}
		return arr;
		
	}

	private static void q7(int[][] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]%2==0)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			
		}
		System.out.println();
		
	}

	private static void q6(int[][] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i<j)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
			
		}
		
	}

	private static void q5(int[][] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i>j)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
			
		}
		
	}

	private static void q4(int[][] arr) 
	{
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==j || i+j==arr.length-1)
				{
					System.out.print(arr[i][j]+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		
	}

	private static void q3(int[][] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i][0]+" "+arr[i][arr[i].length-1]);
		}
		
	}

	private static void q2(int[][] arr) 
	{
		for(int j=0;j<arr[0].length;j++)
		{
			System.out.print(arr[0][j]+" ");
		}
		System.out.println();
		
		for(int j=0;j<arr[arr.length-1].length;j++)
		{
			System.out.print(arr[arr.length-1][j]+" ");
		}
		System.out.println();

		
	}

	private static void q1(int[][] arr) 
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
	
	private static void sort(int[] temp) 
	{
		for(int i=0;i<temp.length;i++)
		{
			for(int j=0;j<temp.length-i-1;j++)
			{
				if(temp[j]>temp[j+1])
				{
					int x = temp[j];
					temp[j]=temp[j+1];
					temp[j+1]=x;
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
