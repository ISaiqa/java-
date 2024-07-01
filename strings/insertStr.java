package strings;

import java.util.Scanner;

public class insertStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a string:");
        String str=sc.nextLine();
        String result=" ";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='e'||str.charAt(i)=='E')
            {
                result=result+'i';
            
            }
            else
            {
                result=result+str.charAt(i);
        }
    }
    System.out.println(result);
    sc.close();
    
}
}
