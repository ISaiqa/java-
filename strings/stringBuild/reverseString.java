package strings.stringBuild;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        System.out.println(" Enter a string:");
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseaString(str));
        StringBuilder sb = new StringBuilder(str);
    
     for(int i=0; i<sb.length()/2; i++) {
       int front = i;
       int back = sb.length() - i - 1;


       char frontChar = sb.charAt(front);
       char backChar = sb.charAt(back);


       sb.setCharAt(front, backChar);
       sb.setCharAt(back, frontChar);
     }


     System.out.println(sb);
     sc.close();
        }
        // Function to reverse a string
        public static String reverseaString(String str) {
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            return sb.toString();
            


    
}
}
