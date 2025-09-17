package allPaths;

import graph.Graph;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Graph g = new Graph();

        g.add(0, 1);
        g.add(0, 2);
        g.add(1, 0);
        g.add(1, 3);
        g.add(2, 0);
        g.add(2, 4);
        g.add(3, 1);
        g.add(3, 4);
        g.add(3, 5);
        g.add(4, 2);
        g.add(4, 3);
        g.add(4, 5);
        g.add(5, 3);
        g.add(5, 4);
        g.add(5, 6);
        g.add(6, 5);

        ArrayList<ArrayList<Integer>> paths = findPaths(g,0,2);
        System.out.println(paths);
    }


    private static ArrayList<ArrayList<Integer>> findPaths(Graph g, int s, int d)
    {
        ArrayList<ArrayList<Integer>> allPath = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        helper(g,s,d,allPath,list);
        return allPath;
    }

    static void helper(Graph g,int s , int d , ArrayList<ArrayList<Integer>> path, ArrayList<Integer> list)
    {
        if(s==d)
        {
            list.add(d);
            path.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }
        list.add(s);
        for(Integer i : g.map.get(s))
        {
            if(!list.contains(i)) {
                helper(g, i, d, path, list);
            }
        }
        list.remove(list.size()-1);
    }

}
