package arrays;
import java.util.*;

public class dArray 
{
    public static void main(String[] args) 
    {
        System.out.print(" Enter number of rows of matrix:");
        Scanner in=new Scanner(System.in);
        int rows = in.nextInt();
        System.out.print(" Enter number of columns of matrix:");
        int columns = in.nextInt();
        int matrix[][]=new int[rows][columns];
        System.out.println(" Enter values in matrix:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(" Enter a number:");
                matrix[i][j]=in.nextInt();
            }
        }
        System.out.println(" Values in matrix:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(+matrix[i][j]+" ");
            }
            System.out.println();
        }
        in.close();
        
    }


    
}
