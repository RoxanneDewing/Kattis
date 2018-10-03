import java.util.Scanner;
import java.util.Arrays;

public class AToweringProblem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i=0;i<6;i++)
        {
            arr[i]=sc.nextInt();
        }
        int height_one = sc.nextInt();
        int height_two = sc.nextInt();

        for (int j = 0;j<4;j++)
        {
            for (int k=j+1;k<5;k++)
            {
                for (int l = k+1;l<6;l++)
                {
                    if (arr[j]+arr[k]+arr[l]==height_one)
                    {   
                        
                        int[] newarr = new int[3];
                        newarr[0]=arr[j];
                        newarr[1]=arr[k];
                        newarr[2]=arr[l];
                        Arrays.sort(newarr);                
        
                        int temp1 = arr[j];
                        int temp2 = arr[k];
                        int temp3 = arr[l];

                        arr[j]=-1;
                        arr[k]=-1;
                        arr[l]=-1;
                        int[] extra = new int[3];
                        int index = 0;
                        int total_two = 0;
                        for (int p = 0; p<6;p++)
                        {
                            if (arr[p]!=-1)
                            {
                                extra[index]=arr[p];
                                index++;
                                total_two += arr[p];
                            }
                        }
                        if (total_two !=height_two)
                        {
                        arr[j]=temp1;
                        arr[k]=temp2;
                        arr[l]=temp3;
                            
                            break;
                        }
                        else
                        {
                        Arrays.sort(extra);
                        System.out.print(newarr[2]+" "+newarr[1]+" "+newarr[0]+" ");
                        System.out.print(extra[2]+" "+extra[1]+" "+extra[0]);
                        System.exit(0);
                        }
                    }
                }
            }
        }
        
        
    
    }
}