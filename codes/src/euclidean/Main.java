package euclidean;

public class Main {

	public static void main(String[] args) 
	{
		int n1 = 12;
		int n2 =30;
		System.out.println("Euclidean Approach");
		System.out.println(euclid(Math.max(n1, n2), Math.min(n1, n2)));
		
	}

	private static int euclid(int a, int b) 
	{
		if(b ==0) return a;
		
		return euclid(b, a%b);
	}

}
