import java.util.Scanner;

public class Oddities
{
    public static void main(String[] args)
    {
//      System.out.println(-5%2);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            int x = sc.nextInt();
//          if (x<0)
//              x = x*-1;
            if (x%2 == 1 || x%2 == -1)
            {
                System.out.println(x+" is odd");
            }
            else
            {System.out.println(x+" is even");}
        }
    }
}