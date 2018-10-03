import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;

class BST
{

    public static  Node root;
    public BST()
    {
        this.root = null;
    }

    
    public static int getSize(Node root)
    {
        if(root==null){
            return 0;
        }
        return 1 + getSize(root.left) + getSize(root.right);
    }

  
    public void insert(int id)
    {
        Node newNode = new Node(id, null, null);
        newNode.numChild = 0;
        if(root==null)
        {
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = null;
        while(true)
        {
            parent = current;
            if(id<current.data)
            {       
                current.numChild++;     
                current = current.left;
                
                if(current==null)
                {
                    parent.left = newNode;
                    return;
                }
                
                    
                
                
            }
            
            
            else
            {
                current.numChild++;
                current = current.right;
                if(current==null)
                {
                
                    parent.right = newNode;
                    return;
                }
                
                
            }
            
        }
}
}


class Node{
    int data;
    Node left;
    Node right;
    int numChild;   
    public Node(int data,Node l,Node r)
    {
        this.data = data;
        left = l;
        right = r;
    }
    Node copy() {
        
        Node left = null;
        Node right = null;
        if (this.left != null) {
            left = this.left.copy();
        }
        if (this.right != null) {
            right = this.right.copy();
        }
        return new Node(data, left, right);
    }
    
  
}

public class TreeInsertion
{

public static BST Right;
public static BST Left;
public static int count = 0;
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int TestCase = sc.nextInt();
        //BigInteger bi = sc.nextBigInteger();
        
        while (TestCase!=0)
        {
            BST b = new BST();
            for (int i = 0; i< TestCase; i++)
            {
                b.insert(sc.nextInt());
            }
            
            //int count;
            
            
        //  b.root.data = 12;
            //BST arr = new BST();
            //arr.root = newStart;
            //System.out.println("NewCase");
            BigInteger count = numPerm(b.root);
            //Node curr = b.root;
            System.out.println(count);
            //System.out.println(curr.numChild);
            //System.out.println(curr.right.numChild);
            TestCase = sc.nextInt();
            //System.out.println("New Case");
            b.root = null;
            
            
        }
    
    }


    public static BigInteger factorial(int n) {
        
   
       BigInteger fact = new BigInteger("1");
       for (int i = 1; i <= n; i++) {
           fact = fact.multiply(new BigInteger(i + ""));
       }
       return fact;
   
    }
    public static BigInteger choose(int n, int k)
    {
        
        //BigInteger newN = new BigInteger(n);
        //BigInteger newK = new BigInteger(k);
        BigInteger numerator = factorial(n);
        BigInteger g = factorial(k);
        BigInteger f = factorial(n-k);
        BigInteger denominator =  f.multiply(g);
        return (numerator.divide(denominator));
    }
        
    
    public static BigInteger numPerm(Node t)
    {
        if (t.numChild==0)
        {
            BigInteger one = new BigInteger("1");
            return one;
        }
        int m;
        int n;
        if (t.right==null)
        {
             m = 0;
             n = (t.left.numChild)+1;
             return (choose(m+n, n).multiply(numPerm(t.left)));
        }
        else if (t.left == null)
        {
            
            m = t.right.numChild+1;
            n = 0;
            //System.out.println("number in right is "+m);
            return (choose(m+n, n).multiply(numPerm(t.right)));
        }
        else
        {
          m = (t.right.numChild)+1;
          n = (t.left.numChild)+1;
          return (choose(m+n, n).multiply((numPerm(t.left)).multiply((numPerm(t.right)))));
        }
        //return 1;
        //return (choose(m+n, n)*(numPerm(t.left))*(numPerm(t.right)));
    }
}

