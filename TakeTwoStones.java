import java.util.Scanner;

public class TakeTwoStones
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int temp = N%2;
        if (temp ==1)
        {
            System.out.println("Alice");
        }
        else
        {
            System.out.println("Bob");
        }
    }
}