package functions;

import java.util.Scanner;

public class table 
{
    public static void tablen(int n,int r)
    {
        System.out.println(" Table of "+n);
        for(int i=1;i<=r;i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }

    }
    public static void main(String[] args)
    {
        System.out.print(" Enter a number to print table:");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        System.out.print(" Enter the range of table:");
        int r=sc.nextInt();
        tablen(n,r);
        sc.close();
        
    }
    
}
