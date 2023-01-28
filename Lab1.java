import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        int speed=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the speed: ");
        speed=in.nextInt();
        if(speed<70)
        {
            System.out.println("Ok");
        }
        else
        {
            int p=(speed-70)/5;
            int point=0;
            for(int i=0;i<p;i++)
            {
                point=point+1;
            }
            if(point>12)
            {
                System.out.println("License suspended");
            }
            else {
                System.out.println("Points: "+point);
            }
        }
    }

}