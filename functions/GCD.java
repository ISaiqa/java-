package functions;

import java.util.Scanner;

public class GCD 
{
    public static void getGCD(int n1, int n2)
    {
        while(n1 != n2) 
        { 
            if(n1>n2) 
            {
                n1 = n1 - n2;
            } else 
            {
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is : "+ n2);
    }  
    public static void main(String[] args)
    {
       System.out.print("Enter two numbers:");
       Scanner sc=new Scanner (System.in);
       int x =sc.nextInt();
       int y =sc.nextInt();
       getGCD(x,y);
       sc.close();

        

    } 
    }

    

