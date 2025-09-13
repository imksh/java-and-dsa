package pack1;
//same package non sub class
public class ClassB {

	public static void main(String[] args) 
	{
		System.out.println("Same Package non sub Class :-");
		System.out.println();
		System.out.println(Main.p);
		System.out.println(Main.q);
		System.out.println(Main.s);
		System.out.println();
		System.out.println(Main.functionA());
		System.out.println(Main.functionB());
		System.out.println(Main.functionD());
		System.out.println();
		Main objMain = new Main();
		System.out.println(objMain.p1);
		System.out.println(objMain.q1);
		System.out.println(objMain.s1);
		System.out.println();
		
		System.out.println(objMain.functionA1());
		System.out.println(objMain.functionB1());
		System.out.println(objMain.functionD1());
		

	}

}
