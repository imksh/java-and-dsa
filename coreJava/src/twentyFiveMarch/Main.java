package twentyFiveMarch;

public class Main 
{

	public static void main(String[] args) 
	{	
		Student prince = new Student("Prince" , "BBIT" , 26);
		System.out.println(prince.name + " " + prince.collegeName + " " + prince.age);

		Student shubh = new Student("Shubh" , "IT" , 15);
		System.out.println(shubh.name + " " + shubh.collegeName + " " + shubh.age);

		Student karan = new Student("Karan" , "SIRT" , 21);
		System.out.println(karan.name + " " + karan.collegeName + " " + karan.age);
		Student kishan = new Student("Kishan" , "unknown" , 20);
		System.out.println(kishan.name + " " + kishan.collegeName + " " + kishan.age);

		Student gaurav = new Student("Gaurav" , "BRAINWARE" , 22);
		System.out.println(gaurav.name + " " + gaurav.collegeName + " " + gaurav.age);
	}

}

class Student
{
	String name;
	String collegeName;
	int age;
	Student(String n, String cname, int a)
	{
		name=n;
		collegeName=cname;
		age=a;
	}
}