import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        String str;
        Scanner r =  new Scanner(System.in);
        System.out.println("Enter string: ");
        str = r.nextLine();
        r.close();
        int n = str.length()-1;
        String rev = "";
        for(int i =n;i>=0;i-- )
        {
             rev = rev+str.charAt(i);
        }
        System.out.println(rev);
    }
}
