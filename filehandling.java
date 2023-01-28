import java.io.*;
class Filehandling
{
public static void main(String args[]) throws IOException
{
File f = new File("C:\\Users\\rv178\\OneDrive\\Desktop\\JAVA\\file1.txt");
FileWriter fw = new FileWriter(f);
int i = 0;
String s = "I am passing this string to file";
char ch[] = s.toCharArray();
for(i=0;i<s.length();i++)
{
fw.write(ch[i]);
byte b = (byte)ch[i];
System.out.println(b);
}

fw.write("/n Hello World");
fw.close();
}



}



