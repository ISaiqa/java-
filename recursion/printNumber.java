import java.util.Scanner;

public class printNumber {
    public static void  printNum(int n ){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);

    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print(" Enter number you want to print:");
        int n=sc.nextInt();
        printNum(n);
        sc.close();

    
}
}