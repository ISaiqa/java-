package arrays;

import java.util.Scanner;

public class searchElement
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
        System.out.println(" Enter value you want to search:");
        int x=in.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(matrix[i][j]==x)
                {
                    System.out.println(" Element found at position ("+(i+1)+","+(j+1)+").");
                    
                }
            }
        
        }
        in.close();
        
    }


    
}

    

