import java.util.Scanner;



// import javax.annotation.processing.SupportedOptions;

public class Jagged {
    public static void main(String[] args) {
        double hr_w,b_pay;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Hours Worked: ");
        hr_w = r.nextFloat();
        System.out.println("Enter Base Pay: ");
        b_pay = r.nextFloat();
        r.close();
        double ot = 0;
        double sal = 0;
      
        double ot_pay;
       if (hr_w<60 && b_pay>=80) {
        System.out.println("Hello");
        if(hr_w<=40)
        {
             sal = hr_w*b_pay;
        }
        else if(hr_w>40)
        {
          ot = 0;
          ot_pay = hr_w-40;
          ot =  ot_pay *b_pay*1.5;
          sal = 40 *b_pay;
          
      }
        double pay = sal+ ot;
       
        System.out.println("Your Salary is : " + pay);
       }
       else
       {
        System.out.println("Error");
       }
    }
   
    
}
