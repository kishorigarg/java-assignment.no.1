public class TwodimensionalLoop{
    	public static void main(String[] args) 
{
    int [] board={1,2,3,4,5};
    int i,j,sum=0;
    double avg;
   System.out.println("Enter array elements");
   for(i=0;i<board.length;i++)
   {
       sum+=board[i];
   }
   avg=sum/board.length;
   
  System.out.println("Sum is"+sum);
   System.out.println("Avg is"+avg);
}
}