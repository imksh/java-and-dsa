package algorithms;

import graph.UndirectedWeightedGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Tarjan
{
    public static void main(String[] args)
    {
        UndirectedWeightedGraph g = new UndirectedWeightedGraph();
        g.add("a","b",1);
        g.add("b","c",1);
        g.add("c","d",1);
        g.add("d","e",1);
        g.add("e","f",1);
        g.add("f","c",1);



        ArrayList<UndirectedWeightedGraph.Edge> bridges = find(g);

        System.out.println("Bridges:");
        for(UndirectedWeightedGraph.Edge e : bridges)
        {
            System.out.println(e);
        }
    }

    private static ArrayList<UndirectedWeightedGraph.Edge> find(UndirectedWeightedGraph g)
    {
        HashSet<String> v = new HashSet<>();
        HashMap<String,Integer> time = new HashMap<>();
        HashMap<String,Integer> low = new HashMap<>();
        HashMap<String,String> parent = new HashMap<>();
        ArrayList<UndirectedWeightedGraph.Edge> bridges = new ArrayList<>();
        for(String s : g.neigh.keySet())
        {
            if(!v.contains(s))
            {
                helper(g,bridges,s,v,time,low,parent,0);
            }
        }
        return bridges;

    }

    private static void helper(UndirectedWeightedGraph g, ArrayList<UndirectedWeightedGraph.Edge> bridges , String src, HashSet<String> v, HashMap<String, Integer> time, HashMap<String,Integer> low, HashMap<String,String> parent ,int t)
    {
        v.add(src);
        time.put(src,t);
        low.put(src,t);

        for(UndirectedWeightedGraph.Edge e : g.neigh.get(src))
        {
            if(!v.contains(e.dest))
            {
                parent.put(e.dest,src);
                helper(g,bridges,e.dest,v,time,low,parent,t+1);
                low.put(src,Math.min(low.get(e.dest),low.get(src)));
                if(low.get(e.dest)>time.get(src))
                {
                    bridges.add(e);
                }
            }
            else if(!e.dest.equals(parent.get(src)))
            {
                low.put(src,Math.min(time.get(e.dest),low.get(src)));
            }
        }
    }


}
