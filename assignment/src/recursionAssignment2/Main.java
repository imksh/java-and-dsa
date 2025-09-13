package recursionAssignment2;

public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println("Question 1 :");
		int i=36;
		int j=60;
		System.out.println(hcf(i,j,Math.min(i, j)));
		
		System.out.println("Question 2 :");
		i=15;
		j=20;
		System.out.println(lcm(Math.max(i, j),Math.min(i, j),1));
		
		System.out.println("Question 3 :");
		
		System.out.println(sumOddNumbers(3));
		
		System.out.println("Question 4 :");
		System.out.println(decimalToBinary(5));
		
		System.out.println("Question 5 :");
		System.out.println(nthTerm(3,2,5));
		
		System.out.println("Question 6 :");
		System.out.println(reverseNumber(123,0));
		
		System.out.println("Question 7 :");
		System.out.println(isPalindrome(12321));
		
		System.out.println("Question 8 :");
		int n=371;
		int d = digit(n);
		System.out.println(isArmstrong(n,n,d)==n);
		
		System.out.println("Question 9 :");
		fibonacci(8,1,0);
		System.out.println();
		
		System.out.println("Question 10 :");
		 n=6;
		System.out.println(perfect(n,1,0)==n?n + " is Perfect number":n+" is Not Perfect number");
		
	}
	
	private static int perfect(int i,int j, int ans) 
	{
		if( j==i) return ans;
		
		if(i%j==0) ans+=j;
		
		return perfect(i,j+1,ans);
	}
	private static void fibonacci(int i, int prev1, int prev2) 
	{
		if(i==0) 
		{
			return;
		}
		System.out.print(prev2+" ");
		fibonacci(i-1,prev1 + prev2, prev1);
		
	}
	
	private static int digit(int n) 
	{
		if(n==0) return 0;
		return digit(n/10)+1;
	}

	private static int isArmstrong(int n, int i, int digit) 
	{
		if(i==0) return 0;
		int ans = isArmstrong(n,i/10,digit);
		ans+=Math.pow(i%10, digit);
		return ans;
	}

	private static boolean isPalindrome(int i) {
		
		return reverseNumber(i, 0)==i;
	}

	private static int reverseNumber(int i,int ans) 
	{
		if(i==0)return ans;
		
		ans=(ans*10)+(i%10);
		return reverseNumber(i/10,ans);
	}

	private static int nthTerm(int i, int j, int k) 
	{
		if(k==1) return i;
		
		
		return nthTerm(i+j,j,k-1);
	}

	private static String decimalToBinary(int i) 
	{
		if(i==0) return "";
		
		return decimalToBinary(i>>1) + (i&1);
	}

	private static int sumOddNumbers(int i) 
	{
		if(i==0)return 0;
		
		return (2*i)-1+sumOddNumbers(i-1);
	}

	private static int lcm(int num1, int num2, int i) 
	{
		if((num1*i)%num2==0) return num1*i;
		
		return lcm(num1, num2, i+1);
	}

	private static int hcf(int i, int j,int k) 
	{
		if(k==1) return 1;
		
		if(i%k==0 && j%k==0) return k;
		
		return hcf(i, j,k-1);
	}

}
