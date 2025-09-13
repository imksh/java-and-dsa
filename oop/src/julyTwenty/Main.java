package julyTwenty;

public class Main 
{
	
	public String x1 = "Public";
	private String x2 = "Private";
	protected String x3 = "Protected";
	String x4 = "Default";
	
	
	public void mthod1()
	{
		System.out.println("Public");
	}
	private void mthod2()
	{
		System.out.println("Private");
	}
	protected void mthod3()
	{
		System.out.println("Protected");
	}
	 void mthod4()
	{
		System.out.println("Default");
	}
	
	
	public void print()
	{
		System.out.println("-------Variables-------");
		System.out.println(this.x1);
		System.out.println(this.x2);
		System.out.println(this.x3);
		System.out.println(this.x4);
		
		System.out.println("-------Methods-------");
		this.mthod1();
		this.mthod2();
		this.mthod3();
		this.mthod4();
	}

	public static void main(String[] args) 
	{
//		Student s1 = new Student();
//		Student s2 = new Student();
//		
//		System.out.println( "s1 => "+s1.name +" "+s1.age +" "+s1.roll + " "+s1.mob);
//		System.out.println( "s2 => "+s2.name +" "+s2.age +" "+s2.roll + " "+s2.mob);
		
		Main obj = new Main();
		System.out.println("Same Class");
		System.out.println();
		obj.print();
		
		S s = new S();
		System.out.println();
		System.out.println("Same Package Subclass");
		System.out.println();
		s.print();
		
		
		D d = new D();
		System.out.println();
		System.out.println("Same Package Non-Subclass");
		System.out.println();
		d.print();
	}

}



class S extends Main
{
	public void print()
	{
		System.out.println("-------Variables-------");
		System.out.println(this.x1);
		System.out.println(this.x3);
		System.out.println(this.x4);
		
		System.out.println("-------Methods-------");
		this.mthod1();
		this.mthod3();
		this.mthod4();
	}
}



class D
{
	Main obj = new Main();
	public void print()
	{
		System.out.println("-------Variables-------");
		System.out.println(obj.x1);
		System.out.println(obj.x3);
		System.out.println(obj.x4);
		
		System.out.println("-------Methods-------");
		obj.mthod1();
		obj.mthod3();
		obj.mthod4();
	}
}



class Student
{
	String name = "ankush";
	int age =23;
	int roll = 4353;
	long mob = 7295038835l;
	
	
	
	
}

