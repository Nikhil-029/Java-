import java.util.Scanner;

public class Donar {

    private 
         int Donar_no;
         String Name,Blood_group;
     
          void input()
          {
            Scanner r = new Scanner(System.in);
            System.out.println("Enter Donar Number :");
            Donar_no = r.nextInt();
            System.out.println("Enter Donar Name :");
                Name =  r.next();
            System.out.println("Enter Blood Group:");
              Blood_group = r.next();
          }

       String check_group()
        {
           return Blood_group;
        }
         
        void output()
        {
            System.out.println(Donar_no + " Name : " + Name+" Blood Group: "+ Blood_group);
        }
    
}
class print{
   public static void main(String[] args) {
    Donar s = new Donar();
    s.input();
    s.check_group();
    s.output();
   }
}