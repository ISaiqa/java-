package arrays;

import java.util.Scanner;

public class minMax 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter size of array:");
        Scanner scan=new Scanner(System.in);
        int size = scan.nextInt();
        System.out.println("Enter numbers in array:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter a number:");
            arr[i]=scan.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<size;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Minimum number is:"+min);
        System.out.println("Maximum number is:"+max);
        scan.close();
        
    }
    
}