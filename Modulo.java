import java.util.Scanner;

public class Modulo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] temp = new int[10];
        for (int  i = 0; i < 10; i++)
        {
            temp[i] = sc.nextInt() % 42;
            
            
        }
        int distinct = 10;
        for (int j = 0; j < 9; j++)
        {
            
            for (int l = j+1; l < 10; l++)
            {
                if (temp[l]==temp[j])
                {
                    distinct--;
                    break;
                }
            }
        }
        System.out.println(distinct);
    }
}