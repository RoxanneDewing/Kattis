import java.util.Scanner;
//import java.util.String;
public class AlphabetSpam
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String newString = sc.nextLine();
        char underscore = '_';
        char Symbol = '!';
        float countUnderscore = 0;
        newString = newString.replaceAll("[^a-zA-Z_]", "!");
        //Pattern pt = Pattern.compile("[^a-zA-Z0-9]");
//  System.out.println(newString);
            
            int count = 0;
            float countLower = 0;
            float countUpper = 0;
            float countSymbols = 0;
        for (int i = 0; i < newString.length(); i++)
        {
            String s = newString.charAt(i) +"";
            if(newString.charAt(i)=='_')
            {
                countUnderscore++;
            }
            if(s.matches("[a-z]"))
            {
                countLower++;
            }
            if(s.matches("[A-Z]"))
            {
                countUpper++;
            }
            if(s.compareTo("!")==0)
            {
                countSymbols++;
            }
            s = "";
            
            //if(newS)
        }
        System.out.println(countUnderscore/newString.length());
        System.out.println(countLower/newString.length());
        System.out.println(countUpper/newString.length());
        System.out.println(countSymbols/newString.length());
    
    }
}