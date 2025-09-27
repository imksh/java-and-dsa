package algorithms;

import graph.DirectedGraph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class KoshaRaju
{
    public static void main(String[] args)
    {
        DirectedGraph g = new DirectedGraph();

        g.add(1, 0);
        g.add(0, 2);
        g.add(2, 1);
        g.add(0, 3);
        g.add(3, 4);

        g.print();


        ArrayList<ArrayList<Integer>> components = ssc(g,1);

        System.out.println("Strongly connected components");
        for(ArrayList<Integer> component : components)
        {
            System.out.println(component);
        }
    }

    private static ArrayList<ArrayList<Integer>> ssc(DirectedGraph g, int s)
    {
        //Find topological sort : phase 1
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> v = new HashSet<>();
        for(Integer i : g.neigh.keySet())
        {
            if(!v.contains(i))
            {
                sort(g,st,v,i);
            }
        }

        //Transpose the graph : phase 2

        DirectedGraph tgraph = new DirectedGraph();
        for(Integer src : g.neigh.keySet())
        {
            ArrayList<Integer> dest = g.neigh.get(src);
            for(Integer i : dest)
            {
                tgraph.add(i,src);
            }
        }

        //Traverse stack : phase 3
        v.clear();
        ArrayList<ArrayList<Integer>> components = new ArrayList<>();
       while(!st.isEmpty())
       {
           int src = st.pop();
           if(!v.contains(src))
           {
               ArrayList<Integer> list = new ArrayList<>();
               dfs(tgraph,v,src,list);
               components.add(list);
           }
       }

       return components;

    }

    private static void dfs(DirectedGraph tgraph, HashSet<Integer> v, int src, ArrayList<Integer> list)
    {
       v.add(src);
       list.add(src);
       for(Integer i : tgraph.neigh.get(src))
       {
           if(!v.contains(i))
           {
               dfs(tgraph,v,i,list);
           }
       }
    }

    private static void sort(DirectedGraph g,Stack<Integer> st,HashSet<Integer> v, int s)
    {
        v.add(s);

        for(Integer i: g.neigh.get(s))
        {
            if(!v.contains(i)) sort(g,st,v,i);;
        }
        st.push(s);
    }


}
