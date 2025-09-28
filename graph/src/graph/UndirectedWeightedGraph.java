package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class UndirectedWeightedGraph
{
    public static class Edge
    {
        public String src;
        public String dest;
        public int weight;
        public Edge(String src,String dest,int weight)
        {
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }

        @Override
        public String toString() {
            return "{ Source: "+src+" Weight: "+weight +" Dest: "+dest+" }";
        }
    }
    public HashMap<String, ArrayList<Edge>> neigh = new HashMap<>();
    public void add(String src, String dest, int weight)
    {
        neigh.putIfAbsent(src,new ArrayList<>());
        neigh.putIfAbsent(dest,new ArrayList<>());
        Edge e = new Edge(src,dest,weight);
        boolean exists = false;
        for (Edge edge : neigh.get(src)) {
            if (edge.dest.equals(dest)) {
                exists = true;
                break;
            }
        }
        if (!exists) neigh.get(src).add(e);
        exists=false;
        for (Edge edge : neigh.get(dest)) {
            if (edge.dest.equals(src)) {
                exists = true;
                break;
            }
        }
        e = new Edge(dest,src,weight);
        if (!exists) neigh.get(dest).add(e);
    }

    public void dfs(String s)
    {
        HashSet<String> visited = new HashSet<>();
        System.out.print("Start: ");
        dfsHelper(s,visited);
        System.out.println();

    }

    private void dfsHelper(String s, HashSet<String> visited)
    {
        if(visited.contains(s)) return;
        System.out.print(s + " ");
        visited.add(s);
        for(Edge e : neigh.getOrDefault(s,new ArrayList<>()))
        {
            dfsHelper(e.dest,visited);
        }
    }

    public void print()
    {
        for(String i : neigh.keySet())
        {
            System.out.print(i+" -> ");
            System.out.println(neigh.getOrDefault(i,new ArrayList<>()));
        }

    }

}
