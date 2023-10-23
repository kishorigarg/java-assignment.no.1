import java.util.Arrays;
import java.util.Scanner;
public class Arr
{
    public static void main(String[] args)
    {
       int a[]={10, 30, 2, 5, 6, 7};
       String s[]={"dog", "rat", "cat", "man"};
       
       System.out.println("Unsorted int array: " +Arrays.toString(a));
       Arrays.sort(a);
       System.out.println("Sorted int array: "+Arrays.toString(a));
       
       System.out.println("Unsorted string array: " +Arrays.toString(s));
       Arrays.sort(s);
       System.out.println("Sorted string array: " +Arrays.toString(s));
}