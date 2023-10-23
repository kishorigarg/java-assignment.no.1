public class Arr
{
    public static void main(String[] args)
    {
       int a[]={10, 30, 2, 5, 6, 7};
       int sum=0;
       double avg=0;
       
       for(int i:a)
       {
           sum+=i;
       }
       avg=sum/a.length;
       System.out.println("Sumn: "+sum);
       System.out.println("Average: "+avg);
    }
}

