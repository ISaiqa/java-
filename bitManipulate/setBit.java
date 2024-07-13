package bitManipulate;

import java.util.Scanner;

public class setBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter number:");
        int n=sc.nextInt();
        System.out.println("Enter position of bitto set:");
        int pos=sc.nextInt();
        int bitMask = 1<<pos;
        int newNumber = bitMask | n;
        System.out.println("New number is "+newNumber);
        sc.close();
        
}
}
