package functions;

import java.util.Scanner;

public class factorial 
{
    public static int f(int n)
    {
        int f=1;
        if(n == 0)
        {
            return 0;
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                f=f*i;
            }
            return f;
        }
    }
    public static void main(String[] args) 
    {
        System.out.print(" Enter a number:");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        System.out.println(" Factorial of "+n+" is "+f(n));
        sc.close();
        
    }
}
