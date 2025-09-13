package collegeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SubString {

	public static void main(String[] args) 
	{
		String str = "sadfaasdda";
		String s = "fad";
//		HashMap<Character, Integer> map = new HashMap<>();
		ArrayList<Character> list = new ArrayList<>();
//		for(int i=0;i<s.length();i++)
//		{
//			map.put(s.charAt(i), 0);
//		}
		for(int i=0;i<s.length();i++)
		{
			list.add(s.charAt(i));
		}
		
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(!list.contains(arr[i]))
			{
				arr[i]=' ';
			}
		}
//		for(int i=0;i<arr.length;i++)
//		{
//			if(!map.containsKey(arr[i]))
//			{
//				arr[i]=' ';
//			}
//		}
		System.out.println(Arrays.toString(arr));
		int i=0;
		int count=0;
		int ans=0;
		while(i<arr.length)
		{
			if(arr[i]!=' ')
			{
				count++;
			}
			else 
			{
				ans+=(count*(count+1))/2;
				count=0;
			}
			i++;
		}
		ans+=(count*(count+1))/2;
		System.out.println(ans);
	}

}
