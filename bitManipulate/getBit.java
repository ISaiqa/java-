package bitManipulate;

import java.util.Scanner;

public class getBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter number:");
        int n=sc.nextInt();
        System.out.println("Enter position of bit to be checked:");
        int pos=sc.nextInt();
        int bitMask =1<<pos;
        if((bitMask & n)==0)
        {
            System.out.println("Bit was zero.");

        }
        else
        {
            System.out.println("Bit was one.");
            }
            sc.close();
    }
    
}
