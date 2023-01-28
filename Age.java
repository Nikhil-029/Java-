import java.util.Scanner;

// import java.util.*;
public class Age {
   

    public static void main(String[] args) {
        int age,age1;
        float h1,h2;
        Scanner nc = new Scanner(System.in);         
        System.out.println("Enter Age of A");
        age = nc.nextInt();
        nc.close();
        Scanner ac = new Scanner(System.in);         
        System.out.println("Enter Age of B ");
        age1 = ac.nextInt();
        ac.close();
        Scanner bc = new Scanner(System.in);         
        System.out.println("Enter height of A");
        h1 = bc.nextFloat();
        bc.close();
        Scanner dc = new Scanner(System.in);         
        System.out.println("Enter height of B");
        h2 = dc.nextFloat();
        dc.close();
        if(age1>age)
           System.out.println(" B is Older than A");
        else
           System.out.println(" A is Older than B");
        if(h1>h2)
           System.out.println(" A is Taller than B");
        else
          System.out.println(" B is Taller than A");
        
        
    }
    
}
