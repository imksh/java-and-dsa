package collegeProblems;

import java.util.HashMap;

public class CountOccurance 
{

	public static void main(String[] args) 
	{
		String str = "sagar college in bhopal";
		HashMap<Character,Integer > map = new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			map.put(str.charAt(i), 0);
		}
		for(int i=0;i<str.length();i++)
		{
			map.put(str.charAt(i),map.get(str.charAt(i))+1);
		}
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
				System.out.println(str.charAt(i) + " occured " + map.get(str.charAt(i)));
			
		}
	}

}
