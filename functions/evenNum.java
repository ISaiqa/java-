package functions;

import java.util.*;

public class evenNum 
{
    public static void evenN(int n)
    {
        if(n%2==0)
        {
            System.out.println("The number is even");
        }
        else 
        {
            System.out.println(" The number is odd");
        }
    }
    public static void main(String[] args) 
    {
        int n;
        System.out.print(" Enter a number:");
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        if(n!=0)
        {
            evenN(n);
        }
        else
        {
            System.out.println(" The number you entered is zero.");

        }
        sc.close();
    }

    
}
