// import java.util.concurrent.CountDownLatch;
// import java.util.*;

public class bool {
   

    public static void main(String[] args) {
        // int nums = new; 
        int[] nums ={1,2,3,4,1,2,5,5};
        boolean b=false;
        int  count = 0;
        for(int i = 0;i<nums.length;i++)
        {
            
            for(int j=0;j<nums.length;j++)
            {   
               if(i!=j)
               {
                if(nums[i] == nums[j])
                {
                   b=true;
                   count++;
                } 
             
            }   
            }
        }
        System.out.println(count);
        System.out.println(b);
        System.out.println(findIndex(nums, 7));
    }

    private static char[] findIndex(int[] nums, int i) {
        return null;
    }
}
