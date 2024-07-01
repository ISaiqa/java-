package strings;

import java.util.Scanner;

public class subString {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s.substring(0, 5));
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter full name:");
        String fullName=sc.nextLine();
        System.out.println("Enter first name:");
        String firstName=sc.nextLine();
        System.out.println("Enter last name:");
        String lastName=sc.nextLine();
        System.out.println("Full name:"+fullName);
        System.out.println("First name:"+firstName);
        System.out.println("Last name:"+lastName);
        sc.close();
        }

        }

    
    

