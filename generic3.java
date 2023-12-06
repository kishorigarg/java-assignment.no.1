class Main{
    public static void main(String[] args){
        GenericsClass<Integer>intObj=new GenericsClass<>(5);
        System.out.println("Generic Class returns:"+intObj.returnTheData());
        GenericsClass<String> stringObj=new GenericsClass("Java Programming");
          System.out.println("Generic Class returns:"+stringObj.returnTheData());
    }
    
}
class GenericsClass<T>{
    private T data;
    public GenericsClass(T data){
        this.data=data;
        
    }
     public T returnTheData(){
         return this.data;
     }
}