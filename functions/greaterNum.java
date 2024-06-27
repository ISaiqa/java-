package functions;

import java.util.Scanner;

public class greaterNum
{
    public static int greatNumber(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        else if(b>a)
        {
            return b;
        }
        else
        {
            return 0;
        }

    }
    public static float greatNumber(float a,float b)
    {
        if(a>b)
        {
            return a;
        }
        else if(b>a)
        {
            return b;
        }
        else
        {
            return 0;
        }

    }
    public static void main(String[] args) 
    {
        System.out.print(" Enter two integers:");
        Scanner sc=new Scanner (System.in);
        var x=sc.nextInt();
        var y=sc.nextInt();
        System.out.println(greatNumber(x, y)+" is greater.");
        System.out.print(" Enter two integers:");
        var a=sc.nextFloat();
        var b=sc.nextFloat();
        System.out.println(greatNumber(a, b)+" is greater.");
        sc.close();

        
        
        
    }


    
}
