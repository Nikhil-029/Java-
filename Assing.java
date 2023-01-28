import java.util.Scanner;
public class Assing {

     public static void main(String[] args) {

              int speed,speed1;
              Scanner nc = new Scanner(System.in);        
              System.out.println("Enter The Value of Speed: ");
               speed = nc.nextInt();
               nc.close();
            
          if(speed <=70)
               System.out.println("OK");
         else
           {
             speed1 = (speed-70)/5;

             if(speed1 <= 12)
              {
               System.out.println("Points: " + speed1);
              }
             else
                System.out.println("License Suspended ");
                 }
     }
   
   }

    

