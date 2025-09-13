package mayEighteen;

public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println("Checking prime number By Recursive approach");
		int n=13;
		
		System.out.println(findfactors(n,1,0)==2?n+" is a Prime number":n+" is not  a Prime number");
		System.out.println();
		
		
		System.out.println("Checking parime number By Loop approach");
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0) count++;
			if(count>2)
			{
				System.out.println(n +" is Not Prime");
				break;
			}
		}
		
		if(count==2) System.out.println(n +" is Prime");

		System.out.println("Factors By Loop approach Optimized");
		
		for(int i=1;i*i<=n;i++)
		{
			if(n%i==0) System.out.print(i!=n/i? i+ " "+ n/i+" ": i+ " ");;
		}
		System.out.println();
		
		
		System.out.println("HCF using Loop : ");
		System.out.println( hcf(12, 30));
		int n1 = 12;
		int n2 =30;
		System.out.println("Euclidean Approach");
		System.out.println(euclid(Math.max(n1, n2), Math.min(n1, n2)));
		
		System.out.println("LCM using HCF");
		System.out.println(lcmOptimized(15,20));
		System.out.println("Decimal to Binary");
		convertBinary(11);
		System.out.println();
		
		System.out.println("AP With formula");
		formulaAp(3,2,5);
		
		System.out.println("Reverse without recursion");
		System.out.println(reverse(123));
		
		System.out.println("Reverse with recursion");
		System.out.println(reverseRecursion(123,0));
		
		System.out.println("palindrome ");
		System.out.println(isPalindrome(121));
		
		System.out.println("Armstrong ");
		n=371;
		int digit = count(n);
		System.out.println(armstrong(n,digit,0)==n? n+ " is a Armstrong number":n+ " is not a Armstrong number");
		
		
	}
	
	
	
	private static int count(int i) 
	{
		if(i==0)return 0;
		return count(i/10)+1;
	}



	private static int armstrong(int i, int digit,int ans) 
	{
		if(i==0) return ans;
		
		return armstrong(i/10, digit,ans)+(int)Math.pow(i%10, digit);
	}



	private static String isPalindrome(int i) 
	{
		
		return reverse(i)==i? i+ " is a Palindrome number":i+ " is not a Palindrome number";
	}



	private static int reverseRecursion(int i,int ans) 
	{
		if(i==0) return ans;
		ans=(ans*10)+i%10;
		return reverseRecursion(i/10, ans);
	}



	private static int reverse(int i) 
	{
		int ans=0;
		
		while(i>0)
		{
			ans=(ans*10)+i%10;
			i/=10;
		}
				
		return ans;
	}



	private static void formulaAp(int i, int j, int k) 
	{
		while(k>0)
		{
			System.out.print(i+(k-1)*j + " ");
			k--;
		}
	}



	private static void convertBinary(int i) 
	{
		if(i<=0) return;
		convertBinary(i/2);
		System.out.print(i%2+" ");
		
	}



	private static int lcmOptimized(int i, int j) 
	{
		int hcf = euclid(Math.max(i, j), Math.min(i, j));
		
		return (i*j)/hcf;
	}

	private static int euclid(int a, int b) 
	{
		if(b ==0) return a;
		
		return euclid(b, a%b);
	}

	private static int hcf(int i, int j) 
	{
		for(int k=Math.min(i, j);k>0;k--)
		{
			if(i%k==0 && j%k==0) return k;
		}
		return 1;
	}
	
	private static int findfactors(int n,int i,int count) 
	{
		if(i>n) return count;
		
		if(n%i==0) count++;
		
		return findfactors(n, i+1,count);
		
	}

}
