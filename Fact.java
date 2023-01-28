// import java.util.*;

public class Fact {
 public static void main(String[] args) {
     

    int i,j,n = 5, fact;
    float p;
    fact = 1;
    double sum = 0;
    for(i =1;i<=n;i++)
    {
        p = 2*i-1;
   
    for(j=1;j<=p;j++)
    {
        fact = fact*j;
    }
   
    System.out.println(sum +p/fact);
}  

    }
    
}


