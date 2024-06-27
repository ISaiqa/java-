package functions;

import java.io.IOException;
//import java.util.*;

/*public class DoWhile 
{
    public static void main(String[] args) throws IOException {
int countz=0,countp=0,countn=0;
    System.out.println(" This program will keep entering number until you press s to stop.");
    char c;
    int n=1;
    do
    {
        System.out.print(" Enter a number:");
        //Scanner sc=new Scanner (System.in);
        c = (char) System.in.read();
        if(c=='s')
        {
            break;
        }
        else
        {
            n=c;
        }
        if(n==0)
        {
            countz++;
        }
        else if(n>0)
        {
            countp++;
        }
        else
        {
            countn++;
        }

    }while(c!='s');
    System.out.println(" Total zeros "+countz);
    System.out.println(" Total positive numbers "+countp);
    System.out.println(" Total negative numbers "+countn);

}
}*/
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int countz = 0, countp = 0, countn = 0;
        System.out.println("This program will keep entering numbers until you press 's' to stop.");
        char c;
        int n = 1;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine(); // Read the entire line
            c = input.charAt(0); // Extract the first character

            if (c == 's') {
                break;
            } else {
                n = c;
            }

            if (n == 0) {
                countz++;
            } else if (n > 0) {
                countp++;
            } else {
                countn++;
            }
        } while (c != 's');

        System.out.println("Total zeros: " + countz);
        System.out.println("Total positive numbers: " + countp);
        System.out.println("Total negative numbers: " + countn);

        scanner.close();
    }
}
