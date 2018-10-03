import java.util.Scanner;

public class MirrorImages
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int count = 1;
        for (int i = 0; i < n; i++)
        {
            System.out.println("Test"+" "+count);
            count++;
            String[] temparr = sc.nextLine().split(" ");
            int row = Integer.parseInt(temparr[0]);
            int col = Integer.parseInt(temparr[1]);
            String[][] arr = new String[row][col];
            for (int j = 0 ; j < row; j++)
            {
                arr[j] = sc.nextLine().split("");
            }
            //String[][] newarr = new String[row][col];
            /*
            for (int k = 0; k < row; k++)
            {
                for (int l = 0; l < col; l++)
                {
                    if (arr[k][l].compareTo("x")!=0)
                    {
                        String tempone = arr[k][l];
                        String temptwo = arr[l][k];
                        newarr[k][l] = temptwo;
                        newarr[l][k] = tempone;
                        arr[k][l] = "x";
                        arr[l][k] = "x";
                    }
                }
            }
            */
            for (int h = row-1; h >= 0; h--)
            {
                for (int g = col-1; g >=0; g--)
                {
                    System.out.print(arr[h][g]);
                }
                System.out.println();
            }
        }
    }
}