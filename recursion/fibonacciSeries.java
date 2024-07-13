import java.util.Scanner;

class fibonacciSeries
{
    public static void fibSeries(int a,int b,int i)
    {
        if(i==0)
        {
            return;
        }
        int c=a+b;
        System.out.print(c+",");
        fibSeries(b,c,i-1);
        

    
    }
    public static void main(String[] args) {
        int a=0,b=1;
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter number of terms:");
        int n=sc.nextInt();
        System.out.print("Fibonacci Series is:");
        System.out.print(a+","+b+",");
        fibSeries(a,b,n-2);
        sc.close();
    }
}