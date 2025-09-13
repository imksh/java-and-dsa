package innerClass;

public class Outer 
{
	private int x=20;
	
	class Inner
	{
		int y = 9;
		void innerDisplay()
		{
			System.out.println(x);
			System.out.println(y);
		}
		
	}
	void outerDisplay()
	{
		class LocalInnerClass
		{
			void print()
			{
				System.out.println("Inner Local Class inside outerDisplay");
			}
		}
		LocalInnerClass local = new LocalInnerClass();
		local.print();
		Inner i = new Inner();
		i.innerDisplay();
		System.out.println(i.y);
	}

	public static void main(String[] args) 
	{
		Outer outer = new Outer();
		outer.outerDisplay();
		
		Inner inner = outer.new Inner();
		inner.innerDisplay();
	}

}
