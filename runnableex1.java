//implemention using  inheritance thread class
public class Main implements runnable{
    public static void main(String[]args){
        Main obj =new Main();
        Thread thread=new Thread(obj);
    Thread.start();
System.out.println("This code is outside of the thread");
}
        public void run(){
            System.out.println("This cod eis running in a thread");
        }
    }
