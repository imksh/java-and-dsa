package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DirectedGraph
{
    public HashMap<Integer, ArrayList<Integer>> neigh = new HashMap<>();
    public void add(int src, int dest)
    {
        neigh.putIfAbsent(src,new ArrayList<>());
        neigh.putIfAbsent(dest,new ArrayList<>());
        if(!neigh.get(src).contains(dest)) neigh.get(src).add(dest);
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

        visited.add(s);
        System.out.print(s+" ");
        for(Integer i : neigh.getOrDefault(s,new ArrayList<>()))
        {
            dfsHelper(i,visited);
        }
    }

    public void print()
    {
        for(Integer i : neigh.keySet())
        {
            System.out.println(i+" -> " + neigh.getOrDefault(i,new ArrayList<>()));
        }

    }
}
