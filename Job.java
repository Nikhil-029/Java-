import java.util.Scanner;

public class Job {
    public static void main(String[] args) {
        int  ap_age,w_exp,lift,type;
        Scanner ac = new Scanner(System.in);
        System.out.println("Enter Your Age :");
        ap_age = ac.nextInt();
        ac.close();
        Scanner bg = new Scanner(System.in);
        System.out.println("Enter Your Work Experience :");
        w_exp = bg.nextInt();
        bg.close();
        Scanner rd = new Scanner(System.in);
        System.out.println("How much weight you  able to lift :");
        lift = rd.nextInt();
        rd.close();
        Scanner cd = new Scanner(System.in);
        System.out.println("Enter Your Typing Speed :");
        type = cd.nextInt();
        cd.close();

        if((ap_age>=16 && w_exp >=2) && lift>=20 && type >=50)
             System.out.println(" Congratulations You are Selected For This Job.");
        else 
        System.out.println(" Sorry! You Are Not Selected. ");
    }
    
}
