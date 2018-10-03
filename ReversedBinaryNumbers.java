import java.util.Scanner;

public class ReversedBinaryNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        

        String temp = Integer.toBinaryString(input);
        String fin = "";
        for (int i = 0; i < temp.length(); i++)
        {
            char c = temp.charAt(i);
            String s =Character.toString(c);
            fin = s+fin;
            
            
        }
        int done = Integer.parseInt(fin, 2);
        System.out.println(done);
        




    }

}