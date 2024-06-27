package functions;

import java.util.Scanner;

public class voteEligible 
{
    public static boolean isEligble(int age)
    {
        if(age>18)  
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        boolean is_Eligible=false;
        System.out.print(" Enter age:");
        Scanner sc=new Scanner (System.in);
        int age=sc.nextInt();
        if(age>0)
        {
            is_Eligible=isEligble(age);

        }
        if(is_Eligible)
        {
            System.out.println(" Eligible for voting");
        }
        else
        System.out.println(" Not eligible for voting");
        sc.close();


        
    }
    
}
