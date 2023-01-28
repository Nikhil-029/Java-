// import java.security.cert.Extension;

// import javax.lang.model.util.ElementScanner7;

public class prac1 {
    public static void main(String[] args) {
        
    {
        int sum,val=12;
        int arr[]={1,2,3,4,5};
        for(int i = 0;i<arr.length;i++)
        {
            sum=0;
            for(int j = i;j<arr.length;j++)
            {
                if(sum==val)
                {
                    System.out.println((i+1)+" "+(j));
                    System.exit(1);
                }
                else
                    sum=sum+arr[j];
            }
        }
    }
}
}
