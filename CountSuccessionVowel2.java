import java.util.Scanner;

class CountSuccessionVowel2
{
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String s = r.nextLine();
        r.close();
        int count=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(Character.toLowerCase(s.charAt(i))=='a' || Character.toLowerCase(s.charAt(i))=='e' 
            || Character.toLowerCase(s.charAt(i))=='i' || Character.toLowerCase(s.charAt(i))=='o'||
             Character.toLowerCase(s.charAt(i))=='u')
            {
                if(Character.toLowerCase(s.charAt(i+1))=='a' ||
                 Character.toLowerCase(s.charAt(i+1))=='e' ||
                  Character.toLowerCase(s.charAt(i+1))=='i' || 
                  Character.toLowerCase(s.charAt(i+1))=='o'||
                   Character.toLowerCase(s.charAt(i+1))=='u')
                {
                    count++;
                    i=i+1;
                }
            }
        }
        System.out.println(count);
    }

}