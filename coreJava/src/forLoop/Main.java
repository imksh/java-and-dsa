package forLoop;

public class Main 
{

	public static void main(String[] args) 
	{
		int n=3;
		System.out.println("Increasing pattern of '$' : ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("$ ");
			}
			System.out.println();
		}
		System.out.println("Decreasing pattern of '$' : ");
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("$ ");
			}
			System.out.println();
		}

	}

}
