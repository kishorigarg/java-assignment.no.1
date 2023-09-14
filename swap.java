#17
import java.util.*;
class Prog3{
    public static void main(String[] args){
        System.out.print("Enter two numbers:   ");
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        System.out.println("Our 1st number is "+n1);
        int n2=s.nextInt();
        System.out.println("Our 2nd number is "+n2);
        int a;
        a=n1;
        n1=n2;
        n2=a;
        System.out.println("The number after swapping are \nThe first number "+n1+"\nThe second number "+n2);
        
    }
}