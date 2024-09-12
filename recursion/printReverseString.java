import java.util.Scanner;


public class printReverseString {
    public static void reverseString(int i,String s){
        if(i==0){
           // System.out.println(s);
           System.out.print(s.charAt(i)+" ");
            return;
    }
    System.out.print(s.charAt(i)+" ");
    reverseString(i-1,s);
    

}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter a string:");
        String s=sc.nextLine();
       int i=s.length();
       //System.out.println(i);
        reverseString(i-1,s);
        sc.close();
    
}
}
