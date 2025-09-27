package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DirectedWeightedGraph
{
    public static class Edge
    {
        public int src;
        public int dest;
        public int weight;
        public Edge(int src,int dest,int weight)
        {
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }

        @Override
        public String toString() {
            return "{ Source: "+src+" Weight: "+weight +" Dist: "+dest+" }";
        }
    }
    public HashMap<Integer, ArrayList<Edge>> map = new HashMap<>();
    public HashSet<Integer> set = new HashSet<>();
    public void add(int src, int dest, int weight)
    {
        map.putIfAbsent(src,new ArrayList<>());
        map.putIfAbsent(dest,new ArrayList<>());
        set.add(src);
        set.add(dest);
        Edge e = new Edge(src,dest,weight);
        boolean exists = false;
        for (Edge edge : map.get(src)) {
            if (edge.dest == dest) {
                exists = true;
                break;
            }
        }
        if (!exists) map.get(src).add(e);
    }

    public void dfs(int s)
    {
        HashSet<Integer> visited = new HashSet<>();
        System.out.print("Start: ");
        dfsHelper(s,visited);
        System.out.println();

    }

    private void dfsHelper(int s, HashSet<Integer> visited)
    {
        if(visited.contains(s)) return;
        System.out.println(s);
        visited.add(s);
        for(Edge e : map.getOrDefault(s,new ArrayList<>()))
        {
            dfsHelper(e.dest,visited);
        }
    }

    public void print()
    {
        for(Integer i : map.keySet())
        {
            System.out.print(i+" -> ");
            System.out.println(map.getOrDefault(i,new ArrayList<>()));
        }

    }

}
