import java.util.Scanner;
import java.math.*;

public class ADifferentProblem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine())
        {
            String string_one = sc.nextLine();
        
            String[] arr = string_one.split(" ");
            
            BigInteger x = new BigInteger(arr[0]);
            BigInteger y = new BigInteger(arr[1]);
        
            int res = x.compareTo(y);
            if (res==1)
            {
                BigInteger g = new BigInteger("-1");
                BigInteger t = y.multiply(g);
                BigInteger fin = x.add(t);
                System.out.println(fin);
            }
            else 
            {
                BigInteger g = new BigInteger("-1");
                BigInteger t = x.multiply(g);
                BigInteger fin = y.add(t);
                System.out.println(fin);
            }
        }
    }
}