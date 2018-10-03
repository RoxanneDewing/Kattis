import java.util.Scanner;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class UnbearableZoo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count =1;
        while (sc.hasNextInt())
        {
            
            int numCases = sc.nextInt();
            if (numCases == 0)
            {
                System.exit(0);
            }
           TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
            System.out.println("List "+count+":");
            //System.out.println();
            for (int i = 0; i <numCases+1;i++)
            {
                String str = sc.nextLine();
                str = str.toLowerCase();
                if(str.compareTo("")!=0)
                {
                //System.out.println(str);
                String[] arr = str.split(" ");
                //System.out.println("Animal type is "+arr[arr.length-1]);
                if (tmap.containsKey(arr[arr.length-1]))
                {
                    int x = tmap.get(arr[arr.length-1]);
                    x = x+1;
                    tmap.put(arr[arr.length-1], x);
                    
                }
                else
                {
                    tmap.put(arr[arr.length-1], 1);
                }
                
            }
            
            
        }
    //  System.out.println(tmap.size());
          Set set = tmap.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         System.out.print( mentry.getKey() + " | ");
         System.out.println(mentry.getValue());
      }
            count++;
        }
    }
}