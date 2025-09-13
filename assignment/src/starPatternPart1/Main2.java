package starPatternPart1;

public class Main2 
{

	public static void main(String[] args) 
	{
		System.out.println(1);
		for(int i=0;i<5;i++)
		{
			System.out.print("* ");
		}
		System.out.println();
		
		System.out.println(2);
		for(int i=0;i<5;i++)
		{
			System.out.println("*");
		}
		
		System.out.println(3);
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println(4);
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println(5);
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println(6);
		for(int i=0;i<5;i++)
		{
			for(int j=i;j<5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println(7);
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println(8);
		for(int i=0;i<5;i++)
		{
			for(int j=i;j<5-1;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println(9);
		for(int i=0;i<5;i++)
		{
			for(int j=i;j<5-1;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println(10);
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<5;j++)
			{
				System.out.print("* ");
			}
			for(int j=i+1;j<5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		

	}

}
