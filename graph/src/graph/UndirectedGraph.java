package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class UndirectedGraph
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
            return "{ Source: "+src+" Weight: "+weight +" Dest: "+dest+" }";
        }
    }
    public HashMap<Integer, ArrayList<Edge>> neigh = new HashMap<>();
    public void add(int src, int dest, int weight)
    {
        neigh.putIfAbsent(src,new ArrayList<>());
        neigh.putIfAbsent(dest,new ArrayList<>());
        Edge e = new Edge(src,dest,weight);
        boolean exists = false;
        for (Edge edge : neigh.get(src)) {
            if (edge.dest == dest) {
                exists = true;
                break;
            }
        }
        if (!exists) neigh.get(src).add(e);
        exists=false;
        for (Edge edge : neigh.get(dest)) {
            if (edge.dest == src) {
                exists = true;
                break;
            }
        }
        e = new Edge(dest,src,weight);
        if (!exists) neigh.get(dest).add(e);
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
        System.out.print(s + " ");
        visited.add(s);
        for(Edge e : neigh.getOrDefault(s,new ArrayList<>()))
        {
            dfsHelper(e.dest,visited);
        }
    }

    public void print()
    {
        for(Integer i : neigh.keySet())
        {
            System.out.print(i+" -> ");
            System.out.println(neigh.getOrDefault(i,new ArrayList<>()));
        }

    }

}
