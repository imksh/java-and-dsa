package miscellaneous;

public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println(q1(50000, 5));
		System.out.println();
		System.out.println(q2(35, 5));
		System.out.println();
		System.out.println(q3(45000, 5));
		System.out.println();
		q4(5);
		System.out.println();
		System.out.println(q5());
		System.out.println();
		System.out.println(q6(535));
		System.out.println();
		q7("Manager");
		System.out.println();
		q8("Lunch");
		System.out.println();
		System.out.println(q9(-5));
		System.out.println();
		System.out.println(q10(19));
		System.out.println();

	}
	
	static double q1(int s,int n)
	{
		double b=0;
		if(s>50000)
		{
			if(n>5)
			{
				b=0.1*s;
			}
			else
			{
				b=0.7*s;
			}
		}
		else if(s<=50000)
		{
			if(n>5) 
			{
				b=0.5*s;
			}
			else 
			{
				b=0.3*s;
			}
		}
		return b;
	}
	
	static String q2(int a, int n)
	{
		String s="";
		
		if(a>30)
		{
			if(n>10)
			{
				s="Veteran";
			}
			else {
				s="Experienced";
			}
		}
		else {
			if(n>5)
			{
				s="Young Experienced";
			}
			else {
				s="Novice";
			}
		}
		
		return s;
	}
	
	static String q3(int s, int n)
	{
		String a="";
		if(s>40000)
		{
			if(n>3)
			{
				a="eligible for the loan";
			}
			else
			{
				a="eligible with a co-signer";
			}
		}
		else if(s<=40000)
		{
			a="they are not eligible for the loan";
		}
		
		return a;
	}
	
	
	static void q4(int n)
	{
		System.out.println("Multiplication table of" + n+ ": ");
		for(int i=1;i<=10;i++)
		{
			System.out.println(n +" * "+ i+ " = "+n*i);
		}
	}
	
	
	static int q5()
	{
		int ans=0;
		
		int n=100;
		while(n>0)
		{
			ans+=n;
			n--;
		}
		
		return ans;
	}
	
	static int q6(int n)
	{
		int s=0;
		
		do
		{
			n/=10;
			s++;
		}while(n>0);
		
		return s;
	}
	
	static void q7(String d)
	{
		switch (d) {
		case "Manager": 
			System.out.println(0.25*90000);
			break;
		case "Developer":
			System.out.println(0.2*70000);
			break;
		case	"Tester":
			System.out.println(0.15*55000);
			break;
		case	"Intern" :
			System.out.println(0.1*40000);
			break;
			
		}
		
	}
	
	static void q8(String s)
	{
		switch (s) {
		case "Breakfast": 
			System.out.println(100);
			break;
		case "Lunch": 
			System.out.println(200);
			break;
		case "Dinner": 
			System.out.println(250);
			break;
		
		}
	}
	
	static String q9(int n)
	{
		return n<0?"Negative":"Positive";
	}
	
	static boolean q10(int n)
	{
		return n<18?false:true;
	}

}
