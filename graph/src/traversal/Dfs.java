package traversal;

import java.util.ArrayList;

public class Dfs
{
    public static void main(String[] args)
    {
        Graph g = new Graph(4);

        g.add(0, 1);
        g.add(0, 2);
        g.add(1, 2);
        g.add(2, 3);

        dfs(g,0);
    }

    private static void dfs(Graph g,int s)
    {
        boolean[] visited = new boolean[g.vertex];
        helper(g,visited,s);
    }

    private static void helper(Graph g, boolean[] visited, int curr)
    {

        visited[curr]=true;
        System.out.print(curr + " ");

        for(Graph.Edge e : g.list[curr])
        {
            if(!visited[e.dest]) helper(g,visited,e.dest);
        }
    }

}
