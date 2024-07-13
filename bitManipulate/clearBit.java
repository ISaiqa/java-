package bitManipulate;

import java.util.Scanner;

public class clearBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter number:");
        int n=sc.nextInt();
        System.out.println("Enter position of bit to be cleared:");
        int pos=sc.nextInt();
        int bitMask=1<<pos;
        int newBitMask=~(bitMask);
        int newNumber=newBitMask& n;
        System.out.println(" New number is "+newNumber);
        sc.close();



    
}
}
