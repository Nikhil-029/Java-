import java.util.Scanner;
// import java.util.*;

public class Comp{
  
    public static void main(String[] args) {
        String name ;
        String reverse ;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Name ");
        name = r.nextLine();
        System.out.println("Enter Revrese: ");
        reverse = r.nextLine();
        r.close();
        if(name.equals(reverse)== true)
        {
            System.out.println("Passes the String comparision: ");
        }
        else
        {
            System.out.println(false + "  Not able to compare: ");
        }
    }
}