import java.util.Scanner;

public class transaction {
    public static void trans()
    {

    }
    public static void main(String[] args) {
        int n[]={7, 1, 1, 3, 6, 4};
        Scanner in=new Scanner(System.in);
        int sell=in.nextInt();
        in.close();
        int sub=0;
        
        {
            System.out.println("Not allowed");
            if(sell>2)
            {
                sub=n[sell-1]-n[1];
                System.out.println(sub);
            }
            else
                System.out.println("0");
        }
        // int max=a[0];
        // for(int i=0;i<a.length;i++)
        // {
        //     max=Math.max(a[i],max);
        // }
        // System.out.println(max);
    }
}
