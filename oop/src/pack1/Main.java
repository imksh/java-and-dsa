package pack1;

//same class
public class Main 
{
	static String p = "Static Default Variable";
	public static String q = "Static Public Variable";
	private static String r = "Static Private Variable";
	protected static String s = "Static Protected Variable";
	
	static String functionA()
	{
		return "Static Default Function";
	}
	public static String functionB()
	{
		return "Static Public Function";
	}
	private static String functionC()
	{
		return "Static Private Function";
	}
	protected static String functionD()
	{
		return "Static Protected Function";
	}
	
	
    String p1 = "Default Variable";
	public String q1 = "Public Variable";
	private String r1 = "Private Variable";
	protected String s1 = "Protected Variable";
	
	String functionA1()
	{
		return "Default Function";
	}
	public String functionB1()
	{
		return "Public Function";
	}
	private String functionC1()
	{
		return "Private Function";
	}
	protected String functionD1()
	{
		return "Protected Function";
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Same Class :-");
		System.out.println();
		System.out.println(Main.p);
		System.out.println(Main.q);
		System.out.println(Main.r);
		System.out.println(Main.s);
		System.out.println();
		System.out.println(Main.functionA());
		System.out.println(Main.functionB());
		System.out.println(Main.functionC());
		System.out.println(Main.functionD());
		System.out.println();
		Main objMain = new Main();
		System.out.println(objMain.p1);
		System.out.println(objMain.q1);
		System.out.println(objMain.r1);
		System.out.println(objMain.s1);
		System.out.println();
		
		System.out.println(objMain.functionA1());
		System.out.println(objMain.functionB1());
		System.out.println(objMain.functionC1());
		System.out.println(objMain.functionD1());
		
		
	}

}
