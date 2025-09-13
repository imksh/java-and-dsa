package greedyAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class ActivitySelection 
{

	public static void main(String[] args) 
	{
		int[] start = {1, 3, 0,5,8,5};
		int[] end = {2, 4, 6,7,9,9};
		int i=1;
		int e=end[0];
		List<Integer> ans = new ArrayList<Integer>();
		ans.add(0);
		while(i<start.length)
		{
			if(start[i]>=e)
			{
				e=end[i];
				ans.add(i);
			}
			i++;
		}
		System.out.println(ans.size());
		for(i=0;i<ans.size();i++)
		{
			System.out.print("A"+ans.get(i)+ " ");
		}

	}

}


/*
 	Activity Selection
You are given n activities with their start and end times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time. Activities are sorted according to end time.
AO AI A2
start = [10, 12, 20]
end = [20, 25, 30]
ans = 2 (A0 & A2)
 
 */
