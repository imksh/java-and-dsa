package adjList;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        GraphUndirected unDirected = new GraphUndirected(4);

        unDirected.add(0, 1);
        unDirected.add(0, 2);
        unDirected.add(1, 2);
        unDirected.add(2, 3);

        unDirected.print();


        GraphDirected directed = new GraphDirected(4);

        directed.add(0, 1);
        directed.add(0, 2);
        directed.add(1, 2);
        directed.add(2, 3);

        directed.print();



    }
}


class GraphUndirected
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

    public GraphUndirected(int v)
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




class GraphDirected
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

    public GraphDirected(int v)
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
    }

    public void print()
    {
        System.out.println("Adjacency List:");
        for(int i = 0; i<vertex;i++)
        {
            System.out.print(i+"->");
            for(Edge e : list[i])
            {
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}