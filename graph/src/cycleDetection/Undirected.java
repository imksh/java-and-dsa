package cycleDetection;

import graph.Graph;

import java.util.HashSet;

public class Undirected
{
    public static void main(String[] args)
    {
        Graph g = new Graph();

        g.add(0, 1);
        g.add(0, 2);
        g.add(0, 3);
        g.add(1, 0);
        g.add(2, 0);
        g.add(2, 3);
        g.add(3, 0);
        g.add(3, 2);

        g.print();

        System.out.println(detectCycle(g));
    }

    private static boolean detectCycle(Graph g)
    {
        HashSet<Integer> v = new HashSet<>();
        for(Integer i : g.map.keySet())
        {
            if(helper(g,v,i,-1))
            {
                return true;
            }
        }
        return false;
    }

    private static boolean helper(Graph g, HashSet<Integer> v,int curr,int parent)
    {
        v.add(curr);
        for(Integer i : g.map.get(curr))
        {
            if(!v.contains(i))
            {
                if(helper(g,v,i,curr)) return true;
            }
            else if (i != parent)
            {
                return true;
            }
        }
        return false;
    }


}
