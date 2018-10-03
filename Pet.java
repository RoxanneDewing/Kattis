import java.util.Arrays;
import java.util.Scanner;

public class Pet
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int index = 0;
        for (int i = 0; i < 5; i++)
        {
            int sum = 0;
            for (int j = 0; j < 4; j++)
            {
                sum += sc.nextInt();
            }
            arr[index] = sum;
            index+=1;
            
        }
        int tempmax = 0;
        int tempindex = 0;
        for (int k = 0; k < 5; k++)
        {
            if (arr[k]>tempmax)
            {
                tempmax = arr[k];
                tempindex = k;
            }
        }
        System.out.println(tempindex+1+" "+tempmax);
    }
} 