import.java.util.Scanner;
public class Test
{
    public static void main(string[]args){
        Scanner sc=new Scanner(System.in);
        try{
            int n=integer.parseint(scn.nextInt());
            if(99%n==0)
            System.out.println(n+" Is a factor of  99");
        }
        catch(ArithmeticException ex)
    {
        System.out.println("Arithmetic"+ex);
        
        
    }
    catch(NumberformatException ex)
    { System.out.println("Number format Exception"+ex);
            
            
    }
        }
    }
