package bitManipulate;

import java.util.Scanner;

public class updateBit {
    public static void main(String[] args) {
        int newNumber;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter number:");
        int n=sc.nextInt();
        System.out.println("Enter position of bit to update: ");
        int pos=sc.nextInt();
        System.out.println(" Enter 1 if you want to update to 1 and 0 to update to zero:");
        int op=sc.nextInt();
        int bitMask=1<<pos;
        if(op==1)
        {
            newNumber = bitMask | n;
            System.out.println(" New number is "+newNumber);

        }
        else
        {
            int newBitMask=~(bitMask);
            newNumber=newBitMask & n;
            System.out.println(" New number is "+newNumber);
        }
        sc.close();

    
}
}
