//implemention using  inheritance thread class
public class Main extends Thread{
    public static void main(String[]args){
        Main thread=new Main();
    thread.start();
System.out.println("This code is outside of the thread");
}
        public void run(){
            System.out.println("This cod eis running in a thread");
        }
    }
