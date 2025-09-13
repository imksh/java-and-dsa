package polymorphism;

public class Main 
{
	public static void main(String[] args) 
	{
		A obj = new B();
		obj.print();
	}
}

class A
{
	static void print()
	{
		System.out.println("hii");
	}
	static void print(String s)
	{
		System.out.println(s);
	}
}

class B extends A
{
	static void print()
	{
		System.out.println("Baiju");
	}
}