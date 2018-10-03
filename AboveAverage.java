import java.util.Scanner;
import java.lang.Math;
public class AboveAverage
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int TestCases = sc.nextInt();
        for (int i = 0; i < TestCases; i++)
        {
            int numStudents = sc.nextInt();
            int[] students = new int[numStudents];
            int total = 0;
            for (int k = 0; k < numStudents; k++)
            {
                students[k] = sc.nextInt();
                total += students[k];
                
            }
            //System.out.println(total);
            double Average = (double)total/(double)numStudents;
            //Average = Average*100;
            double count = 0;
            for (int l = 0; l < numStudents; l++)
            {
                if ((double)students[l]>Average)
                {
                    count++;
                }
            }
            //System.out.println(count+" "+Average);
            double ans = (count/numStudents)*100;
        
        //  System.out.println(fin);
            String strDouble = String.format("%.3f", ans); 
            System.out.println(strDouble+"%");
        }
            //System.out.println("hi");
    }
}