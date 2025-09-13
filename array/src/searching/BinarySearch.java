package searching;


public class BinarySearch 
{

	public static void main(String[] args) 
	{
		int[] arr = {2, 4, 8, 12, 16, 23, 38, 56};
		int key =16;
		System.out.println(key+" is found at index " +binarySearch(arr,key));

	}

	private static int binarySearch(int[] arr, int key) 
	{
		int low =0;
		int high = arr.length-1;
		while(low<=high)
		{
			int mid = low + (high-low)/2;
			if(arr[mid]==key)
			{
				return mid;
			}
			else if(key<arr[mid])
			{
				high=mid-1;
			}
			else if(key>mid)
			{
				low = mid+1;
			}
			
		}
		
		return -1;
		
	}

}
