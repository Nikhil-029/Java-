
class Save{
    volatile int integer;
    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }
}

class Increment extends Thread{
    private Save save;
    public Increment(Save save){
        this.save = save;
    }

    public void run(){
        int temp = save.getInteger();
        for(int i= 0;i<10;i++){
            temp = temp+1;
            save.setInteger(temp);
        }
    }
}


class Display extends Thread{
    private Save save;
    public Display(Save save){
        this.save = save;
    }

    public void run(){
        int temp = save.getInteger();
        for(int i= 0;i<10;i++){
            temp = temp+1;
            System.out.println(temp);
        }
    }
}
        
public class Thread_Assign {
    public static void main(String[] args) {
        Save save = new Save();
        save.setInteger(10);
        Increment increment = new Increment(save);
        increment.start();
        Display display = new Display(save);
        display.start();
    }
}
