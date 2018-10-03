import java.util.Scanner;
import java.util.Arrays;
public class Akcija
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int TestCases = sc.nextInt();
        int[] arr = new int[TestCases];
        for (int i=0;i<TestCases;i++)
        {
            int x = sc.nextInt();
            arr[i]=x;
        }
        Arrays.sort(arr);
        int index =0;
        int[] sorted = new int[TestCases];
        for (int j=TestCases-1;j>-1;j--)
        {
            sorted[index]=arr[j];
            index++;
        }
//      System.out.println(sorted[0]+" "+sorted[1]+" "+sorted[2]+" "+sorted[3]);
        int total = 0;
        boolean check = true;
        int k=0;
        int m =1;
        while(check)
        {
            if (k<TestCases)
            {total += sorted[k];    }
            else {check = false;}
            if (m<TestCases)
            {total += sorted[m];        }
            else{
                check = false;
            }
        k=k+3;
        m=m+3;
        }
        System.out.println(total);
    }
}