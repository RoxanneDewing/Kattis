import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.lang.Math;

class DirectedEdge
{
    private final int v; // edge source
    private final int w; // edge target
    public final double rate; // edge weight
    public DirectedEdge(int v, int w, double rate)
    {
        this.v = v;
        this.w = w;
        this.rate = rate;
    }
    public double rate()
    { 
        return rate; 
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
            for (int v = 0; v < V; v++)
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


public class Arbitrage
{
    public static Digraph G;
    public static boolean fin = false;
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        int V;
        V = Integer.parseInt(line = br.readLine());
        while (V!=0)
        {
            line = br.readLine();
            String[] currencies = new String[V];
            currencies = line.split(" ");
            G = new Digraph(V);
            int numEdges = Integer.parseInt(line = br.readLine());
            
            int[] arr = new int[currencies.length];
            for (int i = 0; i < numEdges; i++)
            {
                line = br.readLine();
                line = line.replace(":", " ");
                String[] temp = new String[4];
                
                temp = line.split(" ");
                double x = Double.parseDouble(temp[3]);
                double y = Double.parseDouble(temp[2]);
                double rate = x/y;
                int v = -1;
                int w = -1;
                
                
                for (int k = 0; k < currencies.length; k++)
                {
                    if (temp[0].compareTo(currencies[k])==0)
                    {
                        v = k;
                    }
                    if (temp[1].compareTo(currencies[k])==0)
                    {
                        w = k;
                    }
                    
                }
                DirectedEdge e = new DirectedEdge(v, w, (-1)*Math.log(rate));
                G.addEdge(e);
                
            }
            
            if (numEdges !=0)
            {
                for (int src =0; src < G.V;src++)
                {
                    isNegCycle(src);
                    if (fin==true)
                    {
                        break;
                    }
                }
            }
            
        
            V = Integer.parseInt(line = br.readLine());
            if (fin==false)
            {
                System.out.println("Ok");
            }
            else
            {
                System.out.println("Arbitrage");
            }
            
                fin = false;
            
            
        }
    }
    public static void isNegCycle(int src)
    {
        int V = G.V;
        int E = G.E;
        double[] distTo = new double[V];
        int[] edgeTo = new int[V];
        int u;
        int v;
    // Step 1: Initialize distances from src as INFINITE
        for (int i = 0; i < V; i++)
        {
            distTo[i] = 1000000000;
        }
     
        distTo[src] = 0;
 
 
    // Step 2: Relax all edges |V| - 1 times.
    
        for (int pass =1; pass <=G.V()-1;pass++)
        {
            for (int k = 0; k <G.V(); k++)
            {
                for (DirectedEdge e : G.adj[k])
                {
                        u = e.from();
                        v = e.to();
                        double weight = e.rate();
                        if (distTo[u]!= 1000000000 && distTo[u] +weight <distTo[v])
                        {
                            distTo[v] = distTo[u]+weight;
                        }
                    
                }
            }
        }
    // Step 3: check for negative-weight cycles.
        boolean check = false;
        if (fin==true)
        {return;}
        else
        {
        for (int l = 0; l <G.V(); l++)
        {
            if (check==false)
            {
                for (DirectedEdge e : G.adj[l])
                {
                    if (check == false)
                    {
                        u = e.from();
                        v = e.to();
                        double rate = e.rate();
                        if (distTo[u]!=1000000000 &&distTo[u]+rate<distTo[v])
                        {
                            //System.out.println("Arbitrage");
                            fin = true;
                            check = true;
                            if (fin==true)
                            {return;}
                        }
                    }
                    else {return;}
            
                }
            }
            else {return;}
        }
    }   
    
    }
}


