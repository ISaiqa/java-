package strings;

import java.util.Scanner;

public class parseInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a first number in string:");
        String str=sc.nextLine();
        System.out.println(" Enter a second number in string:");
        String str1=sc.nextLine();

        int i = Integer.parseInt(str);
        int j = Integer.parseInt(str1);
        System.out.println("The sum of two numbers is: "+(i+j));
        sc.close();
        int s=123;
        String s3=Integer.toString(s);
        System.out.println(s3.length());
        System.out.println(s3);
    }
    
}
