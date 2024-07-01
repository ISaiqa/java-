package strings;
import java .util.*;

public class joinStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter first name:");
        String firstName=sc.nextLine();
        System.out.println(" Enter last name:");
        String lastName=sc.nextLine();
        String fullNme=firstName+" "+lastName;
        System.out.println(" Full name is:"+fullNme);
        sc.close();

    
    
}
}
