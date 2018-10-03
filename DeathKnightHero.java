import java.util.Scanner;

public class DeathKnightHero
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (int i =0; i < n; i++)
        {
            String temp = sc.nextLine();
            boolean test = false;
            for (int j = 0; j < temp.length()-1; j++)
            {
                if (temp.charAt(j)=='C' && temp.charAt(j+1)=='D')
                {
                    test = true;;
                }
            }
            if (test == true)
            {
                test = false;
            }
            else
            {
                count++;
            }
        }
        System.out.println(count);
    }
}