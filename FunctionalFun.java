import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class FunctionalFun
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        
        while ((line = bf.readLine()) !=null &&line.length() !=0)
        {
            
            TreeMap<String, String> tmap = new TreeMap<String, String>();
            String[] domain = new String[200];
            String[] co_Domain = new String[200];
        
            domain = line.split(" ");
            line = bf.readLine();
            co_Domain = line.split(" ");
            line = bf.readLine();
            boolean notFunction = false;
            int numItems_Domain = domain.length-1;
            int numItems_coDomain = co_Domain.length-1;
            //System.out.println(numItems_Domain);
            //System.out.println(numItems_coDomain);
            int n = Integer.parseInt(line);
            if (n==0)
            {
                notFunction = true;
                
            }
            boolean injective = true;
            boolean check = false;
            for (int i = 0; i< n; i++)
            {
                line = bf.readLine();
                String[] arr = new String[3];
                arr = line.split(" ");
                if (tmap.containsKey(arr[0]))
                {
                    //System.out.println("not a function");
                    notFunction = true;
                    check = true;
                    //break;
                }
                if (tmap.containsValue(arr[2]))
                {
                    injective = false;
                }
                tmap.put(arr[0], arr[2]);
            }
            boolean surjective = true;
            
            //if (notFunction==true && check ==false)
            //{
            //  System.out.println("not a function");
            //}
            //if (notFunction ==false&&tmap.size()!= 0 )
            //{
            for (int j =1; j <numItems_coDomain+1;j++ )
            {
                if (!tmap.containsValue(co_Domain[j]))
                {
                    surjective = false;
                    break;
                }   
            }
                        
            if (!notFunction)
            {
                if (injective)
                {
                    if (surjective)
                    {
                        System.out.println("bijective");
                    }
                    else
                    {
                        System.out.println("injective");
                    }
                }
                else
                {
                    if (surjective)
                    {
                        System.out.println("surjective");
                    }
                    else
                    {
                        System.out.println("neither injective nor surjective");
                    }
                }
            }
            else 
            {
                System.out.println("not a function");
            }
            
            
    
        
            
        }
        System.exit(0);
        
    }
}

