#9
import java.util.*;
public class Prog11{
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Ënter 1st no.:  ");
        int n1=r.nextInt();
        System.out.print("Ënter 2nd no.:  ");
        int n2=r.nextInt();
        int gcd=1;
        for(int i=1;i<=n1 && i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        System.out.println("GCD of "+n1+" and "+n2+"is "+gcd);
}

}
