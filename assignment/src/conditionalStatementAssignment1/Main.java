package conditionalStatementAssignment1;

public class Main 
{
	
	

	public static void main(String[] args) 
	{
		//1
		System.out.println("Question Number 1");
		int a=9;
		int b=5;
		if(findMax(a,b)==-1)
		{
			System.out.println("Both numbers are equal");
		}
		else
		{
			System.out.println(findMax(a, b));
		}
		System.out.println();
		
		//2
		System.out.println("Question Number 2");
		a=8;
		b=9;
		int c=7;
		
		if(findMax(a,b,c)==-1)
		{
			System.out.println("All numbers are equal");
		}
		else
		{
			System.out.println(findMax(a, b,c));
		}
		System.out.println();
		
		//3
		System.out.println("Question Number 3");
		int rohan=25;
		int harsh=30;
		int anjali=22;
		;
		System.out.print(compareAge(rohan,harsh,anjali) + " is the youngest with an age of ");
		if(compareAge(rohan,harsh,anjali)== "Rohan")
		{
			System.out.println(rohan);
		}
		else if(compareAge(rohan,harsh,anjali)== "Harsh")
		{
			System.out.println(harsh);
		}
		else if(compareAge(rohan,harsh,anjali)== "Anjali")
		{
			System.out.println(anjali);
		}
		System.out.println();
		//4
		System.out.println("Question Number 4");
		int num =-39;
		System.out.println(checkNumber(num));
		System.out.println();
		
		//5
		System.out.println("Question Number 5");
		num=55;
		System.out.println(isDivisible(num));
		System.out.println();
		
		System.out.println("Question Number 6");
		num=4;
		System.out.println(checkEvenOdd(num));
		System.out.println();
		
		System.out.println("Question Number 7");
		char ch ='@';
		System.out.println(checkCharType(ch));
		System.out.println();
		
		
		System.out.println("Question Number 8");
		ch='y';
		System.out.println(checkVowelConsonant(ch));
		System.out.println();
		
		System.out.println("Question Number 9");
		ch='e';
		System.out.println(checkCase(ch));
		System.out.println();
		
		System.out.println("Question Number 10");
		int cp =100;
		int sp=600;
		if(checkProfitOrLoss(cp, sp)=="Profit")
		{
			System.out.println(checkProfitOrLoss(cp,sp) + " : " + (sp-cp));
		}
		else if(checkProfitOrLoss(cp, sp)=="Loss")
		{
			System.out.println(checkProfitOrLoss(cp,sp) + " : " + (cp-sp));
		}
		else 
		{
			System.out.println(checkProfitOrLoss(cp,sp));
		}
		
		System.out.println();

	}
	
	
	private static String checkProfitOrLoss(int cp, int sp) 
	{
		if(sp>cp)
		{
			return "Profit";
		}
		else if(cp>sp)
		{
			return "Loss";
		}
		return "No Profit, No Loss";
	}


	private static String checkCase(char ch) 
	{
		if(ch>='a' && ch<='z')
		{
			return "Lowercase";
		}
		else if(ch>='A' && ch<='Z')
		{
			return "Uppercase";
		}
		return "Not an alphabet";
	}


	private static String checkVowelConsonant(char ch) 
	{
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			return "Vowel";
		}
		return "Consonant";
	}


	private static String checkCharType(char ch) 
	{
		if(ch>=48 && ch<=57)
		{
			return "Digit";
		}
		else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			return "Alphabet";
		}
		return "Special character";
	}


	private static String checkEvenOdd(int num) 
	{
		if(num%2==0)
		{
			return "Even number";
		}
		return "Odd number";
	}


	private static boolean isDivisible(int num) 
	{
		if(num%5==0 && num%11==0)
		{
			return true;
		}
		return false;
	}


	private static String checkNumber(int num) 
	{
		if(num>0)
		{
			return "Positive number";
		}
		else if(num<0)
		{
			return "Negative number";
		}
		else
		{
			return "The number is zero";
		}
	}


	static int findMax(int a, int b)
	{
		if(a>b)
		{
			return a;
		}
		if(b>a)
		{
			return b;
		}
		return -1;
	}
	
	
	static int findMax(int a, int b,int c)
	{
		if(a>b && a>c)
		{
			return a;
		}
		else if(b>a && b>c)
		{
			return b;
		}
		else if(c>a && c>b)
		{
			return c;
		}
		return -1;
	}
	
	
	private static String compareAge(int rohan, int harsh, int anjali) 
	{
		if(rohan<harsh && rohan<anjali)
		{
			return "Rohan";
		}
		else if (harsh<rohan && harsh<anjali)
		{
			return "Harsh";
		}
		else if (anjali<rohan && anjali<harsh)
		{
			return "Anjali";
		}
		
		return "";		
	}

}
