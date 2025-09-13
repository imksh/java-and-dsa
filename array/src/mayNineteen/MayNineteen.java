package mayNineteen;

public class MayNineteen 
{

	public static void main(String[] args) 
	{
		int[] x = {1,2,3,4,5};
		
		System.out.println("full");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse");
		for(int i=x.length-1;i>=0;i--)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();
		System.out.println("First half");
		for(int i=0;i<x.length/2;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();
		System.out.println("Second half");
		for(int i=(x.length/2);i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		
		System.out.println();
		System.out.println("Second half Reverse");
		for(int i=x.length-1;i>=x.length/2;i--)
		{
			System.out.print(x[i]+" ");
		}
		
		System.out.println();
		System.out.println("First half Reverse");
		for(int i=(x.length/2)-1;i>=0;i--)
		{
			System.out.print(x[i]+" ");
		}
	}

}
