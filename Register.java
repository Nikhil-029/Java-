import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class mf extends JFrame implements ActionListener{  
    private TextField tf1,tf2,tf3; 
    private Container c;
    JLabel label1,label2, result; 
    JButton b1,b2,b3,b4  ;
   mf(){ 
      setTitle("Simple Calculator");
      setSize(500,500);
      //setLocation(100,100);
     // setDefaultCloseOperation(EXIT_ON_CLOSE);

      c = getContentPane();
      c.setLayout(null);
      label1 = new JLabel("First Number :");
      label1.setBounds(10,20,100,20);
      c.add(label1);

      tf1 = new TextField();
      tf1.setBounds(120, 20, 100, 20);
      c.add(tf1);

      label2 = new JLabel("Second Number :");
      label2.setBounds(10,50,100,20);
      c.add(label2);
      tf2 = new TextField();
      tf2.setBounds(120, 50, 100, 20);
      c.add(tf2);

class Register {
    public static void main(String[] args) {
        mf frae = new mf();
    }
   
}
   }
}
