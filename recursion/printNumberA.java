import java.util.Scanner;

public class printNumberA {
    public static void printNum(int n,int i ) {
     
       
        System.out.println(i);
        if (i==n) 
        {
            return;
        }
        printNum(n,i+1);
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print(" Enter numbers you want to print:");
        int n=sc.nextInt();
       int i=1;
        printNum(n,i);
        sc.close();
    
}
}
