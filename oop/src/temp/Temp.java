package temp;

import julyTwenty.*;

public class Temp extends Main
{
	public void print()
	{
		System.out.println("-------Variables-------");
		System.out.println(this.x1);
		System.out.println(this.x3);
		
		System.out.println("-------Methods-------");
		this.mthod1();
		this.mthod3();
	}
	
	public static void main(String[] args) 
	{
		Temp temp = new Temp();
		System.out.println("Different Package Subclass");
		System.out.println();
		temp.print();
		
		X x = new X();
		System.out.println();
		System.out.println("Different Package Non-Subclass");
		System.out.println();
		x.print();
	}
}


class X
{
	
	Main obj = new Main();
	public void print()
	{
		System.out.println("-------Variables-------");
		System.out.println(obj.x1);
		
		System.out.println("-------Methods-------");
		obj.mthod1();
	}
}