import java.util.Scanner;

public class FalseSenseofSecurity
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine())
        {
            String encrypt = sc.nextLine();
            int len = encrypt.length();
            String morse_Version = "";
            int[] arr = new int[len];
            for (int i = 0; i < len; i++)
            {
                String temp = decode(encrypt.charAt(i));
                arr[i] = temp.length();
                morse_Version = morse_Version + temp;
            }
            int[] fin = new int[len];
            int index = 0;
            for (int k = len-1; k >=0; k--)
            {
                fin[k] = arr[index];
                index++;
            }
            index = 0;
            String newString = "";
            for (int j = 0; j<len; j++)
            {
                int newLength = fin[j];
                int t = index+newLength;
                String sub = morse_Version.substring(index, t);
                index = index+newLength;
                newString = newString + encode(sub);
            }
            System.out.println(newString);
            
        }
    }
    public static String decode(char x)
    {
        if (x=='A')
            return ".-";
        if (x=='B')
            return "-...";
        if (x=='C')
            return "-.-.";
        if (x=='D')
            return "-..";
        if (x=='E')
            return ".";
        if (x=='F')
            return "..-.";
        if (x=='G')
            return "--.";
        if (x=='H')
            return "....";
        if (x=='I')
            return "..";
        if (x=='J')
            return ".---";
        if (x=='K')
            return "-.-";
        if (x=='L')
            return ".-..";
        if (x=='M')
            return "--";
        if (x=='N')
            return "-.";
        if (x=='O')
            return "---";
        if (x=='P')
            return ".--.";
        if (x=='Q')
            return "--.-";
        if (x=='R')
            return ".-.";
        if (x=='S')
            return "...";
        if (x=='T')
            return "-";
        if (x=='U')
            return "..-";
        if (x=='V')
            return "...-";
        if (x=='W')
            return ".--";
        if (x=='X')
            return "-..-";
        if (x=='Y')
            return "-.--";
        if (x=='Z')
            return "--..";
        if (x=='_')
            return "..--";
        if (x==',')
            return ".-.-";
        if (x=='.')
            return "---.";
        if (x=='?')
            return "----";
        else    
            return "7";
    }
    
    public static char encode(String x)
    {
        if (x.compareTo(".-")==0)
            return 'A';
        if (x.compareTo("-...")==0)
            return 'B';
        if (x.compareTo("-.-.")==0)
            return 'C';
        if (x.compareTo("-..")==0)
            return 'D';
        if (x.compareTo(".")==0)
            return 'E';
        if (x.compareTo("..-.")==0)
            return 'F';
        if (x.compareTo("--.")==0)
            return 'G';
        if (x.compareTo("....")==0)
            return 'H';
        if (x.compareTo("..")==0)
            return 'I';
        if (x.compareTo(".---")==0)
            return 'J';
        if (x.compareTo("-.-")==0)
            return 'K';
        if (x.compareTo(".-..")==0)
            return 'L';
        if (x.compareTo("--")==0)
            return 'M';
        if (x.compareTo("-.")==0)
            return 'N';
        if (x.compareTo("---")==0)
            return 'O';
        if (x.compareTo(".--.")==0)
            return 'P';
        if (x.compareTo("--.-")==0)
            return 'Q';
        if (x.compareTo(".-.")==0)
            return 'R';
        if (x.compareTo("...")==0)
            return 'S';
        if (x.compareTo("-")==0)
            return 'T';
        if (x.compareTo("..-")==0)
            return 'U';
        if (x.compareTo("...-")==0)
            return 'V';
        if (x.compareTo(".--")==0)
            return 'W';
        if (x.compareTo("-..-")==0)
            return 'X';
        if (x.compareTo("-.--")==0)
            return 'Y';
        if (x.compareTo("--..")==0)
            return 'Z';
        if (x.compareTo("..--")==0)
            return '_';
        if (x.compareTo(".-.-")==0)
            return ',';
        if (x.compareTo("---.")==0)
            return '.';
        if (x.compareTo("----")==0)
            return '?';
        else
            return '7';
    }
} 