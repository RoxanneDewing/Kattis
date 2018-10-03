import java.util.Scanner;

public class GrassSeedInc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double C = sc.nextDouble();
        int n = sc.nextInt();
        double fin = 0.0;
        for (int i = 0; i < n; i ++)
        {
            fin += (sc.nextDouble()*sc.nextDouble());
        }
        fin *=C;
        System.out.println(fin);    
    }
    
}