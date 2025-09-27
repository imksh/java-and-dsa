package stack;

import java.util.Arrays;
import java.util.Stack;

public class MountainPeak {

	public static void main(String[] args) 
	{
		int[] heights = {6,5,3,6};  // Expected Output : -1 6 6 -1
		Stack<Integer> stack = new Stack<>();
        int[] ans = new int[heights.length];
        stack.push(-1);
        for(int i=heights.length-1;i>=0;i--)
        {
            ans[i]=-1;
            while(!stack.isEmpty())
            {
                if(stack.peek()>heights[i])
                {
                    ans[i]=stack.peek();
                    break;
                }
                else
                {
                    stack.pop();
                }
            }
            stack.push(heights[i]);
        }
        
        System.out.println(Arrays.toString(ans));
		

	}

}
