import java.util.Scanner;

public class Sum5 {
    public static void main(String[] args) {
        int n ,i,sum = 0;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter NO");
        n = r.nextInt(); 
        r.close();

        for(i=1;i<=n;i++)
{
    if(i% 5== 0)

    {
        sum = sum+i;
    }

}
System.out.println(sum);
    }
    
}
