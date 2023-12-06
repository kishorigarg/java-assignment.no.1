class main{
    public static void main(String args[]){
        CallingClass call = new CallingClass();
        call.<String,Integer>genericsMethod("429 and 45454 are nelan's lucky numbers,5");
        call.<Integer>genericsMethod(25);
        call.<Boolean>genericsMethod(true);
    }
}
class CallingClass{
    public <T> void genericsMethod(T data){
        System.out.println("Generics Method:");
        System.out.println("Data Passed In :"+data);
    }
    
    
    
    
    
}