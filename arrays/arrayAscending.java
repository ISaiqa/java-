package arrays;
import java.util.Scanner;

public class arrayAscending 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(" Enter a number:");
            arr[i] = sc.nextInt();
        }
        boolean isAscending=true;
        for(int i=0; i<n-1; i++)
        {
            if(arr[i]>arr[i+1])
            {
                isAscending=false;  
                break;
            }
        }
                if(isAscending) 
                System.out.println("The array is in ascending order");
                else
                System.out.println("The array is not in ascending order");
                sc.close();
    }




    
}
