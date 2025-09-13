package starPaternAssignmentPart1ByWhileLoop;

public class Main 
{
	public static void q1()
	{
		System.out.println(1);
		int i=0;
		while(i<5)
		{
			System.out.print("* ");
			i++;
		}
		System.out.println();
	}
	
	public static void q2()
	{
		System.out.println(2);
		int i=0;
		while(i<5)
		{
			System.out.println("* ");
			i++;
		}
	}
	
	public static void q3()
	{
		System.out.println(3);
		int i=0;
		while(i<5)
		{
			int j=0;
			while(j<6)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public static void q4()
	{
		System.out.println(4);
		int i=0;
		while(i<5)
		{
			int j=0;
			while(j<5)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public static void q5()
	{
		System.out.println(5);
		int i=0;
		while(i<5)
		{
			int j=0;
			while(j<=i)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public static void q6()
	{
		System.out.println(6);
		int i=0;
		while(i<5)
		{
			int j=i;
			while(j<5)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public static void q7()
	{
		System.out.println(7);
		int i=0;
		while(i<5)
		{
			int j=0;
			while(j<i)
			{
				System.out.print("  ");
				j++;
			}
			j=i;
			while(j<5)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public static void q8()
	{
		System.out.println(8);
		int i=0;
		while(i<5)
		{
			int j=i;
			while(j<5)
			{
				System.out.print("  ");
				j++;
			}
			j=0;
			while(j<=i)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public static void q9()
	{
		System.out.println(9);
		int i=0;
		while(i<5)
		{
			int j=i;
			while(j<5)
			{
				System.out.print("  ");
				j++;
			}
			j=0;
			while(j<=i)
			{
				System.out.print("* ");
				j++;
			}
			j=0;
			while(j<i)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public static void q10()
	{
		System.out.println(10);
		int i=0;
		while(i<5)
		{
			int j=0;
			while(j<i)
			{
				System.out.print("  ");
				j++;
			}
			j=i;
			while(j<5)
			{
				System.out.print("* ");
				j++;
			}
			j=i;
			while(j<4)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
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
