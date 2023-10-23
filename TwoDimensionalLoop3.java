import java.util.*;
public class TwodimensionalLoop{
    	public static void main(String[] args) 
{
    int [][] board=new int[3][3];
    int i,j;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter array elements");
   for(i=0;i<board.length;i++)
   {
       for(j=0;j<board[i].length;j++){
       board[i][j]=sc.nextInt();
   }
   }
  System.out.println(Arrays.deepToString(board));
  }
}