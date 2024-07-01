package strings;

import java.util.Scanner;

public class charAT {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a string:");
        String s=sc.nextLine();
        System.out.println(" Enter a character to search: ");
        char ch=sc.next().charAt(0);
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            {
                System.out.println(" The character is present at index "+(i+1));
            }

        }
        sc.close();
    

    
}
}
