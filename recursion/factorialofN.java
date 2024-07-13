import java.util.Scanner;

public class factorialofN {
    public static int factorial(int n)
    {
     
        if(n==1||n==0)
        {
            //System.out.println("factorial of "+n+" is "+f);
            return 1;
            }
        int f =factorial(n-1);
        return f*n;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter number for factorial:");
        int n=sc.nextInt();
        System.out.println("factorial of "+n+" is "+factorial(n)); 
        sc.close();
        }

    
}
