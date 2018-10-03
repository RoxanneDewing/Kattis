//import java.util.Scanner;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class ColoringGraphs
{
public static int V;
public static LinkedList<Integer>[] Graph;
public static int[] color;
public static int m;


   public static boolean graphColoringUtil(int m, int v)
    {
    
        
        
        if (v == V)
            return true;
        
        boolean[] unSafe = new boolean[m+1];
        for (int vert : Graph[v])
        {
            unSafe[color[vert]] = true;
        }
        for (int c = 1; c <= m; c++)
        {
       
            if (unSafe[c]==false)
            {
                color[v] = c;
                
                if (graphColoringUtil(m, v + 1))
                {
                    
                    color[v] = 0;
                    return true;
                }
 
                color[v] = 0;
            }
        }
 
        return false;
        
    }
    public static boolean isSafe(int v, int k)
    {
        for (int vert : Graph[v])
        {
            if (color[vert]==k)
            {
                return false;
            }
        }
        return true;
    }

    
    public static void main(String[] args) throws Exception
    {
        int edgeCount= 0;
        int lowerBound = 1000;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        V = Integer.parseInt(br.readLine());
        color = new int[V];
        if (V==2)
        {
            System.out.println(2);
            System.exit(0);
        }
        Graph = new LinkedList[V];
        for (int k = 0;  k < V; k++)
        {
            Graph[k] = new LinkedList<Integer>();
        }
        //add the edges
        for (int i = 0; i < V; i++)
        {
            int tempe = 0;
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j < temp.length; j++)
            {
                tempe++;
                int x = Integer.parseInt(temp[j]);
                edgeCount++;
                Graph[i].addFirst(x);
                Graph[x].addFirst(i);
            }
            if (tempe<lowerBound)
            {
                lowerBound = tempe;
            }
            
        }
        color[0] = 0;
    //  col();
        int max =0;
        /*
        for (int f = 0; f < V; f++)
        {
            if (color[f]> max)
            {
                max = color[f];
            }   
        }
        */
        //System.out.println(max+1);
        int m =2;
        int low = 2;
        int high = V;
        int mid;
        Search(2, V);
    
    //  System.out.println(graphColoringUtil(20, 0));
    
        for (int f = 11; f >=2; f--)
        {
            if (!graphColoringUtil(f, 0))
            {
                    System.out.println(f+1);
                    System.exit(0);
            }
            
        }
        System.out.println(2);
            
    }
    
    public static void Search(int low, int high)
    {
        if (high==low)
        {
            System.out.println(high);
            System.exit(0);
        }
        
        int mid = low +(high-low)/2;
        
        if (graphColoringUtil(mid, 0))
        {
            high = mid;
            //Graph
        }
        else
        {
            low = mid+1;
        }
    //  System.out.println(high+" " +low);
        Search(low, high);
    }
    
    
}




