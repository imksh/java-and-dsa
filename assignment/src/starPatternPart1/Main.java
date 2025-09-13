package starPatternPart1;

public class Main 
{
	public static void q1()
	{
		System.out.println(1);
		for(int i=0;i<5;i++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	
	public static void q2()
	{
		System.out.println(2);
		for(int i=0;i<5;i++)
		{
			System.out.println("* ");
		}
	}
	
	public static void q3()
	{
		System.out.println(3);
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<6;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void q4()
	{
		System.out.println(4);
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void q5()
	{
		System.out.println(5);
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void q6()
	{
		System.out.println(6);
		for(int i=0;i<5;i++)
		{
			for(int j=i;j<5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void q7()
	{
		System.out.println(7);
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void q8()
	{
		System.out.println(8);
		for(int i=0;i<5;i++)
		{
			for(int j=i;j<4;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void q9()
	{
		System.out.println(9);
		for(int i=0;i<5;i++)
		{
			for(int j=i;j<4;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void q10()
	{
		System.out.println(10);
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<5;j++)
			{
				System.out.print("* ");
			}
			for(int j=i;j<4;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
	
	
	public static void main(String[] args) 
	{
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();

		
	}
}
