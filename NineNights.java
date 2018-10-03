import java.util.Scanner;

public class NineNights
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[][] temp = new String[5][5];
        for (int i = 0; i < 5; i++)
        {
            temp[i] = sc.nextLine().split("");
        }
        int count = 0;
        for (int l =0; l < 5; l++)
        {
            for(int k = 0; k < 5; k++)
            {
            
                if (temp[l][k].compareTo(".")!=0)
                {
                count++;
                    int x1 = l-2;
                    if (x1>=0)
                    {
                        if (k+1<5)
                        {
                            if (temp[x1][k+1].compareTo("k")==0)
                            {
                                System.out.println("invalid");
                                System.exit(0);
                            }
                        }
                        if (k-1>=0)
                        {
                            if (temp[x1][k-1].compareTo("k")==0)
                            {
                                System.out.println("invalid");
                                System.exit(0);
                            }
                        }
                    } 
                    int x2 = l-1;
                    
                    if (x2>=0)
                    {
                        if (k+2<5)
                        {
                            if (temp[x2][k+2].compareTo("k")==0)
                            {
                                System.out.println("invalid");
                                System.exit(0);
                            }
                        }
                        if (k-2>=0)
                        {
                            if (temp[x2][k-2].compareTo("k")==0)
                            {
                                System.out.println("invalid");
                                System.exit(0);
                            }
                        }
                    }
                    int x3 = l+2;
                    
                    if (x3<5)
                    {
                        if (k-1>=0)
                        {
                            if (temp[x3][k-1].compareTo("k")==0)
                            {
                                System.out.println("invalid");
                                System.exit(0);
                            }
                        }
                        if (k+1<5)
                        {
                            if (temp[x3][k+1].compareTo("k")==0)
                            {
                                System.out.println("invalid");
                                System.exit(0);
                            }
                        }
                    }
                    int x4 = l+1;
                    if (x4<5)
                    {
                        if (k+2<5)
                        {
                            if (temp[x4][k+2].compareTo("k")==0)
                            {
                                System.out.println("invalid");
                                System.exit(0);
                            }
                        }
                        if (k-2>=0)
                        {
                            if (temp[x4][k-2].compareTo("k")==0)
                            {
                                System.out.println("invalid");
                                System.exit(0);
                            }
                        }
                    }
                }
                //System.out.print(temp[l][k]+" ");
            }
            //System.out.println();
        }
        if (count==9)
            System.out.println("valid");
        else
            System.out.println("invalid");
    
    }
}