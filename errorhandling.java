package errorhanding;
public class errorChecking {
    public static voidmain (String []args){
        try {
            int x = 10;
            int y = 0;
            int z = x/y;
            System.out.println(z);
        }
        catch(Exception err){
            System.out.pringln(err.println(err.getMassage));
      }
    }
}