package stringBuffer;

public class Main 
{

	public static void main(String[] args) 
	{
		//default capacity 16
		StringBuffer sBuffer = new StringBuffer();
		System.out.println(sBuffer.length());
		System.out.println(sBuffer.capacity());
		
		sBuffer.append("abcdefghijklmnop");
		
		System.out.println(sBuffer.length());
		System.out.println(sBuffer.capacity());
		
		//custom capacity 
		StringBuffer sb1 = new StringBuffer(50);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		//capacity = 16+string length
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		

	}

}
