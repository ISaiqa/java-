package functions;

import java.util.Scanner;

public class averageThreenum 
{
    public static double Average(int a,int b,int c)
    {
        int sum=a+b+c;
        double average=sum/3;
        return average;
    }
    public static void main(String[] args) 
    {
        int a,b,c;
        System.out.print(" Enter three numbers:");
        Scanner sc=new Scanner (System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double avg=Average(a,b,c);
        System.out.println(" Average of three numbers is "+avg);
        sc.close();
    

        
    }
   
    
}
