package pattern;

import java.util.Scanner;

public class butterflyP {
    public static void main(String[] args)
     {
         
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter rows for butterfly: ");
        int  n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
        for (int j=1;j<=i;j++)
        {
            System.out.print(" * ");
        }
        for (int k=1;k<=2*(n-i);k++)
        {
            System.out.print("   ");
        }
        for(int l=1;l<=i;l++)
        {
            System.out.print(" * ");

        }
        System.out.println();
       }
       for(int i=n;i>=1;i--)
       {
        for (int j=1;j<=i;j++)
        {
            System.out.print(" * ");
        }
        for (int k=1;k<=2*(n-i);k++)
        {
            System.out.print("   ");
        }
        for(int l=1;l<=i;l++)
        {
            System.out.print(" * ");

        }
        System.out.println();
       }
       sc.close();

    }

    
}