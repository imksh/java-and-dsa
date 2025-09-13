package test;


public class Practice 
{
	
	public static void main(String[] args) 	
	{
		new B();
	}
}

class A 
{
    A() 
    {
        System.out.println("A constructor");
        display();
    }

    void display() 
    {
        System.out.println("A display");
    }
}

class B extends A
{
    int num = 20;

    B() 
    {
        System.out.println("B constructor");
    }

    void display() 
    {
        System.out.println("B display, num = " + num);
    }
}

