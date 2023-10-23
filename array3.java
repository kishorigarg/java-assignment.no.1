import java.util.Scanner;
import java.util.Arrays;
public class Arr
{
    public static void main(String[]  args)
    {
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Elements: ");
        for(int i=0; i<a.length; i++)
        {
            a[i]=sc.nextInt();
        }
        
        System.out.println("The entered Elements: ");
        for(int j=0; j<a.length; j++)
        {
            System.out.println(a[j]+ " ");
        }
    }
}