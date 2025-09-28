package algorithms;

import graph.DirectedWeightedGraph;

import java.util.ArrayList;
import java.util.HashMap;

public class Bellmanford
{
    public static void main(String[] args) {
        DirectedWeightedGraph g = new DirectedWeightedGraph();
        g.add(0,1,4);
        g.add(0,2,5);
        g.add(1, 2, -3);
        g.add(1, 3, 6);
        g.add(2, 3, 2);
        g.add(3, 4, 1);
        g.print();
        find(g,0);

    }

    private static void find(DirectedWeightedGraph g, int s) 
    {
        int v = g.set.size();
        HashMap<Integer,Integer> dist = new HashMap<>();
        for(Integer i : g.set)
        {
            dist.put(i,Integer.MAX_VALUE);
        }
        dist.put(s,0);
        
        for(int i=0;i<v-1;i++)
        {
            for(Integer x : g.neigh.keySet())
            {
                ArrayList<DirectedWeightedGraph.Edge> edges = g.neigh.get(x);
                for(DirectedWeightedGraph.Edge e : edges) {
                    int updated = dist.get(e.src) + e.weight;

                    if (dist.get(e.src) != Integer.MAX_VALUE && (updated < dist.get(e.dest))) {
                        dist.put(e.dest, updated);
                    }
                }
            }
        }

        for(Integer x : g.neigh.keySet())
        {
            ArrayList<DirectedWeightedGraph.Edge> edges = g.neigh.get(x);
            for(DirectedWeightedGraph.Edge e : edges) {
                if (dist.get(e.dest) != Integer.MAX_VALUE && (dist.get(e.src) + e.weight) < dist.get(e.dest)) {
                    System.out.println("No shortest path");
                    return;
                }
            }
        }

        for(Integer i : dist.keySet())
        {
            System.out.println(s +" -> "+ i + " | Distance "+ dist.get(i));
        }

    }

}
