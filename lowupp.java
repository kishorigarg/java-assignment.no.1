import java.util.*;    
public class Example
 {
 	public static void main(String[] args) 
 	{
 	    String name="kishori garg";
 	   System.out.println(name);
 	    Scanner sc=new Scanner(System.in);
 	     System.out.println("enter the choice 0/1");
 	     int choice=sc.nextInt();
 	    switch(choice)
 	    {
 	        case 0:
 	            
 	            System.out.println(name.toLowerCase());
 	            break;
 	        case 1:
 	            System.out.println(name.toUpperCase());
 	            break;
 	            default:
 	            System.out.println("no case");
 	            break;
 	    }
 	}}
