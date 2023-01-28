public class Arm{


    
    public static void main(String[] args) {
        int n = 1000,i,r ;
         double sum = 0;
        
        for(i=1;i<=1000;i++)
        {
            n = i;
            while(n>0)
            {
                r = n%10;
                sum = sum+ Math.pow(r,3);
                n = n/10;
            }
            if(sum == i)
            {
                System.out.println(i );
            }
            sum =0;
        }

    }
}