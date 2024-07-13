package sorting;

import java.util.Scanner;

public class bubbleSort {
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
        for(int i=0;i<s;i++)
        {
            System.out.print("Enter element "+(i+1)+" :");
            arr[i]=sc.nextInt();
        }
      
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    }
                    }
                    printArray(arr);
                    sc.close();
                   }
}