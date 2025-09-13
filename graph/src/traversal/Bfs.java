package traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs
{
    public static void main(String[] args)
    {
        Graph g = new Graph(4);

        g.add(0, 1);
        g.add(0, 2);
        g.add(1, 2);
        g.add(2, 3);

        bfs(g, 0);
    }

    private static void bfs(Graph g, int s)
    {
        boolean[] visited = new boolean[g.vertex];

        Queue<Integer> q = new LinkedList<>();

        q.offer(s);
        visited[s]=true;
        while(!q.isEmpty())
        {
            int curr = q.poll();
            System.out.print(curr+ " ");
            for(Graph.Edge e : g.list[curr])
            {
                if(!visited[e.dest])
                {
                    visited[e.dest] = true;
                    q.offer(e.dest);
                }
            }
        }
    }

}
