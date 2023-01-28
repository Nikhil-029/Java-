public class Class {
    public static void main(String[] args) {
        String str1 = "aba";
        int sec = str1.length();
        for(int i = 0; i<sec;i++)
        {
            for(int j=0; j<=i;j++)
            {
            System.out.print(str1.charAt(j));
        }
        System.out.println();
    }

    
    String se1 = "";
     for(int i  = sec-1;i<0;i--)
     {
        se1 = se1+ str1.charAt(i);
     }
     if(se1.toLowerCase().equals(str1))
     {
        System.out.println("Is A palindrome" + se1);
     }
     else{
        System.out.println("Not a palindrome ");
     }
}

    public static void forName(String string) {
    }
}
