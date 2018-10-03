import java.util.Scanner; 

public class Filip
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        String[] arr = temp.split(" ");
        String one = "";
        String two = "";
        for (int i = 2; i >=0; i--)
        {
            one += arr[0].charAt(i);
            two += arr[1].charAt(i);
        }
        int x = Integer.parseInt(one);
        int y = Integer.parseInt(two);
        
        if (x>y)
        {
            System.out.println(x);
        }
        else 
        {
            System.out.println(y);
        }
        
    }
}

