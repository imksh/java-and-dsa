package stringPart1;

public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println("Question 1: ");
		q1("Java Programming");
		
		System.out.println("Question 2: ");
		q2("java");
		
		System.out.println("Question 3: ");
		q3("JAVA");
		
		System.out.println("Question 4: ");
		q4("Hello");
		
		System.out.println("Question 5: ");
		q5("Hello",0,5);
		
		System.out.println("Question 6: ");
		q6(" Hello World");
		
		System.out.println("Question 7: ");
		q7("Hello", "World");
		
		System.out.println("Question 8: ");
		q8("Java",'a','o');
		
		System.out.println("Question 9: ");
		q9("");
		
		System.out.println("Question 10: ");
		q10("Java", "java");
		
		System.out.println("Question 11: ");
		q11("Java",2);
		
		System.out.println("Question 12: ");
		q12("Hello");
		
		System.out.println("Question 13: ");
		q13("Programming");
		System.out.println("Question 14: ");
		q14("Java","Java");
		
		System.out.println("Question 15: ");
		q15("Java Programming" , "Prog");
		
		StringBuffer sBuffer = new StringBuffer();
		System.out.println(sBuffer.length());

	}
	
//	Que 15. Write a program to Check if a string contains a
//	specific substring.
//	Input: "Java Programming" and "Prog"
//	Output: true
	private static void q15(String string, String str) 
	{
		System.out.println(string.contains(str));
		
	}

//Que 14. Write a program to Compare two strings,
//ignoring case differences.
//Input: "Java" and "java"
//Output: true

	private static void q14(String string, String str) 
	{
		System.out.println(string.compareToIgnoreCase(str)==0?"true":"false");
		
	}

//
//Que 13. Write a program to Reverse a string using
//StringBuilder.
//Input: "Programming"
//Output: "gnimmargorP"
	
	private static void q13(String string) 
	{
		StringBuilder sBuilder = new StringBuilder(string);
		sBuilder.reverse();
		System.out.println(new String(sBuilder));
		
	}

//Que 12. Write a program to Append "World" to
//"Hello".
//Output: "HelloWorld"
	
	private static void q12(String string) 
	{
		StringBuilder sBuilder = new StringBuilder(string);
		
		sBuilder.append("World");
		System.out.println(new String(sBuilder));
		
	}

//	Que 11. Write a Java program to Find character at a
//	specific index.
//	Input: "Java", Index = 2
//	Output: 'v'
		
	private static void q11(String string,int i) 
	{
		System.out.println(string.charAt(i));
		
	}

//	Que 10. Write a Java program to Check if two strings
//	are equal.
//	Input: "Java" a
	
	private static void q10(String string, String str) 
	{
		System.out.println(string.equals(str));
		
	}

//	Que 9. Write a Java program to Check if a string is
//	empty.
//	Input: ""
//	Output: true
	
	private static void q9(String string) 
	{
		System.out.println(string.isEmpty());
		
	}


//	Que 8. Write a Java program to Replace occurrences of
//	a character in a string.
//	Input: "Java", Replace 'a' with 'o'
//	Output: "Jovo"
		
	private static void q8(String string,char a,char b) 
	{
//		char[] ch = string.toCharArray();
//		
//		for(int i=0;i<ch.length;i++)
//		{
//			if(ch[i]==a)
//			{
//				ch[i]=b;
//			}
//		}
//		
//		System.out.println(ch.toString());
		
		System.out.println(string.replace(a, b));
		
	}


//	Que 7. Write a Java program to Concatenate two
//	strings.
//	Input: "Hello" and "World"
//	Output: "HelloWorld"
		
	private static void q7(String string,String str) 
	{
		System.out.println(string.concat(str));
		
	}


//	Que 6. Write a Java program to Trim leading and
//	trailing spaces from a string.
//	Input: " Hello World "
//	Output: "Hello World"
	
	private static void q6(String string) 
	{
		System.out.println(string.trim());
		
	}

//	Que 5. Write a Java program to extract a substring
//	from a string.
//	Input: "HelloWorld", Start Index = 0, End Index = 5
//	Output: "Hello"
		
	private static void q5(String string,int i,int j) 
	{
		System.out.println(string.substring(i,j));
		
	}

//	Que 4. Write a Java program to reverse a given string.
//	Input: "Hello"
//	Output: "olleH"
		
	private static void q4(String string) 
	{
		char[] ch = string.toCharArray();
		int i=0;
		int j=string.length()-1;
		while(i<j)
		{
			char temp = ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			j--;
			i++;
		}
		String string2 = new String(ch);
		System.out.println(string2);
		
		
	}

//	Que 3. Write a Java program to convert a given string
//	to lowercase.
//	Input: "JAVA"
//	Output: "java"
		
	private static void q3(String string) 
	{
	System.out.println(string.toLowerCase());
		
	}


//	Que 2. Write a Java program to convert a string to
//	uppercase.
//	Input: "java"
//	Output: "JAVA"
		
	private static void q2(String string) 
	{
		System.out.println(string.toUpperCase());
		
	}

//	Que 1. Write a Java program to find the length of a
//	given string.
//	Input: "Java Programming"
//	Output: 16
	
	private static void q1(String string) 
	{
		System.out.println(string.length());
		
	}

}
