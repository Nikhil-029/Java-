

public class Roatation {
    public static void main(String[] args) {
        
    
    int nums[] = {4,5,6,7,0,1,2};
    for(int i = 0;i<3;i++)
    {
       int  last = nums[nums.length-1];
       for(int j=nums.length-1;j>0;j--)
       {
          nums[j] = nums[j-1];
        
       }
       nums[0]=last;
    }
    for(int i:nums)
    System.out.print(i);
}
}