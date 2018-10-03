import java.util.Scanner;

public class StuckInATimeLoop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int spell = sc.nextInt();
        for (int i = 1; i < spell+1; i++)
        {
            System.out.println(i+" "+"Abracadabra");
            
        }
        
    }
}