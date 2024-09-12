import java.util.Scanner;

public class firstAndLastInndex {
    public static int first=-1;
    public static int last=-1;
    public static void findIndex(int i,String s,char a)
    {
        if(i==s.length())
        {
            return;
        }
        char b=Character.toLowerCase(s.charAt(i));
        if(b==a){
            if(first==-1)
            first=i;
            else
            last=i;
        }
        findIndex(i+1,s,a);
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print(" Enter a string:");
         String s=sc.nextLine();
         System.out.print(" Enter a character:");
         char b=sc.next().charAt(0);
         char a=Character.toLowerCase(b);

         findIndex(0,s,a);
         System.out.println("First index of "+a+" is "+(first+1)+" and last index of "+a+" is "+(last+1));
         sc.close();
         }

    
}
