import java.util.Scanner;

public class Tarifa
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int Final = 0;
        int temp = 0;
        for (int i = 0; i < N; i++)
        {
            temp = X-sc.nextInt();
            Final += temp;
        }
        System.out.println(Final+X);
    }
}