import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HangingOutontheTerrace
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bf.readLine().split(" ");
        int L = Integer.parseInt(temp[0]);
        int N = Integer.parseInt(temp[1]);
        int count = 0;
        int tally = 0;
        for (int i = 0 ; i < N ; i++)
        {
            temp = bf.readLine().split(" ");
            int num = 0;
            if (temp[0].compareTo("enter")==0)
            {
                num = Integer.parseInt(temp[1]);
                if (count+num>L)
                {
                    tally++;
                }
                else
                {
                    count +=num;
                }
                
            }
            else
            {
                num = Integer.parseInt(temp[1]);
                count -=num;
            }
        }
        System.out.println(tally);
    }
} 