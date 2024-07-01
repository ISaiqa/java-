package strings;

import java.util.Scanner;

public class stringArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter size of array:");
        int size=sc.nextInt();
        String array[]=new String[size];
        int totLen=0;
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter string "+(i+1)+":");
            array[i]=sc.next();
            totLen=array[i].length()+totLen;
}
System.out.println("Total length of all strings is:"+totLen);
sc.close();
    }
    
}
