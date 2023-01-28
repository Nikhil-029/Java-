import java.util.Scanner;

public class CaseViseversa {
    public static void main(String[] args) {
        System.out.println("Enter the Sentence:");
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        int ch;
        in.close();
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch>=65 && ch<=90)
            {
                ch=ch+32;
            }
            else if(ch==32)
            {
                ch=32;
            }
            else{
                ch=ch-32;
            }
            s1=s1+(char)ch;
        }
        System.out.println("After: ");
        System.out.println(s1);
    }   
}
