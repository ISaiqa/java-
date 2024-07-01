package strings;

import java.util.Scanner;

public class compareStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter first string:");
        String s1=sc.nextLine();
        System.out.println(" Enter second string:");
        String s2=sc.nextLine();
        boolean n=s1.equals(s2);
        if(n)
        System.out.println("Both strings are equal");
        else 
        System.out.println("Both strings are not equal");
        int c=s1.compareTo(s2);
        if(c==0)
        System.out.println("Both strings are equal");
        else if(c>0)
        System.out.println(s1+ "is greater than "+s2);
        else
        System.out.println(s1+ " is less than "+s2);
        sc.close();




        
    }
    
}
