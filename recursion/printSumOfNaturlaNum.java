import java.util.Scanner;

public class printSumOfNaturlaNum {
    public static void printSum(int i,int n,int sum){
        sum=sum+i;
        if(i==n){
           //2 sum=sum+n;
            System.out.println(sum);
            return;
            }
            printSum(i+1,n,sum);
            System.out.println(i);
    }     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter number till which you want to print sum:");
        int s=sc.nextInt();
        printSum(1,s,0);
        sc.close();


    
}
}
