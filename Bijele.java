import java.util.Scanner;

public class Bijele
{
    public static void main(String[] args)
    {
        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 2;
        arr[4] = 2;
        arr[5] = 8;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++)
        {
            int x = sc.nextInt();
            System.out.print(arr[i]-x+" ");
        }
            
    }
}