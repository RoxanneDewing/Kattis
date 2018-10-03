import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.HashSet;

class MyComparator implements Comparator<String>
{
    public String a;
    public String b;
    public int compare(String a, String b)
    {
        if (a.length()==b.length())
        {
            if (a.compareTo(b)>0)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
        else
        {
            if (a.length()<b.length())
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
    }
}



public class Boggle
{

public static int itemsInDict;
public static String[] Dict;
public static PriorityQueue<String> pq; 
public static String maxString = "";
public static StringBuilder str = new StringBuilder("");
public static int points = 0;
public static boolean found = false;
public static HashSet<String> list = new HashSet<String>();
    
    public static void findWordsUtil(boolean[][] visited, char[][] boggle, String temp,int i,int j,int index, int length)
    {
    if (found == false && visited[i][j]==false)
    {
    visited[i][j] =true;
    if (length==temp.length())
    {
         visited[i][j] = false;
        found = true;
        if (!list.contains(temp))
        {
            
             
             list.add(temp);
             if (temp.length()>maxString.length())
             {
                maxString = temp;
             }
             else if(temp.length()==maxString.length())
             {
                if(temp.compareTo(maxString)<0)
                {
                    maxString = temp;
                }
             }
             int size = temp.length();
                
                if (size==3 ||size==4)
                    points+=1;
                else if(size==5)
                    points+=2;
                else if(size==6)
                    points+=3;
                else if(size==7)
                    points+=5;
                else if(size==8)
                    points+=11;
            
        }
        return;
    }
    
    char curr = temp.charAt(index);

    if (boggle[i-1][j]==curr&&visited[i-1][j]==false)
    { if (found ==false)
        findWordsUtil(visited,boggle, temp, i-1, j, index+1, length+1);}
    if (boggle[i][j-1]==curr&&visited[i][j-1]==false)
    {if (found ==false)
    findWordsUtil(visited,boggle, temp, i, j-1, index+1, length+1);}
    
     if (boggle[i+1][j]==curr&&visited[i+1][j]==false)
    {if (found ==false)
    findWordsUtil(visited,boggle, temp, i+1, j, index+1, length+1);}
    
     if (boggle[i][j+1]==curr&&visited[i][j+1]==false)
    {if (found ==false)
    findWordsUtil(visited,boggle, temp, i, j+1, index+1, length+1);}
    
     if (boggle[i-1][j-1]==curr&&visited[i-1][j-1]==false)
    {if (found ==false)
    findWordsUtil(visited,boggle, temp, i-1, j-1, index+1, length+1);}
    
    if (boggle[i+1][j+1]==curr&&visited[i+1][j+1]==false)
    {if (found ==false)
    findWordsUtil(visited,boggle, temp, i+1, j+1, index+1, length+1);}
    
     if (boggle[i-1][j+1]==curr&&visited[i-1][j+1]==false)
    {if (found ==false)
    findWordsUtil(visited,boggle, temp, i-1, j+1, index+1, length+1);}
    
    if (boggle[i+1][j-1]==curr&&visited[i+1][j-1]==false)
    {if (found ==false)
    findWordsUtil(visited,boggle, temp, i+1, j-1, index+1, length+1);}
   
   
   

  }
 
  visited[i][j] = false;
}
    public static void findWords(char[][] boggle)
    {

for (int k = 0; k < itemsInDict; k++)
{
boolean[][] visited = new boolean[6][6];
found = false;
    String temp = Dict[k];
    int index = 0;
    int length = 0;
    for (int i = 1; i < 5&&found ==false; i++)
    {
        if (found == false)
        {
        for (int j = 1; j < 5; j++)
        {
        
            if (temp.charAt(0)==boggle[i][j] && found == false)
            {
                findWordsUtil(visited, boggle, temp, i, j, index+1, length+1);
            }
        
            
        }
        
        }
        
        else break;
        
    }   
}

}
    public static void main(String[] args) throws Exception
    {
        Comparator<String> comparator = new MyComparator();
        pq = new PriorityQueue<String>(10000, comparator);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        itemsInDict = Integer.parseInt(temp);
        Dict = new String[itemsInDict];
        for (int i = 0; i < itemsInDict; i++)
        {
            Dict[i] = br.readLine();
        }
        temp = br.readLine();
        temp = br.readLine();

        int BoggleBoards = Integer.parseInt(temp);
        for (int j = 0; j < BoggleBoards; j++)
        {
            char[][] Board = new char[6][6];
            temp = br.readLine();
            for (int l = 1; l < 5; l++)
            {

                for (int k = 1; k < 5; k++)
                {
                    Board[l][k] = temp.charAt(k-1);
                }

                if (l!=4)
                {
                    temp = br.readLine();
                }
                else
                {
                    temp = br.readLine();
                }
            }
            
            findWords(Board);
            int count = list.size();
            String longest = maxString;
            str.append(points+" ");
            str.append(longest+" ");
            if (j==BoggleBoards-1)
            {str.append(count);}
            else
            {
                str.append(count+"\n");
            }
            list.clear();
            points = 0;
            maxString = "";
            found = false;
        }
        System.out.println(str);
        


    }
}

