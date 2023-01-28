import java.util.Scanner;

// import java.time.MonthDay;
// import java.util.Scanner;

public class Days {

    public static void main(String[] args) {
     Student r1 = new Student();
     r1.calculate(13,12);
     r1.put();

           
    }
    
}
class Student{
    String reg,name;
     int m1,m2;
     

    Student()
    {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Registration: ");
        reg = r.nextLine();
        System.out.println("Enter Name :");
         name = r.nextLine();
         System.out.println("Enter Marks 1 and Marks 2");
         m1 = r.nextInt();
         m2 = r.nextInt();
         r.close();
    }

  int  calculate(int m1,int m2)
    {
         return m1 + m2;
    }

    void put()
    {
        int t ;
        t = calculate(m1, m2);
        if(t>=40)
        {
            System.out.println("Passsed!!!");

        }
        else{
            System.out.println("Failed!!!!");
        }

        System.out.println(reg+","+name+","+ t );
        
    }
}
