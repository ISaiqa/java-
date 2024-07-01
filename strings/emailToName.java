package strings;

import java.util.Scanner;

public class emailToName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter email:");
        String email = sc.nextLine();
        String name;
        int i = email.indexOf('@');
        name = email.substring(0, i);
        System.out.println("Username is:"+name);
        String name1=" ";
        for(int j=0;j<name.length();j++)
        {
          if(name.charAt(j)!='.' && name.charAt(j)!='@')
          {
            name1=name1+name.charAt(j);
            }
        }
        System.out.println(name1);
        sc.close();
    }
    
    
}
