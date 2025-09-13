package computerNetwork;

import java.util.*;


public class Main 
{

	public static void main(String[] args) 
	{
		int v = 3; // Number of vertices
        List<Edge> edges = new ArrayList<>();
        
        //Question 1
        
//        edges.add(new Edge(0, 1, -1));
//        edges.add(new Edge(0, 2, 4));
//        edges.add(new Edge(1, 2, 3));
//        edges.add(new Edge(1, 3, 2));
//        edges.add(new Edge(1, 4, 2));
//        edges.add(new Edge(3, 2, 5));
//        edges.add(new Edge(3, 1, 1));
//        edges.add(new Edge(4, 3, -3));
        
      //Question 2
        
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 5));
        edges.add(new Edge(1, 2, -8));
        
      //Question 3
        
//        edges.add(new Edge(0, 1, 10));
//        edges.add(new Edge(1, 2, 20));
//        edges.add(new Edge(2, 1, -30));
        
        
        BellmanFordAlgorithm.bellmanFord(edges, v, 0);

	}

}

class BellmanFordAlgorithm
{
	public static void bellmanFord(List<Edge> edges, int v, int src)
	{
		int[] distance = new int[v];
		Arrays.fill(distance,Integer.MAX_VALUE); 
		distance[src]=0; 
		
		//Relaxing v-1 times
		for (int i = 1; i < v; i++) {
            for (Edge e : edges) {
                if (distance[e.src] != Integer.MAX_VALUE && distance[e.src] + e.weight < distance[e.dest]) {
                    distance[e.dest] = distance[e.src] + e.weight;
                }
            }
        }
		//checking for negative edge cycle
		for (Edge e : edges) {
            if (distance[e.src] != Integer.MAX_VALUE && distance[e.src] + e.weight < distance[e.dest]) {
                System.out.println("Graph contains a negative weight cycle!");
                return;
            }
        }
		
		System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < v; i++) {
            System.out.println(i + "\t" + distance[i]);
        }
	}
}

class Edge
{
	int src;
	int dest;
	int weight;
    Edge(int s, int d, int w) {
        src = s; 
        dest = d; 
        weight = w;
    }
}










