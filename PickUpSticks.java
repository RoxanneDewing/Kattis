//Roxanne Dewing
//CSC 226 Assignment 2 Kattis Pick Up Sticks Solution
//V00853942
//Code taken from Robert Sedgewick, Kevin Wayne-Algorthms 4th Ed
//Code has been modified to suit the problem

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collection;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PickUpSticks
{
    private Iterable<Integer> order; // topological order
        
        public PickUpSticks(Digraph G)
        {
            DepthFirstOrder dfs = new DepthFirstOrder(G);
            order = dfs.reversePost();
        }
        
        public Iterable<Integer> order()
        { 
            return order; 
        }
    
        public boolean isDAG()
        { 
            return order == null; 
        }
        
        public static void main(String[] args) throws Exception
        {
            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            line = sc.readLine();
            String[] splited = line.split(" ");
            int n = Integer.parseInt(splited[0]);
            int m = Integer.parseInt(splited[1]);
            Digraph di = new Digraph(n+1);
            for (int i =0; i < m ; i++)
            {
                line = sc.readLine();
                String[] spl = line.split(" ");
                int a = Integer.parseInt(spl[0]);
                int b = Integer.parseInt(spl[1]);
                di.addEdge(a, b);
            }
            DirectedCycle cyclefinder = new DirectedCycle(di);
            if (cyclefinder.hasCycle())
            {
                System.out.println("IMPOSSIBLE");
            }
            else
            {
                di = di.reverse();
                PickUpSticks top = new PickUpSticks(di);
                StringBuilder s=new StringBuilder(""); 
                for (int v : top.order)
                {   
                    s.append(Integer.toString(v)+"\n");
                }
                String k = s.toString();
                k = k.trim();
                System.out.println(k);
            }
        
        }
    }

class Digraph
{
    final int V;
    private int E;
    private LinkedList<Integer>[] adj;
        public Digraph(int V)
        {
            this.V = V;
            this.E = 0;
            adj = (LinkedList<Integer>[]) new LinkedList[V];
            for (int v = 0; v < V; v++)
            adj[v] = new LinkedList<Integer>();
        }
        public int V() 
        { 
            return V; 
        }
        public int E() 
        { 
            return E; 
        }
        public void addEdge(int v, int w)
        {
            adj[v].addFirst(w);
            E++;
        }
        public Iterable<Integer> adj(int v)
        { 
            return adj[v]; 
        }
        public Digraph reverse()
        {
            Digraph R = new Digraph(V);
            for (int v = 0; v < V; v++)
            for (int w : adj(v))
            R.addEdge(w, v);
            return R;
        }
}

class DirectedCycle
{
    private boolean[] marked;
    private int[] edgeTo;
    private Stack<Integer> cycle; // vertices on a cycle (if one exists)
    private boolean[] onStack; // vertices on recursive call stack
        
        public DirectedCycle(Digraph G)
        {
            onStack = new boolean[G.V()];
            edgeTo = new int[G.V()];
            marked = new boolean[G.V()];
            for (int v = 1; v < G.V(); v++)
            if (!marked[v]) dfs(G, v);
        }
        private void dfs(Digraph G, int v)
        {
            onStack[v] = true;
            marked[v] = true;
            for (int w : G.adj(v))
            if (this.hasCycle()) 
            {
                return;
            }
            else if (!marked[w])
            { 
                edgeTo[w] = v; dfs(G, w); 
            }
            else if (onStack[w])
            {
                cycle = new Stack<Integer>();
                for (int x = v; x != w; x = edgeTo[x])
                cycle.push(x);
                cycle.push(w);
                cycle.push(v);
            }
            onStack[v] = false;
        }
        public boolean hasCycle()
        { 
            return cycle != null; 
        }
        public Iterable<Integer> cycle()
        { 
            return cycle; 
        }
}


class DepthFirstOrder
{
    private boolean[] marked;
    private LinkedList<Integer> pre; // vertices in preorder
    private LinkedList<Integer> post; // vertices in postorder
    private Stack<Integer> reversePost; // vertices in reverse postorder
        
        public DepthFirstOrder(Digraph G)
        {
            pre = new LinkedList<Integer>();
            post = new LinkedList<Integer>();
            reversePost = new Stack<Integer>();
            marked = new boolean[G.V()];
            for (int v = 1; v < G.V(); v++)
            if (!marked[v]) dfs(G, v);
        }
        private void dfs(Digraph G, int v)
        {
            pre.addLast(v);
            marked[v] = true;
            for (int w : G.adj(v))
            {
                if (!marked[w])
                {
                    dfs(G, w);
                }
            }
            post.addLast(v);
            reversePost.push(v);
        }
        public Iterable<Integer> pre()
        { 
            return pre; 
        }
        public Iterable<Integer> post()
        { 
            return post; 
        }
        public Iterable<Integer> reversePost()
        { 
            return reversePost; 
        }


}