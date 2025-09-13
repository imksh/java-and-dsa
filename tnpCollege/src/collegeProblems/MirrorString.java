package collegeProblems;

import java.util.Arrays;

public class MirrorString {

	public static void main(String[] args) 
	{
		String str = "az";
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			char ch =  (char) (122-(int) (arr[i])+97);
			arr[i]=ch;
			
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
