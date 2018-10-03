import java.util.Scanner;

public class Tri
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //int[] temp = new int[3];
        double x= sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        if ((x+y)==z)
        {
            
            System.out.println((int)x+"+"+(int)y+"="+(int) z);
            System.exit(0);
        }
        if (x==(y+z))
        {
            System.out.println((int)x+"="+(int)y+"+"+(int) z);
            System.exit(0);
        }
        if ((x-y)==z)
        {
            System.out.println((int)x+"-"+(int)y+"="+(int) z);
            System.exit(0);
        }
        if (x==(y-z))
        {
            System.out.println((int)x+"="+(int)y+"-"+(int) z);
            System.exit(0);
        }
        if ((x*y)==z)
        {
            System.out.println((int)x+"*"+(int)y+"="+(int) z);
            System.exit(0);
        }
        if (x==(y*z))
        {
            System.out.println((int)x+"="+(int)y+"*"+(int) z);
            System.exit(0);
        }
        if ((x/y)==z)
        {
            System.out.println((int)x+"/"+(int)y+"="+(int) z);
            System.exit(0);
        }
        if (x==(y/z))
        {
            System.out.println((int)x+"="+(int)y+"/"+(int) z);
            System.exit(0);
        }
        
//      String temp = sc.nextLine();
                
    }
}

