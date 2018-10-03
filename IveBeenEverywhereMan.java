import java.util.TreeMap;
import java.util.Scanner;

public class IveBeenEverywhereMan
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int TestCases = sc.nextInt();
        //System.out.println(TestCases);
        for (int i = 0; i < TestCases; i++)
        {
            TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
            int numPlaces = sc.nextInt();
            //System.out.println(numPlaces);
            for (int j = 0; j< numPlaces+1; j++)
            {
                String plc = sc.nextLine();
                if (plc.compareTo("")!=0)
                {
                    if (tmap.containsKey(plc))
                    {
                    int x = tmap.get(plc);
                    x = x+1;
                    tmap.put(plc, x);
                    }
                    else
                    {
                    tmap.put(plc, 1);
                    }
                }
                
        
            }
            System.out.println(tmap.size());
        }
        //System.exit(0);
    }
}