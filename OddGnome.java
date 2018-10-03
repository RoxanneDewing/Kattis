import java.util.Scanner;

public class OddGnome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Case = sc.nextInt();
        while (Case!=0)
        {
            Case--;
            int n = sc.nextInt();
            int[] temp = new int[n];
            for (int i = 0; i < n; i++)
            {
                temp[i] = sc.nextInt();
            }
            int index = 0;
            for (int j = 1; j < n-1; j++)
            {
                if(!(temp[j-1] ==temp[j]-1 && temp[j]==temp[j+1]-1))
                {
                    if (temp[j-1]==temp[j+1]-1)
                    {
                        index = j;
                        break;
                    }
                    else if (temp[j]==temp[j+1]-1)
                    {
                        index = j-1;
                    }
                    else
                    {
                        index = j+1;
                    }
                     
                }
            
            }
            System.out.println(index+1);
    
            
        }
    }
} 