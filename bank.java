class A{
    static String acc ="0827CI221075";
    static int am = 9000;
    public static void withdraw(String s ,int n){
        
        if(am==0){
            System.out.println("Account Empty");
        }
        else{
            am-=n;
            System.out.println("Amount"+am);
        }
    }
    
    public static void deposite(String s ,int n){
        
            am+=n;
            System.out.println("Amount"+am);
        }
    
}

class B extends Thread{
    public void run(){
        System.out.println("Withdrawing :");
        A.withdraw("0827CI221075",8000);
        
    }
}

class C extends Thread{
    public void run(){
        System.out.println("Depositing :");
         A.deposite("0827CI221075",8000);
    }
}
public class Main
{
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		b.start();
		c.start();
	}
}
