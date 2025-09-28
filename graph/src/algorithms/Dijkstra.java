package algorithms;

import graph.DirectedWeightedGraph;
import graph.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkstra
{
    static class Pair
    {
        int wt,node;
        Pair(int wt,int node)
        {
            this.wt=wt;
            this.node=node;
        }

        @Override
        public String toString() {
            return "{ Weight "+wt+" Node "+node+" }";
        }
    }
    public static void main(String[] args)
    {
        DirectedWeightedGraph g = new DirectedWeightedGraph();
        g.add(0,1,1);
        g.add(0,2,4);
        g.add(1,2,2);
        g.add(1,4,7);
        g.add(2,3,5);
        g.add(3,4,3);
        g.add(3,5,2);
        g.add(4,5,6);

        g.print();

       find(g,0);

    }

    private static void find(DirectedWeightedGraph g, int s)
    {
        ArrayList<Pair> paths = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.wt-b.wt);
        HashSet<Integer> v = new HashSet<>();
        HashMap<Integer,Integer> dist = new HashMap<>();

        for(Integer i : g.neigh.keySet()) dist.put(i,Integer.MAX_VALUE);

        dist.put(s,0);

        pq.offer(new Pair(0,s));
        while(!pq.isEmpty())
        {
            Pair curr = pq.poll();
            if(v.contains(curr.node)) continue;
            v.add(curr.node);
            paths.add(curr);

            for(DirectedWeightedGraph.Edge e : g.neigh.get(curr.node))
            {
                int newDist = e.weight+dist.get(curr.node);
                if(!v.contains(e.dest) && newDist<dist.get(e.dest))
                {
                    dist.put(e.dest,newDist);
                    pq.offer(new Pair(newDist,e.dest));
                }
            }
        }

        System.out.print("Source: "+s+" -> ");
        for(int i=0;i<paths.size();i++)
        {
            if(i==paths.size()-1)
            {
                System.out.println(paths.get(i));
            }
            else
            {
                System.out.print(paths.get(i) + " -> ");
            }
        }

    }


}
