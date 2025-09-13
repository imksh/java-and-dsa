package collegeProblems;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) 
	{
		String s1 = "cdabb";
		String s2 = "bdabc";
		System.out.println(anagram(s1, s2));
		
		String str = "hagthag";
		
		System.out.println(lipandrome(str));

	}
	static boolean lipandrome(String str)
	{
		String s1 ="";
		String s2 ="";
		int n= str.length();
		if(n%2==0)
		{
			s1=str.substring(0,(n/2));
			s2=str.substring(n/2);
		}
		else 
		{
			s1=str.substring(0,(n/2));
			s2=str.substring((n/2)+1);
		}
		return s1.equals(s2);
	}
	static boolean anagram(String s1, String s2)
	{
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1,c2);
	}
}
