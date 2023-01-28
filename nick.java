public  class nick{
    public static void main(String args[])
   {
     int n =5;
     int arr[] = { 1,0,1,0,1};
      int left =0,right = n-1;
    while(true)
   {
     if(left>=right)
   {
     break;
   
   }
   if(arr[left]==0)
   {
    right++;
    
   }
   else if(arr[right] == 1)
   {
     right--;
   }
   else
   {
     arr[left] = 0;
     arr[right] = 1;
   left++;
   right--;
   }
  
   }  
   for(int i=0;i<arr.length;i++)
 {
    System.out.print(arr[i]);
 }
   } 
 
   } 