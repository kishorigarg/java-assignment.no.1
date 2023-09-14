#3
class Calculator
import java.util.*;
class Calculator
{   
    private int i;
    private int j;
@@ -25,11 +26,19 @@ public void sub(){
    }
    public void mult(){
        System.out.println("The multiplication of number assessed is "+(i*j));
    }
    public void div(){
        System.out.println("The division of number assessed is "+(i/j));
    }
        public static void main(String[] args){
            Calculator c=new Calculator(3,4);
            System.out.print("Enter any two operands:   ");
            Scanner r=new Scanner(System.in);
            int n1=r.nextInt();
            int n2=r.nextInt();
            Calculator c=new Calculator(n1,n2);
            c.add();
            c.sub();
            c.mult();
            c.div();
        }    
    }