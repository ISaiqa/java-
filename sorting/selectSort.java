package sorting;

import java.util.Scanner;

public class selectSort {
    public static void printArray(int array[])
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
            }
         }
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
       for(int i=0;i<s-1;i++)
       {
        int small=i;
        for(int j=i+1;j<s;j++)
        {
            if(arr[j]<arr[small])
               small=j;

        }
        int temp=arr[i];
        arr[i]=arr[small];
        arr[small]=temp;

       }
       System.out.println("Sorted array is:");
       printArray(arr);
       sc.close();

    }
    
}

