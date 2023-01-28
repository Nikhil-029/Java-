import java.util.Scanner;

public class the {
    public static Scanner n = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Sentence: ");
        String str = n.nextLine();
        String str1 = "the";
        int count=0;
        
        String  a[] = str.split(" ");
        for(int i = 0;i<a.length;i++)
        {
            String s=a[i].intern();
            if(str1 ==s)
            {
             count++;
            }

        }
        System.out.println(count);

    }
}
