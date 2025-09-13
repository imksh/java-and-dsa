package pack2;
//different package non sub class
import pack1.Main;

public class ClassD 
{

	public static void main(String[] args) 
	{
		System.out.println("Different Package non sub Class :-");
		System.out.println();
		System.out.println(Main.q);
		System.out.println();
		System.out.println(Main.functionB());
		System.out.println();
		
		Main objMain = new Main();
		System.out.println();
		System.out.println(objMain.q1);
		System.out.println();
		System.out.println(objMain.functionB1());
	}

}
