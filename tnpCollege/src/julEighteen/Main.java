package julEighteen;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		stringCount();
	}
	
	static void stringCount()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String s = sc.nextLine();
		s=s.toLowerCase();
		int v=0;
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(Character.isAlphabetic(ch) &&(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'))
			{
				v++;
			}
			else if(Character.isAlphabetic(ch))
			{
				c++;
			}
		}
		System.out.println("Vowel : "+v);
		System.out.println("Consonent : "+c);
	}

}
