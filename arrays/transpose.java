package arrays;

import java.util.Scanner;

public class transpose 
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
        System.out.println(" Transpose of matrix:");
        for(int j=0;j<columns;j++)
        {
            for(int i=0;i<rows;i++)
            {
               System.out.print(" "+matrix[i][j]+" ");
            }
            System.out.println();
        
        }
        in.close();
        
    }
    }
    

