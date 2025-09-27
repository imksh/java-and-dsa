package algorithms;

import graph.DirectedWeightedGraph;
import graph.Graph;

import java.util.HashMap;
import java.util.HashSet;

public class Dijkstra
{
    public static void main(String[] args)
    {
        DirectedWeightedGraph g = new DirectedWeightedGraph();
        g.add(0,1,1);
        g.add(0,2,4);
        g.add(1,2,2);
        g.add(1,4,7);
        g.add(2,3,5);
        g.add(3,4,3);
        g.add(3,5,2);
        g.add(4,5,6);

        g.print();

    }



}
