package collegeProblems;

import java.util.HashSet;
import java.util.Scanner;

public class TourMap 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=4;
//		String[] a = {"Warsaw","Madrid","Munich","Paris"};
		String[] a = {"Berlin","Amsterdam","Prague"};
//		String[] b = {"Kiev","Paris","Warsaw","Munich"};
		String[] b = {"Prague","Berlin","Vienna"};
		int[] c= {180,100,120};
		
		HashSet<String> set = new HashSet<String>();
		for(int i=0;i<b.length;i++)
		{
			set.add(b[i]);
		}
		String s="";
		for(int i=0;i<a.length;i++)
		{
			if(!set.contains(a[i])) s=a[i];
		}
		HashSet<String>  visit = new HashSet<String>();
		visit.add(s);
		String prev=s;
		int cost=0;
		String[] start =new String[n-1];
		String[] end =new String[n-1];
		int[] c1 = new int[n-1];
		int k=0;
		while(visit.size()!=n)
		{
			for(int i=0;i<a.length;i++)
			{
				if(prev.equals(a[i]))
				{
					start[k]=a[i];
					end[k]=b[i];
					c1[k]=c[i];
					k++;
					prev=b[i];
					visit.add(b[i]);
					cost+=c[i];
				}
			}
		}
		for(int i=0;i<n-1;i++)
		{
			System.out.println(start[i]+  " " + end[i] + " " + c1[i]);
		}
		System.out.println(cost);
		
		

	}
	
	

}





