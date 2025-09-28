package algorithms;

import graph.UndirectedGraph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Prims
{
    static class Pair
    {
        int wt, node,parent;
        Pair(int wt,int node,int parent)
        {
            this.wt=wt;
            this.node=node;
            this.parent=parent;
        }

        @Override
        public String toString() {
            return "{ node: "+ node + " Parent: "+ parent +" Weight " +wt+" }";
        }
    }
    public static void main(String[] args)
    {
        UndirectedGraph g = new UndirectedGraph();
        g.add(0, 1, 2);
        g.add(0, 3, 6);
        g.add(1, 2, 3);
        g.add(1, 3, 8);
        g.add(1, 4, 5);
        g.add(2, 4, 7);
        g.add(3, 4, 9);
        g.print();
        find(g,0);
    }

    private static ArrayList<Pair> find(UndirectedGraph g, int s)
    {
        HashSet<Integer> v = new HashSet<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.wt-b.wt);
        int sum=0;
        ArrayList<Pair> mst = new ArrayList<>();

        pq.offer(new Pair(0,s,-1));

        while(!pq.isEmpty())
        {
            Pair curr = pq.poll();
            if(v.contains(curr.node)) continue;
            sum+=curr.wt;
            mst.add(curr);
            v.add(curr.node);

            for(UndirectedGraph.Edge e : g.neigh.get(curr.node))
            {
                if(!v.contains(e.dest))
                {
                    pq.offer(new Pair(e.weight,e.dest,curr.node));
                }
            }
        }


        System.out.println("Sum: " +sum);
        System.out.println("MST: ");
        for(int i=0;i<mst.size();i++) {
            if (i == mst.size() - 1) {
                System.out.println(mst.get(i));
            } else {
                System.out.print(mst.get(i) + " -> ");
            }
        }

        return mst;
    }
}
