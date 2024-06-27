package functions;

import java.util.Scanner;

public class Circumference 
{
    public static float circum (float r)
    {
        return (float) (2 * Math.PI * r);
    }
    public static void main(String[] args) 
    {
        
        System.out.print(" Enter radius of circle:");
        Scanner sc=new Scanner (System.in);
        float n=sc.nextFloat();
        System.out.println(" Circumference of circle is "+circum(n));
        sc.close();
    }
    
}
