package inheritance1;

public class C 
{
	int i = 90;
	public void function()
	{
		System.out.println("This is class C");
	}
	public void d()
	{
		D objD = new D();
		objD.function();
	}
	
}

class D
{
	public void function()
	{
		System.out.println("This is class D");
	}
}
