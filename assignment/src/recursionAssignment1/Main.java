package recursionAssignment1;

public class Main 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Question 1 :");
		printIncreasing(5);
		System.out.println();
		
		System.out.println("Question 2 :");
		printDecreasing(5);
		System.out.println();
		
		System.out.println("Question 3 :");
		IncreasingDecreasing(1,5);
		System.out.println();
		
		System.out.println("Question 4 :");
		System.out.println(findSum(5));
		
		System.out.println("Question 5 :");
		System.out.println(findRangeSum(3,4));
		
		System.out.println("Question 6 :");
		System.out.println(factorial(5));
		
		System.out.println("Question 7 :");
		System.out.println(power(2,3));
		
		System.out.println("Question 8 :");
		System.out.println(count(1789));
		
		System.out.println("Question 9 :");
		System.out.println(sumOfDigits(1234));
		
		System.out.println("Question 10 :");
		int n=145;
		System.out.println(strong(n)==n?n+" is a strong number":n+ " is not a strong number");
		
		System.out.println("Question 11 :");
		System.out.println(isPrime(2,23)==true? "Prime" : "Not Prime");
	}

	private static boolean isPrime(int i, int n) 
	{
		if(n<=1) return false;
		if(i*i>n) return true;
		if(n%i==0) return false;
		
		return isPrime(i+1, n);
	}

	private static int strong(int i) 
	{
		if(i==0) return 0;
		
		return factorial(i%10)+strong(i/10);
	}

	private static int sumOfDigits(int i) 
	{
		if(i==0) return 0;
		
		return (i%10)+sumOfDigits(i/10);
	}

	private static int count(int i) 
	{
		if(i==0)return 0;
		
		return count(i/10)+1;
	}

	private static int power(int i, int j) 
	{
		if(j==0)return 1;

		
		return i*power(i, j-1);
	}

	private static int factorial(int i) 
	{
		if(i==0)return 1;
		
		return i*factorial(i-1);
	}

	private static int findRangeSum(int i, int j) 
	{
		if(j==i) return i;
		
		return findRangeSum(i, j-1)+j;
	}

	private static int findSum(int i) 
	{
		if(i==0)return 0;
		
		return i+findSum(i-1);
	}

	private static void IncreasingDecreasing(int i,int n) 
	{
		if(i==n+1 || i==0) return;
		
		System.out.print(i+" ");
		IncreasingDecreasing(i+1,n);
		System.out.print(i+" ");
		
	}

	private static void printDecreasing(int i) 
	{
		if(i==0) return;
		
		System.out.print(i + " ");
		printDecreasing(i-1);
		
	}

	private static void printIncreasing(int i) 
	{
		if(i==0) return;
		
		printIncreasing(i-1);
		System.out.print(i + " ");
	}
}
