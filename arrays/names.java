package arrays;
import java.util.*;

public class names 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of string:");
        int size=sc.nextInt();
        sc.nextLine();
        String names[]=new String[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter name:");
            names [i]=sc.nextLine();
        }
        System.out.println("Names you entered are ");
        for(int i=0;i<size;i++)
        {
            System.out.println(names[i]);
        }
        sc.close();
    }
    
}
