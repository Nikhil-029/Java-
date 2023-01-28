// import javax.lang.model.util.ElementScanner6;
import java.util.*;

public class prime {
    public static void main(String[] args) {
        int n;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter No : ");
        n = r.nextInt();
        r.close();

      for(int i = 0 ; i< n;i++)
      {
       if(n%i != 0)
        System.out.println(" Prime no " + n);
       else{
        System.out.println("Not a Prime no ");
       }
    }
    
    }
}
