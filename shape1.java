// import javax.xml.transform.Source;

abstract class shape{
    abstract float area(int x,int y);
}
class react extends shape1{
    int x, y;
 
    int  area(int x,int y)
    {
      
    return x*y;
    }
    void display()
    {
       int a = area(10,11);
       System.out.println(" " + a);
    }

}
public class shape1{
    public static void main(String[] args) {
        react r1 = new react();
        r1.display();
    }

}