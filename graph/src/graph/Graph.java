package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Graph
{
    public HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    public void add(int src, int dest)
    {
        map.putIfAbsent(src,new ArrayList<>());
        map.putIfAbsent(dest,new ArrayList<>());
        if(!map.get(src).contains(dest)) map.get(src).add(dest);
        if(!map.get(dest).contains(src)) map.get(dest).add(src);
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
        for(Integer i : map.getOrDefault(s,new ArrayList<>()))
        {
            dfsHelper(i,visited);
        }
    }

    public void print()
    {
        for(Integer i : map.keySet())
        {
            System.out.println(i+" -> " +map.getOrDefault(i,new ArrayList<>()));
        }

    }

}
