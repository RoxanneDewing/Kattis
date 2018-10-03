import java.util.Scanner;

public class Bits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int TestCases = sc.nextInt();
        int Case;
        int max;
        for (int i = 0; i < TestCases; i++)
        {
            Case = sc.nextInt();
            String buffer =Integer.toString(Case);
            max = 0;
            String temp ="";
            for (int j = 0; j < buffer.length(); j++)
            {
                temp += buffer.charAt(j);
                //System.out.println(temp);
                int nextInt = Integer.parseInt(temp);
                //System.out.println(nextInt);
                String fin = Integer.toBinaryString(nextInt);
                //System.out.println(fin);
                int tempMax = 0;
                for (int k = 0; k < fin.length(); k++)
                {
                    if (fin.charAt(k)=='1')
                    {
                        tempMax++;
                    }
                }
                if (tempMax>max)
                {
                    max = tempMax;
                }
            }
            System.out.println(max);
        }
    }
}