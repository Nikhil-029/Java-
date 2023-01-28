import java.util.*;

public class Div {
  
       static boolean Rj(int num )
       {
       double  sum = 0;
          while(num>0){
              
              int rem = num%10;
              sum = sum + Math.pow(rem,3);
              num = num/10;
          }
          if(num == sum)
          {
            return true;
          }
         else {
            return false;
         }          
       }


    public static void main(String[] args) {
        int n ,i ;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter limit");
         n = r.nextInt();
         r.close();
     for (i = 1; i<=n;i++)
     {
       if(Rj(i))
       {
        System.out.println(i);
       }
     }
    }
    
}
