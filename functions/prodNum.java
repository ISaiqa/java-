package functions;

import java.util.Scanner;

public class prodNum
{
    public static int product(int a,int b)
    {
        return a*b;
    }
    public static void main(String[] args) 
    {
        System.out.println(" Enter two numbers:");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("The product of two numbers is "+product(n,m));
        sc.close();
        
    }
    
}
