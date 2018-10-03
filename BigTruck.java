import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collection;
import java.util.*;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;


class MyComparator implements Comparator<Triple>
{
    public Triple a;
    public Triple b;
    public int compare(Triple a, Triple b)
    {
        if (a.cost==b.cost)
        {
            if (a.items < b.items)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
        else
        {
            if (a.cost >b.cost)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
    }
}
class Triple
{
    public int vertex;
    public int cost;
    public int items;
    public Triple(int vertex, int cost, int items)
    {
        this.vertex = vertex;
        this.cost = cost;
        this.items = items;
    }
}
class DirectedEdge
{
    private final int v; // edge source
    private final int w; // edge target
    public final int weight; // edge weight
    public DirectedEdge(int v, int w, int weight)
    {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }
    public int weight()
    { 
        return weight; 
    }
    public int from()
    { 
        return v; 
    }
    public int to()
    { 
    return w; 
    }

}


class Digraph
{
    public final int V;
    public int E;
    public LinkedList<DirectedEdge>[] adj;
        public Digraph(int V)
        {
            this.V = V;
            this.E = 0;
            adj = (LinkedList<DirectedEdge>[]) new LinkedList[V];
            adj[0] = null;
            for (int v = 1; v < V; v++)
            adj[v] = new LinkedList<DirectedEdge>();
        }
        public int V() 
        { 
            return V; 
        }
        public int E() 
        { 
            return E; 
        }
        public void addEdge(DirectedEdge e)
        {
            adj[e.from()].add(e);
            E++;
        }
}


public class BigTruck
{
    
    public static int vertices;
    public static int[] distTo;
    public static int[] edgeTo;
    public static LinkedList<Integer> temp = new LinkedList<Integer>(); 
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        vertices = sc.nextInt();
        Digraph dg = new Digraph(vertices+1);
        int[] numItems = new int[vertices+1];
        for (int i = 1; i < vertices+1; i++)
        {
        
            numItems[i] = sc.nextInt();
        //  System.out.println("at numItems["+i+"] is "+numItems[i]);
        }
        int edges = sc.nextInt();
        if (edges == 0)
        {
            System.out.println("impossible");
            System.exit(0);
        }
        int num = 0;
        
        for (int k = 0; k < edges; k++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int d = sc.nextInt();
            DirectedEdge newEdge = new DirectedEdge(a, b, d);
            DirectedEdge newEdge_reversed = new DirectedEdge(b, a, d);
            dg.addEdge(newEdge);
            dg.addEdge(newEdge_reversed);
        }
        
        
        Comparator<Triple> comparator = new MyComparator();
//PriorityQueue<MyClass> arrival = new PriorityQueue<MyClass>(10, comparator);
        Triple first_triple = new Triple(1, 0, numItems[1]);
        PriorityQueue<Triple> pq = new PriorityQueue<Triple>(10000, comparator);
        pq.add(first_triple);
        boolean visited[] = new boolean[dg.V];
        int shortest = 20000;
        int package_sum = 0;
        while(pq.size() !=0)
        {
            Triple current = pq.poll();
            if (current.vertex == vertices)
            {
                shortest = current.cost;
                package_sum = current.items;
                break;
            }
            if (!visited[current.vertex])
            {
                visited[current.vertex] = true;
                for (DirectedEdge h : dg.adj[current.vertex])
                {
                    if (!visited[h.to()])
                    {
                        Triple new_trip = new Triple(h.to(), current.cost+h.weight, current.items + numItems[h.to()]);
                        pq.add(new_trip);
                    }
                }
            }
        }
        if (shortest !=20000)
        {
            System.out.println(shortest+" "+package_sum);
        }
        else
        {
            System.out.println("impossible");
        }
        

    }



}

