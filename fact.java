#22
import java.util.*;
public class Prog8{
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        System.out.print("Enter any number:  ");
        int n=r.nextInt();
        int t=1;
        for(int i=1;i<=n;i++){
            t*=i;
        }
        System.out.print("The factorial of number entered is "+t);
    }
}