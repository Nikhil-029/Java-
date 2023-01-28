import java.util.*;
public class array_sort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number of name you want to enter: ");
        int n=in.nextInt();
        String s[] = new String[n];
        in.close();
        System.out.println("Enter Names: ");
        for(int j=0;j<n;j++)
        {
            s[j]=in.next();
        }
        for(int i=0;i<s.length;i++)
        {
          for(int j=i+1;j<s.length;j++)
          {
            if(s[i].compareTo(s[j])>0)
            {
                String temp=s[i];
                s[i]=s[j];
                s[j]=temp;
            }
          }
        }
        System.out.println();
        System.out.println("After Sorting");
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
    }

}