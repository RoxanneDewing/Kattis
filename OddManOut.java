import java.util.Arrays;
import java.util.Scanner;

public class OddManOut
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        int tc = 1;
        for (int i=0; i < testcases;i++)
        {
            int people = sc.nextInt();
            int[] arr = new int[people];
            for (int j = 0;j<people;j++)
            {
                int x = sc.nextInt();
                arr[j] = x;
            }
            boolean tr = false;
            for (int k = 0;k<people-1;k++)
            {
                for (int l =k+1;l<people;l++)
                {
                    if (arr[k]==arr[l])
                    {
                        arr[k]=-1;
                        arr[l]=-1;
                        break;
                    }
                }
            }
            
            System.out.print("Case #"+tc+": ");
            int num = -1;
            for (int p =0; p<people;p++)
            {
                if (arr[p]!=-1)
                {
                    num = arr[p];
                    break;
                }
            }
            System.out.println(num);
            tc = tc+1;
        }
        
        
        
    }
} 