package pack2;
//different package sub class
import pack1.Main;

public class ClassC extends Main
{
	public static void main(String[] args) 
	{
		System.out.println("Different Package sub Class :-");
		System.out.println();
		System.out.println(ClassC.q);
		System.out.println(ClassC.s);
		System.out.println();
		System.out.println(ClassC.functionB());
		System.out.println(ClassC.functionD());
		System.out.println();
		
		ClassC objC = new ClassC();
		System.out.println(objC.q1);
		System.out.println(objC.s1);
		System.out.println();
		System.out.println(objC.functionB1());
		System.out.println(objC.functionD1());
	}
}
