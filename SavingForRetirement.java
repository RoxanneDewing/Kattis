import java.util.Scanner;

public class SavingForRetirement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int Br = sc.nextInt();
        int Bs = sc.nextInt();
        int A = sc.nextInt();
        int As = sc.nextInt();
        int BFinal = 0;
        for (int i = 0; i < Br-B; i++)
        {
            BFinal += Bs;       
        }
        int AFinal = 0;
        while (AFinal <= BFinal)
        {
            A++;
            AFinal += As;
        }
        
        System.out.println(A);
    
    }
}