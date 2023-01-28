import java.util.*;
public class RemoveVowel {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any Sentence");
        String s=in.nextLine();
        String s1="";
        in.close();
        // s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i'|| c=='o' || c=='u'|| c=='A' || c=='E' || c=='I'|| c=='O' || c=='U')
            {
                continue;
            }
            else{
                s1=s1+c;
            }
        }
        System.out.println("After removing vowel");
        System.out.println(s1);
    }
    
}
