//import java.util.Scanner;
//import java.util.TreeSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VerifyThisYourMajesty
{
    public static int N;
    public static int[][] coordinates;
    public static void main(String[] args) throws Exception
    {
        //TreeSet<String> tset = new TreeSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Nl = br.readLine();
         N = Integer.parseInt(Nl);

        coordinates = new int[N][N];
        String line = null;
        int x;
        int y;
        for (int j = 0; j<N;j++)
        {
        line = br.readLine();
        String[] newarr = new String[2];
        newarr = line.split(" ");
        x = Integer.parseInt(newarr[0]);
        y = Integer.parseInt(newarr[1]);
        coordinates[x][y]=1;
        }
        boolean check = false;
        int countV = 0;
        int countH = 0;
        
        for (int i =0; i < N;i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (coordinates[i][j]!=0)
                {
                    countV++;
                    checkDiag(i, j);
                }
                if (coordinates[j][i]!=0)
                {
                    countH++;
                }
            }
            if (countV>=2 || countH>=2)
            {
                System.out.println("INCORRECT");
                System.exit(0);
            }
            else
            {
                countV = 0;
                countH = 0;
            }
        }
        
        //deal with diagonals 
        
        System.out.println("CORRECT");

    }
    public static void checkDiag(int i, int j)
    {
        int x = i;
        int y = j;
        int x2 = i;
        int y2 = j;
        int x3 = i;
        int y3 = j;
        int x4 = i;
        int y4 = j;
        //count1 = 1;
        //count2 = 1;
        for (int k = i; k <= N; k++)
        {
            x = x+1;
            y = y+1;
            if(x<N && y <N)
            {
                if (coordinates[x][y]!=0)
                {
                        System.out.println("INCORRECT");
                        System.exit(0);
                }
            }
            
            x2 = x2-1;
            y2 = y2-1;
            if (x2>=0 && y2>=0)
            {
                if (coordinates[x2][y2]!=0)
                {
                        System.out.println("INCORRECT");
                        System.exit(0);
                }
            }
            
            x3 = x3-1;
            y3 = y3+1;
            if (x3>=0&&y3<N)
            {
                if (coordinates[x3][y3]!=0)
                {
                        System.out.println("INCORRECT");
                        System.exit(0);
                }
            }
            
            x4 = x4+1;
            y4 = y4-1;
            if (x4<N&&y4>=0)
            {
                if (coordinates[x4][y4]!=0)
                {
                        System.out.println("INCORRECT");
                        System.exit(0);
                }
            }
            
            //check bounds
            
        }
        
        
    }
}