import java.util.Scanner;

public class powerofNum {
    public static int power(int x,int n)
    {
        if(n==0)
        {
         
            return 1;
        }
      
      // int p=power(x,n-1);
       //return p*x;
       if(n%2==0){
        return power(x,n/2)*power(x,n/2);
       }
       else
       {
        return x*power(x,n/2)*power(x,n/2);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter number:");
        int x=sc.nextInt();
        System.out.print(" Enter power:");
        int n=sc.nextInt();
         System.out.println(" Power of number is:"+power(x,n));  
        sc.close();

    }
}
