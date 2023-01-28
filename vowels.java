
import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        String str;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Sentence");
        str = r.nextLine();
       int count = 0;
       r.close();
        for(int i = 0;i<str.length();i++)
    {
        char s = str.charAt(i);
        if(s == 'a'|| s == 'e' || s =='i' || s == 'o' || s == 'u'|| s =='A'||s == 'E'|| s=='I'||s =='O'||s=='U')
        {
       count++;
        }
    }
System.out.println(count);
    }
}
