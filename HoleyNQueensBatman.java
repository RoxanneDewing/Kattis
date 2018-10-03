//code taken from Dr.Ruskeys CSC 226 lecture

import java.util.Scanner;

public class HoleyNQueensBatman
{
public static int count;
public static int N;
//public static int[] x = new int[256];
public static boolean[] a = new boolean[256];
public static boolean[] b = new boolean[256];
public static boolean[] c = new boolean[256];
public static boolean[][] holes;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();
        count = 0;
        while(N!=0)
        {
            if (M==0 &&N==0)
            {
                System.exit(0);
            }
    //System.out.println("hi");
            
                for (int n = 0; n <256; n++)
                {
                    a[n] = b[n] = c[n] = true;
                }
                holes = new boolean[N][N];
                for (int k =0; k < M; k++)
                {
                    int j = sc.nextInt();
                    int y = sc.nextInt();
                    holes[j][y] = true;
                    //holes[][y] = true;
                    
                }
                
                gen(0);
            
            N = sc.nextInt();
            M = sc.nextInt();
            System.out.println(count);
            count = 0;
            //System.out.println(count);
        }
        
        
    }
    public static void gen(int col)
    {
        if (col >= N)
        {
            
            ++count;
            
        }
        for (int row = 0; row < N; ++row)
        {
            if (!holes[col][row])
            {
                if (a[row] && b[row+col] && c[row-col+N])
                {
                
                    a[row] = b[row+col] = c[row-col+N] = false;
                    if (col==N-1)
                    {
                    
                        ++count;
                    }
                    
                    else
                    {gen(col+1);}
                    a[row] = b[row+col] = c[row-col+N] = true;
                }
            }
        
        }
    }
}