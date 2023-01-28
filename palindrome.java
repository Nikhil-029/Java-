import java.util.Scanner;



public class palindrome {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String");
        str = in.next().toLowerCase();
        in.close();
        String rev = "";
    for(int i = str.length()-1;i>=0;i--)
      {
        rev = rev + str.charAt(i);   
      }
      if(str.equals(rev))
      {
        System.out.println(str + "  is Palindrome ");
      }
      else{
        System.out.println(str+" is not palindrome:");
      }

    }}



