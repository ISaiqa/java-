package functions;

import java.util.Scanner;

public class exponent 
{
    public static int power(int x,int n)
    {
        int pow=1;
        for(int i=1;i<=n;i++)
        {
            pow=pow*x;
        }
        return pow;

    }
    public static void main(String[] args)
    {
       System.out.print("Enter a number:");
       Scanner sc=new Scanner (System.in);
       int x =sc.nextInt();
       System.out.print("Enter its exponent:");
       int n=sc.nextInt();
       int result=power(x,n);
       System.out.println(x+" raised to the power "+n+" is "+result);
       sc.close();
        
    }

    
}
