import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Volim
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(bf.readLine());
        int N = Integer.parseInt(bf.readLine());
        int time = 210;
        for (int i = 0; i < N;i++)
        {
            String[] temp = bf.readLine().split(" ");
            time -= Integer.parseInt(temp[0]);
            
            if (time<0)
            {
                System.out.println(K);
                System.exit(0);
            }
            if (temp[1].compareTo("T")==0)
            {
                if (K==8)
                {K=1;}
                else
                {
                K++;
                }
            }
            
            
        }
    }
    
}