import java.util.Scanner;

public class R2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int R1 = sc.nextInt();
        int mean = sc.nextInt();
        for (int i=-1000; i<=1000; i++)
        {
            if ((R1+i)/2 ==mean)
            {
                System.out.println(i);
                System.exit(0);
                
            }
        }
    }
}