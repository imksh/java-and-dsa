package traversal;

import java.util.ArrayList;

class Graph
{
    class Edge
    {
        int src;
        int dest;
        public Edge(int src, int dest)
        {
            this.src=src;
            this.dest=dest;
        }

        @Override
        public String toString()
        {
            return "{" + src + "," + dest + "}";
        }
    }

    ArrayList<Edge>[] list ;
    int vertex;

    public Graph(int v)
    {
        this.vertex=v;
        list = new ArrayList[v];

        for(int i=0;i<v;i++)
        {
            list[i]=new ArrayList<>();
        }
    }

    public void add(int src, int dest)
    {
        list[src].add(new Edge(src,dest));
        list[dest].add(new Edge(dest,src));
    }

    public void print()
    {
        System.out.println("Adjacency List:");
        for(int i = 0; i<vertex;i++)
        {
            System.out.print(i+"->");
            for(Edge e : list[i])
            {
                System.out.print(e +" ");
            }
            System.out.println();
        }
    }
}
