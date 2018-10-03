import java.util.Scanner;

public class Parking
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Case = sc.nextInt();
        while (Case!=0)
        {
            Case--;
            int n = sc.nextInt();
            int min = 99;
            int max = 0;
            for (int i = 0; i < n; i++)
            {
                int temp = sc.nextInt();
                if (temp<min)
                    min = temp;
                if (temp>max)
                    max = temp;
            }
            System.out.println((max-min)*2);
        
        }
    
    }
}