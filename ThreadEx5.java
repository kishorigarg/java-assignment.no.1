public class ThreadEx5 implements Runnable
{ public void run(){
    try{
        Thread.sleep(1500);
        System.out.println("Inside of thread");
    }
    catch(Exception e){
        System.out.println("Exception"+e);
        
    }
}
public static void main(String[]args){
    for(int i=0;i<10;i++){
        Threadt1=new Thread(new ThreadEx5());
        t1.start();
    }
    System.out.println("Outside of Thread");
}
}    
    
