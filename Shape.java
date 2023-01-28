// import java.util.*;

// public abstract class Shape {
//     public void printme()
//     {
//         System.out.println("I am Shape ");
//     }
//     public abstract double computeArea();
// }
 
//  public class Circle extends Shape {
//     private double rad = 5;
//     public void printme ()
//     {
//         System.out.println("I am Circle ");
//     }
//     public double computeArea()
//     {
//         return rad*rad*3.15;
//     }
//  }

//  public class Ambiguous extends Shape{
//     private double area = 10;
//     public double computeArea()
//     {
//         return area;
//     }
//  }

//  public class IntroductionOverriding {
//     public static void main(String[] args)
//     {
//         Shape[] shapes =  new Shape[2];
//         Circle circle = new Circle();
//         Ambiguous ambiguous = new Ambiguous();

//         shapes[0] = circle;
//         shapes[1] = ambiguous;

//         for(Shape s : shapes)
//         {
//             s.printme();
//             System.out.println(S.computeArea);
//         }
//     }
//  }