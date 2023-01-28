public class Lab2 extends Thread {
   
    public void run()
    {
      for(int i=1;i<=100;i++)
      {
        if(i%7 ==0 && i%11==0)
        {
            System.out.println("2nd Thread Running..."+ i);
        }
      }
    }
    
}
class java extends Thread{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            if(i%5==0 || i%13==0)
            {
                System.out.println("1st Thread Running..."+i);
            }
        }
    }
}
class define{
    public static void main(String[] args) {
        Lab2 t1 = new Lab2();
        java t2 = new java();
        t1.start();

        t2.start();
    }
}