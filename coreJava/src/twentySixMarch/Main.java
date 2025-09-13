package twentySixMarch;

public class Main 
{

	public static void main(String[] args) 
	{	
		Student prince = new Student("Prince" , 26, 9584898727l);
		System.out.println("Name = " + prince.name + " Age = " + prince.age + " Mobile No = " +  prince.mobileno);

		Student abhishek = new Student("Abhishek" , 15 ,  7784298727l);
		System.out.println("Name = " + abhishek.name + " Age = " + abhishek.age + " Mobile No = " +  abhishek.mobileno);
		
		Student kishan = new Student("Kishan" , 20 ,  7384892727l);
		System.out.println("Name = " + kishan.name + " Age = " + kishan.age + " Mobile No = " + kishan.mobileno);
	}

}

class Student
{
	String name;
	int age;
	long mobileno;
	
	Student(String n, int a, long mno)
	{
		name=n;
		age=a;
		mobileno =mno;
	}
}