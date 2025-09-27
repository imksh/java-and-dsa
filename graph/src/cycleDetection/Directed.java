package cycleDetection;

import graph.DirectedGraph;

import java.util.HashSet;

public class Directed
{
    public static void main(String[] args)
    {
        DirectedGraph g = new DirectedGraph();

        g.add(0, 2);
        g.add(1, 0);
        g.add(2, 3);
        g.add(3, 0);

        g.print();

        System.out.println(detectCycle(g));
    }



    private static boolean detectCycle(DirectedGraph g)
    {
        HashSet<Integer> v = new HashSet<>();
        HashSet<Integer> recStack = new HashSet<>();
        for(Integer i : g.neigh.keySet())
        {
            if(helper(g,v,recStack,i))
            {
                return true;
            }
        }
        return false;
    }

    private static boolean helper(DirectedGraph g, HashSet<Integer> v,HashSet<Integer> recStack,int curr)
    {
        if(recStack.contains(curr)) return true;
        if(v.contains(curr)) return false;
        v.add(curr);
        recStack.add(curr);
        for(Integer i : g.neigh.get(curr))
        {
            if (helper(g, v,recStack, i)) return true;
        }
        recStack.remove(curr);
        return false;
    }
}
