package superAndThisKeyword;

public class ThisKeyword 
{

	public static void main(String[] args) 
	{
		
		Student obj1 = new Student();
		Student obj2 = new Student(23,"Prince");
		Student obj3 = new Student(24,"Shivam",7820173456l);
		
		obj1.print();
		obj2.print();
		obj3.print();
		final int x=20;
		
	}

}

class Student
{
	int age;
	String name;
	Long mob;
	
	//First Constructor
	public Student() 
	{
		this(20, "Karan");
		this.mob =40l;
	}
	
	//second Constructor
	public Student(int age, String name) 
	{
		this(age,name, 9737451695l);
	}
	
	//third Constructor
	public Student(int age, String name, Long mob) 
	{
		this.age=age;
		this.name=name;
		this.mob=mob;
	}
	
	public void print()
	{
		System.out.println(this.age + " " + this.name + " " + this.mob);
	}
}
