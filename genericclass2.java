//generic class
class  MyData <E>{
    E i;
    public void set(E i1){
        i=i1;
    }
    public E get(){
        return (i);
    }
}
public class Example{
    public static void main(String[] args){
        MyData<Integer> m1 = new MyData<Integer>();
        MyData<String> m2=new MyData<String>();
        Integer i1 = 3;
        m1.set(i1);
       System.out.println(m1.get());
      
       String s="Hello";
       m2.set(s);
       System.out.println(m2.get());
}
}