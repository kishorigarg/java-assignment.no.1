
public class Prog15{ 
    static int x;
    private static int x;
    Prog15(int i){ //setter
        x=i;
        this.x=i;
    }
    public static void get(){ //Getter
        System.out.println(x);
    }