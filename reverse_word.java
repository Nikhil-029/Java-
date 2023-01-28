import java.util.Scanner;

public class reverse_word {
    public static void main(String[] args) {
        String str ;
        System.out.println("Enter the sentence: ");
        Scanner r = new Scanner(System.in);
        str = r.nextLine();
        String rev = "";
        r.close();
        String str1[] = str.split(" ");
        for(int i = 0;i<str1.length;i++)
        {
           String str2 = str1[i];
            String word = "";
            for(int j = str2.length()-1; j>=0;j--)
            {
                word = word+str2.charAt(j);
            }
            if(i<str1.length-1)
                rev = rev+ word + " ";
            else
            rev = rev+ word;
        }
        System.out.println(rev);
    }
}
