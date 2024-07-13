package sorting;

import java.util.Scanner;

public class insertSort {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.print(" Enter size of array:");
        int s=sc.nextInt();
        int[] arr=new int[s]; 
       System.out.println("Enter the elements of array:");
       for(int i=0;i<s;i++)
       {
        arr[i]=sc.nextInt();    
       }
       for(int i=1;i<s;i++)
       {
        int current=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>current)
        {
            arr[j+1]=arr[j];
            j--;
        }
      
        arr[j+1]=current;
        }
        System.out.println("Sorted array is:");
        for(int i=0;i<s;i++)
        {
            System.out.print(arr[i]+" ");


       }
       sc.close();
    }
    
    
}
