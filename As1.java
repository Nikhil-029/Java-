// import java.util.*;

public class As1 {
    public static void main(String[] args) {
        asg1 r = new asg1();
        r.get();
        r.sum();
        

        
    }
    
}

class asg1
{
      int n,i;

      void get(){
    //     Scanner s = new Scanner(System.in);
    //     System.out.println("Enter No: ");
    //     n = s.nextInt();
    //     s.close();
        // int arr[] ;
      }

       void sum()
       {
        // int sum = 0;
        int arr[] = {1,4,5,11,7};
        for(int i = 0;i<arr.length-1;i++)
        {
            for(int j = 0;j<i;j++)
            {

            }
            if(arr[i]>arr[i+1])
            {
                System.out.println(arr[i]);
            }
            else{
            }
            System.out.println(arr[i+1]);
        }
    //     for(i = 0;i<n;i++){
    //         if(i % 3 ==0 || i% 5 == 0)
    //         {
    //             sum = sum+i;
              
    //         }   


    //    }
    //    System.out.println("Sum = "+ sum);

}
}