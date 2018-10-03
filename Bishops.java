import java.util.Scanner;
public class Bishops
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt())
        {
            int x = sc.nextInt();
            if (x==0)
            {
                System.out.println(0);
            }
            else if(x==1)
            {
                System.out.println(1);
            }
            else{
            System.out.println(2*x-2);
        }
        }
    }
}