package conditional;

import java.util.Scanner;

public class allEvenNum {
    public static void main(String[] args) 
    {
        System.out.print(" Enter a number to print even numbers:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if((i%2)==0)
               System.out.print(i+" ");
        }
        sc.close();
        
    }
    
}
