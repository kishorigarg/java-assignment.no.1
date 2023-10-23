import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
public class Arr
{
    public static void main(String[]  args)
    {
       String a[]={"dog", "cat", "man"};
       System.out.println("Enter Element: ");
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       
       for(int i=0; i<a.length; i++)
       {
           if(s.equals(a[i]))
           {
               System.out.println(i);
           }
       }
    }
    
}