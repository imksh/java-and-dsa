package inheritance;
import inheritance1.C;


public class Main 
{
	
	public void function()
	{
		System.out.println("This is class Main");
	}

	public static void main(String[] args) 
	{
		Main objMain = new Main();
		A objA = new A();
		B objB = new B();
		C objC = new C();
		E objE = new E();
		objMain.function();
		objA.function();
		objB.function();
		objC.function();
		objE.function();
		objC.d();
		
	}

}

class A
{
	public void function()
	{
		System.out.println("This is class A");
	}
}
