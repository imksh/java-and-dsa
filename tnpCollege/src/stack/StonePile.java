package stack;

import java.util.*;

public class StonePile {

	public static void main(String[] args) 
	{
		int[] nums = {-5, 0, 5};
		Deque<Integer> dq = new ArrayDeque<>();
		for(int i=0;i<nums.length;i++)
		{
			dq.addLast(nums[i]);
		}
		int chance=1;
		while(dq.size()!=1)
		{
			if(chance%2!=0)
			{
				dq.addLast(dq.removeFirst());
				dq.removeFirst();
			}
			else 
			{
				dq.addLast(dq.removeFirst());
				dq.addLast(dq.removeFirst());
				dq.removeFirst();
			}
			chance++;
		}
		if(chance%2==0)
		{
			System.out.println("1"+" "+ dq.peek());
		}
		else 
		{
			System.out.println("0"+" "+ dq.peek());
		}

	}

}
