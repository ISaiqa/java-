package strings;

import java.util.Scanner;

public class stringlen
{
    public static void main(String[] args) {
        System.out.println(" Enter a string :");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Length of the string is : "+s.length());
        sc.close();

    }
}