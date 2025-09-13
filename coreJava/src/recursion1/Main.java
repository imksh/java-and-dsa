package recursion1;

public class Main 
{
	
	public static void main(String[] args) 
	{
		System.out.println(sum(10));
		System.out.println(fact(4));
	}
	//sum of n natural number
	public static int sum(int n)
	{
		if(n==1) return n;
		
		return n+sum(n-1);
	}
	// factorial of n
	public static int fact(int n)
	{
		if(n==1) return 1;
		
		return n*fact(n-1);
	}
	// prints 1 to 10
		public static void print(int x)
		{
			if(x==11) return;
			
			System.out.println(x);
			print(++x);
		}
	// prints 10 to 1
	public static void print1(int x)
	{
		if(x==11) return;
		
		print(++x);
		System.out.println(x);
	}
}