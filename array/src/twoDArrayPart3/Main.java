package twoDArrayPart3;

public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println("Question 1 :");
		q1(new int[][] { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16} });
		
		System.out.println("Question 2 :");
		q2(new int[][] { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16} });
		
		System.out.println("Question 3 :");
		q3(new int[][] { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16} },6);

		System.out.println("Question 4 :");
		q4(new int[][] { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16} });

	}

	private static void q4(int[][] arr) 
	{
		
		
	}

	private static void q3(int[][] arr, int k) 
	{
		if(k>arr.length*arr[0].length)
		{
			System.out.println("Invalid input");
			return;
		}
		int left = 0;
		int right = arr[0].length-1;
		int top = 0;
		int bottom = arr.length-1;
		
		while(left<=right && top<=bottom)
		{
			for(int i=left;i<right;i++)
			{
				k--;
				if(k==0)
				{
					System.out.println(arr[top][i]);
					return;
					
				}
			}
			
			for(int i=top;i<bottom;i++)
			{
				k--;
				if(k==0)
				{
					System.out.println(arr[i][right]);
					return;
				}
			}
			
			for(int i=right;i>left;i--)
			{
				k--;
				if(k==0)
				{
					System.out.println(arr[bottom][i]);
					return;
				}
			}
			
			for(int i=bottom;i>top;i--)
			{
				k--;
				if(k==0)
				{
					System.out.println(arr[i][left]);
					return;
				}
			}
			left++;right--;top++;bottom--;
		}
	}

	private static void q2(int[][] arr) 
	{
		int left = 0, right = arr[0].length-1,top = 0,bottom = arr.length-1;
		while(left<=right && top<=bottom)
		{
			for(int i=top;i<bottom;i++) System.out.print(arr[i][left]+" ");
			
			for(int i=left;i<right;i++) System.out.print(arr[bottom][i]+" ");
			
			for(int i=bottom;i>top;i--) System.out.print(arr[i][right]+" ");
			
			for(int i=right;i>left;i--) System.out.print(arr[top][i]+" ");
			
			left++;right--;top++;bottom--;
		}
		System.out.println();
		
	}

	private static void q1(int[][] arr) 
	{
		int left = 0;
		int right = arr[0].length-1;
		int top = 0;
		int bottom = arr.length-1;
		while(left<=right && top<=bottom)
		{
			for(int i=left;i<right;i++)
			{
				System.out.print(arr[top][i]+" ");
			}
			
			for(int i=top;i<bottom;i++)
			{
				System.out.print(arr[i][right]+" ");
			}
			
			for(int i=right;i>left;i--)
			{
				System.out.print(arr[bottom][i]+" ");
			}
			
			for(int i=bottom;i>top;i--)
			{
				System.out.print(arr[i][left]+" ");
			}
			left++;right--;top++;bottom--;
		}
		System.out.println();
		
//		int x=0;
//		int y=0;
//		int n =arr.length-1;
//		int m = arr[0].length-1;
		
//		int i=0;
//		int j=0;
		
//		boolean left = false;
//		boolean right = true;
//		boolean top = false;
//		boolean bottom = false;
		
//		while(x<n && y<m)
//		{
//			System.out.print(arr[i][j]+" ");
//			if(right)
//			{
//				j++;
//			}
//			if(left)
//			{
//				j--;
//			}
//			if(top)
//			{
//				i--;
//			}
//			if(bottom)
//			{
//				i++;
//			}
//			if(right && j==m)
//			{
//				x++;
//				right = false;
//				bottom=true;
//			}
//			else if(left && j==y)
//			{
//				n--;
//				left = false;
//				top=true;
//			}
//			else if(top && i==x)
//			{
//				y++;
//				top = false;
//				right=true;
//			}
//			else if(bottom && i==n)
//			{
//				m--;
//				bottom = false;
//				left=true;
//			}
//			
//		}
	}

}
