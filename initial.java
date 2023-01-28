import java.util.Scanner;

public class initial{
    public static void main(String[] args) {
        String str;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Name: ");
        str = r.nextLine();
         String s[] = str.split(" ");
         char first;
         r.close();
         String fst="";
        
         for(int i=0;i<s.length;i++)
         {
            
              if(i<s.length-1)
              {
                 first = s[i].charAt(0);
                 fst = fst.toUpperCase()+first +".";
              }
             else{
                fst = fst + s[i].toUpperCase();
             }
         }
         System.out.println(fst);
        }
    }



