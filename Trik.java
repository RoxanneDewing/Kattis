import java.util.Scanner;

public class Trik
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = 1;
        String temp = sc.nextLine();
        int length = temp.length();
        for (int i =0; i < length;i++)
        {
            int tempa = 0; 
            if (temp.charAt(i)=='A')
            {
                tempa = arr[0];
                arr[0] = arr[1];
                arr[1] = tempa;
            }
            else if (temp.charAt(i)=='B')
            {
                tempa = arr[1];
                arr[1] = arr[2];
                arr[2] = tempa;
            }
            else if (temp.charAt(i)=='C')
            {
                tempa = arr[0];
                arr[0] = arr[2];
                arr[2] = tempa;
            }
            
        }
        for (int k =0; k < 3; k++)
        {
            if (arr[k]==1)
            {
                System.out.println(k+1);
                System.exit(0);
            }
        }
    }
}