public class TestThrow{
    public static void checkNum(int num){
        if(num<1){
            throw new ArithmeticException("\nNumber is negative ,cannot calculate square");
            
        }
        else{System.out.println("Sqquare of"+num+"is"+(num*num));
        
    }
}
public static void main(String[]args){
    TestThrow obj=new TestThrow();
    obj.checkNum(-3);
    System.out.println("Rest of  the code.");
}}