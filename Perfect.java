// import java.util.*;

public class Perfect{

public static void main(String[] args)
{
  int i,j,sum;
 


for(i = 1; i<=500;i++)
 
{
       sum = 0;
       for (j = 1;j<=i;j++){  
          {
               if(i%j==0)
                  {
                      sum = sum + j;
                  } 
              if(sum==i)
             {
              System.out.println(sum);
              }
          } 

          }
}
}
}
//  if (i==sum)
// {
//   System.out.println(sum + " It is a Perfect no.");
// }
// else
// {
//    System.out.println(n+"Not a Perfect no.");
// }
// }

