import java.util.Scanner;

public class Aaah
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String String_one = sc.nextLine();
        String String_two = sc.nextLine();
        if (String_two.length()>String_one.length())
        {
            System.out.println("no");
            
        }
        else 
        {
            System.out.println("go");
        }
    }
}