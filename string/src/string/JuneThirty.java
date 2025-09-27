package string;

public class JuneThirty {

	public static void main(String[] args) 
	{
//		s1 and s2 points to the same string literal in string constant pool
//		String constant pool doesn't allow duplicates
		String s1 = "Karan";
		String s2 = "Karan";
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true
		
		// by using new keyword 2 objects are created one in heap and one in SCP
		//3 objects are created 2-heap and 1-SCP
		//reference variable points to heap object
		String s3 = new String("imksh");
		String s4 = new String("imksh");
		System.out.println(s3.equals(s3));//true
		System.out.println(s3==s4);//false
		
		StringBuilder sb1 = new StringBuilder("s1");
		StringBuilder sb2 = new StringBuilder("s1");
		System.out.println(sb1.equals(sb2));//false because no overrided .equals()
		System.out.println(sb1==sb2);//false

	}

}
