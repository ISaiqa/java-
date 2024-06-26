package conditional;

import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) 
    {
        System.out.println(" Enter a number:");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        boolean isPrime=true;
        if(n==0)
        {
            System.out.println(n+" is neither prime nor composite.");
        }
       else if(n>0)
       {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println(n+" is a prime number");
        }
        else
        {
            System.out.println(n+" is not a prime number");
        }
       }
        sc.close();
        
    }
    
}
