package superAndThisKeyword;

public class SuperKeyword {

	public static void main(String[] args) 
	{
		Karan obj = new Karan();
		System.out.println(obj.age);
		obj.print1();

	}

}

class Student1
{
	int age=32;
	String name;
	Long mob;
	
	
	
	public Student1(int age, String name) 
	{
		this(age,name, 9737451695l);
	}
	
	
	public Student1(int age, String name, Long mob) 
	{
		System.out.println("I am constructor of class SuperClass");
		this.age=age;
		this.name=name;
		this.mob=mob;
	}
	
	public void print()
	{
		System.out.println(this.age + " " + this.name + " " + this.mob);
	}
}


class Karan extends Student1
{
	int age=23;
	void print1()
	{
		System.out.println(super.age);
	}
	public Karan() 
	{
		super(67,"Karan");
		System.out.println("I am constructor of class Karan");
	}
	public Karan(int x) 
	{
		super(67,"Karan");
		System.out.println("I am constructor of class Karan");
	}
}
