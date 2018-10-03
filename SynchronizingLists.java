import java.util.Scanner;
import java.util.Arrays;

public class SynchronizingLists
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0)
        {
                    int[] arr = new int[n];
                    int[] backarr = new int[n];
                    int[] arr_two = new int[n];
                    int[] backarr_two = new int[n];
                        for (int i = 0 ; i < n; i++)
                        {
                            int temp = sc.nextInt();
                            arr[i] = temp;
                            backarr[i] = temp;
                            
                        }
                        for (int j = 0; j < n; j++)
                        {
                            int x = sc.nextInt();
                            arr_two[j] =x;
                            backarr_two[j] = x;
                            
                        }
                
                    Arrays.sort(arr);
                    Arrays.sort(arr_two);
                    int found = 0;
                    //System.out.println(arr[0]);
                    int[] fin = new int[n];
                    for (int l =0; l < n;l++)
                    {
                        int find = backarr[l];
                        for (int k = 0; k < n; k++)
                        {
                            if (arr[k]==find)
                            {
                                found = k;
                                break;
                            }
                        }
                        fin[l] = arr_two[found];
                        
                    }
                
                    
    
    
        
                        int num = 0;
                        //find linearly how big each number is in arr
                
            
            
                    for (int q = 0; q< n;q++)
                    {
                        System.out.println(fin[q]);
                    }
                    n= sc.nextInt();
                    if (n!=0)
                    {
                        System.out.println();
                    }
        }
    }
}