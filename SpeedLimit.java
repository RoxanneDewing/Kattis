import java.util.Scanner;

public class SpeedLimit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Case = sc.nextInt();
        while (Case!=-1)
        {
            int total = 0;
            int elapsed = 0;
            for (int i =0; i < Case; i++)
            {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (i==0)
                {
                    total += x*y;
                    elapsed=y;
                }
                else
                {
                    
                    int tempy = y-elapsed;
                    elapsed = y;
                    total +=x*tempy;
                }
            }
            System.out.println(total+" miles");
            Case = sc.nextInt();
            
            
        }
    }
}