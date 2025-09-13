package adjMatrix;

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
    int[][] adjMatrix;
    int vertex;
    public GraphUndirected(int vertex)
    {
        this.vertex=vertex;
        adjMatrix = new int[vertex][vertex];
    }
    public void add(int src, int dest)
    {
        adjMatrix[src][dest]=1;
        adjMatrix[dest][src]=1;
    }

    public void print()
    {
        System.out.println("Adjacency Matrix:");
        for(int i = 0; i<adjMatrix.length;i++)
        {
            for(int j=0;j<adjMatrix[i].length;j++)
            {
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}




class GraphDirected
{
    int[][] adjMatrix;
    int vertex;
    public GraphDirected(int vertex)
    {
        this.vertex=vertex;
        adjMatrix = new int[vertex][vertex];
    }
    public void add(int src, int dest)
    {
        adjMatrix[src][dest]=1;
    }

    public void print()
    {
        System.out.println("Adjacency Matrix:");
        for(int i = 0; i<adjMatrix.length;i++)
        {
            for(int j=0;j<adjMatrix[i].length;j++)
            {
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}