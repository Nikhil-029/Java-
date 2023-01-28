

public class Nik{

public static void main(String[] args)
{
     int i , og , rem;
   double res = 0;
     og = 1;
     for(i= 1;i<=1000;i++)
     {
     while(og>0){
        rem = og %10;
        res = res + Math.pow(rem,3);
        og = og/10;
     }

     if(i == res)
     {
        System.out.println(i );
     }
   }
   //   else
   //   {
   //      System.out.println(n + "   Not a Armstrong");
   //   }
}
}