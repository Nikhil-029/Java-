public class arraysearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,2};

        int a=5;
        for(int i=0;i<arr.length;i++)
        {
            if(a == arr[i])
            {
                System.out.println(i);
                break;
            }
        }
    }
    
}
