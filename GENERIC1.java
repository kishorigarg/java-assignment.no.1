class main{
    public static void main(String args[]){
        CallingClass call = new CallingClass();
        call.<String>genericsMethod("429 and 45454 are nelan's lucky numbers");
        call.<Integer>genericsMethod(25);
      
    }
}
class CallingClass{
    public <T> void genericsMethod(T data){
        System.out.println("Generics Method:");
        System.out.println("Data Passed In :"+data);
    }
    
    
    
    
    
}