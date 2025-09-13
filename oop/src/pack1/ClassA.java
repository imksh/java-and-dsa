package pack1;
//same package sub class
public class ClassA extends Main
{

	public static void main(String[] args) 
	{
		System.out.println("Same Package sub Class :-");
		System.out.println();
		System.out.println(ClassA.p);
		System.out.println(ClassA.q);
		System.out.println(ClassA.s);
		System.out.println();
		
		System.out.println(ClassA.functionA());
		System.out.println(ClassA.functionB());
		System.out.println(ClassA.functionD());
		System.out.println();
		
		ClassA objB = new ClassA();
		System.out.println(objB.p1);
		System.out.println(objB.q1);
		System.out.println(objB.s1);
		System.out.println();
		
		System.out.println(objB.functionA1());
		System.out.println(objB.functionB1());
		System.out.println(objB.functionD1());
	}

}
