package conditional;

import java.util.Scanner;

public class fibnocciSeries {
    public static void main(String[] args) {
        int a,b,c;
        a=0;
        b=1;
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter number of terms:");
        int n=sc.nextInt();
        System.out.print(a+","+b);
        for(int i=2;i<n;i++)
        {
          c=a+b;
            System.out.print(","+c);
            a=b;
            b=c;
            }
            sc.close();
            }

    
}
