package operator;

public class Main 
	{
	static int x;

	public static void main(String[] args) 
	{
		int a = 30;
		int b = ++a + a++;
		int c = ++b + ++a + a++;
		int d = ++c + --a;
		System.out.println(a); // Output?
		System.out.println(b); // Output?
		System.out.println(c); // Output?
		System.out.println(d); // Output?
	}

}
