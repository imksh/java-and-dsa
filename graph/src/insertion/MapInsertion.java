package insertion;

import java.util.ArrayList;
import java.util.HashMap;

public class MapInsertion
{
   static  class Graph
    {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        public void add(int src, int dest)
        {
            map.putIfAbsent(src,new ArrayList<>());
            map.putIfAbsent(dest,new ArrayList<>());

            map.get(src).add(dest);
            map.get(dest).add(src);
        }

        public void dfs(int s)
        {
            ArrayList<Integer> visited = new ArrayList<>();
            System.out.print("Start: ");
            dfsHelper(s,visited);
            System.out.println();

        }

        private void dfsHelper(int s, ArrayList<Integer> visited)
        {
            if(visited.contains(s)) return;

            visited.add(s);
            System.out.print(s+" ");
            for(Integer i : map.get(s))
            {
                dfsHelper(i,visited);
            }
        }

    }
    public static void main(String[] args)
    {
        Graph g = new Graph();
        g.add(10,12);
        g.add(10,13);
        g.add(12,14);
        g.add(10,12);
        g.add(14,25);
        g.add(14,15);
        g.add(15,13);
        g.add(15,25);
        g.add(25,26);

        g.dfs(10);
    }
}