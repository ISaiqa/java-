package functions;

import java.util.Scanner;

public class sumOfOddNum 
{
    public static int sum (int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
            }
        }
        return sum;

    }
    public static void main(String[] args) 
    {
        System.out.print(" Enter a number:");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        System.out.println("Sum of odd numbers up to "+n+" is "+sum(n));
        sc.close();
        
    }
    
}
