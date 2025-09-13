package mayTwentyFive;


public class Main {

	public static void main(String[] args) 
	{
		System.out.println("Question 1 : ");
		int[] arr;
		int i,j,n,k;
		arr = new int[] {10,20,30,40,50};
		i=1;
		j=3;
		q1(arr,i,j);
		
		System.out.println("Question 2 : ");
		arr = new int[] {10,20,30,40,50};
		q2(arr);
		
		System.out.println("Question 3 : ");
		arr = new int[] {1,2,3,8,7,5,4};
		k=2;
		q3(arr,k);
		
		System.out.println("Question 4 : ");
		arr = new int[] {12, 35, 1, 10, 34, 1};
		System.out.println(q4(arr));
		
		System.out.println("Question 5 : ");
		arr = new int[] {12, 35, 1, 10, 34, 1};
		System.out.println(q5(arr));
		
		System.out.println("Question 6 : ");
		arr = new int[] {3, 2, 1, 5, 6, 4};
		System.out.println(q6(arr));
		
		System.out.println("Question 8 : ");
		arr = new int[] {1, 2, 3, 4, 5};
		System.out.println(q8(arr));
		
		
//		System.out.println("Question 13 : ");
//		arr = new int[] {1, 2, 3, 4, 5};
//		k=2;
//		q13(arr,k);

	}

	

	private static boolean q8(int[] arr) 
	{
//		for(int i=0;i<arr.length-1;i++)
//		{
//			if(arr[i+1]<arr[i])
//			{
//				return false;
//			}
//		}
		int i=0;
		int j=1;
		while(j<arr.length)
		{
			if(arr[j]<arr[i] ) return false;
			j++;
			i++;
		}
		return true;
	}



	private static int q6(int[] arr) 
	{
		selectionSort(arr);
		
		return 1;
	}



	private static void selectionSort(int[] arr) 
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int min =i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[min])
				{
					min=j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}	
		
	}



	private static void q13(int[] arr, int k) 
	{
		System.out.println("Before Swaping ");
		print(arr);	
		reverseArr(arr,0,k-1);
		reverseArr(arr,k,arr.length-1);
		reverseArr(arr,0,arr.length-1);
		System.out.println("After Swaping ");
		print(arr);	
		
	}

	private static void reverseArr(int[] arr, int i, int j) 
	{
		while(i<j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
	}


	private static int q5(int[] arr) 
	{
		int min = Integer.MAX_VALUE;
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
		int max = Integer.MIN_VALUE;
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


	private static void q3(int[] arr, int k) 
	{
		System.out.println("Before Swaping ");
		print(arr);	
		int left =k+1;
		int right = arr.length-1;
		while(left<right)
		{
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		System.out.println("After Swaping ");
		print(arr);	
		
	}



	private static void q2(int[] arr) 
	{
		System.out.println("Before Swaping ");
		print(arr);	
		int left =0;
		int right = arr.length-1;
		while(left<right)
		{
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		System.out.println("After Swaping ");
		print(arr);	
		
	}



	private static void q1(int[] arr, int i, int j) 
	{
		System.out.println("Before Swaping ");
		print(arr);	
		int temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		System.out.println("After Swaping ");
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

}
