package strings.stringBuild;

import java.util.Scanner;

public class declare {
    public static void main(String[] args) {
        StringBuilder sb=new  StringBuilder(" ");
        System.out.println(" Enter a string:");
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        sb.append(s);
        System.out.println(sb);
        sc.close();

    }
    
}
