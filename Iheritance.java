// import java.util.*;
public class Iheritance {
    public static void main(String[] args) {
        loan r1 = new loan();
        r1.getClass();
        // r1.show();

        
    }
}
class saving_account {
    float bal;
    String c_name,address,acc_no;

    // void show();
    // void get_details();
    // void intrest();

}
class loan extends saving_account{
      String loan_id;
      int re_pay;
      int loan_amount;
    //   void repayment();

}