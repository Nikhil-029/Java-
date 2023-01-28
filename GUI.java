import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
class mf extends JFrame implements ActionListener{  
    private TextField tf1,tf2,tf3,tf4; 
    private Container c;
    JLabel label1,label2,label3,result; 
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
   mf(){ 
      setTitle("Simple Calculator");
      setSize(300,350);

      c = getContentPane();
      c.setLayout(new GridLayout(8,2));
      label1 = new JLabel("  First Number :");
      c.add(label1);

      tf1 = new TextField();
      c.add(tf1);

      label2 = new JLabel("  Second Number :");
      c.add(label2);
      tf2 = new TextField();
      c.add(tf2);

      label3 = new JLabel("  Power Value :");
      c.add(label3);
      tf4 = new TextField();
      c.add(tf4);
        
      result = new JLabel("  Result: ");
      c.add(result);
      tf3 = new TextField("gggg");
      c.add(tf3);
      b1 = new JButton("ADD");
      c.add(b1);
      b2 = new JButton("SUB");
      c.add(b2);
      b3 = new JButton("MUL");
      c.add(b3);
      b4 = new JButton("DIV");
      c.add(b4);
      b5=new JButton("SQUARE");
      b6=new JButton("CUBE");
      b7=new JButton("POWER");
      b8=new JButton("ROOT");
      c.add(b5);
      c.add(b6);
      c.add(b7);
      c.add(b8);
     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
     b5.addActionListener(this);
     b6.addActionListener(this);
     b7.addActionListener(this);
     b8.addActionListener(this);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);

    }
@Override
public void actionPerformed(ActionEvent e) {
  try{
    if(e.getSource()==b1)
   {
       double a = Double.parseDouble(tf1.getText());
       double b = Double.parseDouble(tf2.getText());
       double c = a+b;
       
       tf3.setText(""+c);
   }
   else if(e.getSource()==b2)
   {
    double a = Double.parseDouble(tf1.getText());
    double b = Double.parseDouble(tf2.getText());
       double c = a -b;
       tf3.setText(""+c);
   }
   else if(e.getSource()==b3)
   {
    double a = Double.parseDouble(tf1.getText());
    double b = Double.parseDouble(tf2.getText());
       double c = a *b;
       tf3.setText(""+c);
   }
   else if(e.getSource()==b4)
   {
    double a = Double.parseDouble(tf1.getText());
    double b = Double.parseDouble(tf2.getText());
       double c = a/b;  
       tf3.setText(""+c);
   }
   else if(e.getSource()==b5)
   {
    double a = Double.parseDouble(tf1.getText());
    //double b = Double.parseDouble(tf2.getText());
       double c = a*a;  
       tf3.setText(""+c);
   }
   else if(e.getSource()==b6)
   {
    double a = Double.parseDouble(tf1.getText());
    //double b = Double.parseDouble(tf2.getText());
       double c= a*a*a;  
       tf3.setText(""+c);
   }
   else if(e.getSource()==b7)
   {
    double a = Double.parseDouble(tf1.getText());
    double b = Double.parseDouble(tf4.getText());
       double c = Math.pow(a, b);  
       tf3.setText(""+c);
   }
   else if(e.getSource()==b8)
   {
    double a = Double.parseDouble(tf1.getText());
    //double b = Double.parseDouble(tf2.getText());
        double c = Math.sqrt(a);  
       tf3.setText(""+c);
   }
   }
   catch(Exception e1)
{
      tf3.setText("Invalid Input");
   }
}
    
}
class GUI {
    public static void main(String[] args) {
        mf frame = new mf();
    }
}