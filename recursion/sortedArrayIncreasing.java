import java.util.Scanner;

public class sortedArrayIncreasing {
    public static Boolean arrayIsIncreasing(int i,int arr[])
    {
        if(i==arr.length-1)
        {
            return true;
            }
        if(arr[i]<arr[i+1])
        {
            return arrayIsIncreasing(i+1,arr);
            }
            else
            {
                return false;
                }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter number:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            }
        System.out.println("The array is increasing:"+arrayIsIncreasing(0,arr));
        sc.close();
    }
    
}
