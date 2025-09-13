package aggregationRelationship;

public class Main 
{

	public static void main(String[] args) 
	{
		College college1 = new College("lnct");
		College college2 = new College("sirt");
		Student student1 = new Student("prince",college1);
		Student student2 = new Student("karan",college2);
		System.out.println(student1.name + " studies in " + student1.college.name);
		System.out.println(student2.name + " studies in " + student2.college.name);

	}
}

class College
{
	String name;
	
	public College(String name)
	{
		this.name=name;
		
	}
}

class Student
{
	String name;
	College college;
	public Student(String name, College college)
	{
		this.name=name;
		this.college=college;
	}
}
