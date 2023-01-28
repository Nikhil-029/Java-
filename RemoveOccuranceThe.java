import java.util.Scanner;
public class RemoveOccuranceThe
{
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter any Sentence");
    String s=in.nextLine();
    String s1 = "";
    in.close();
    String a[]=s.split(" ");
   for(int i= 0;i<a.length;i++)
   {
        String s2=a[i].intern().toLowerCase();
        if(s2.equals("the")==true)
        {
             continue;
        }
        else{
            s1 = s1+" "+a[i];
        }
   }
   System.out.println(s1.trim());
  }

}