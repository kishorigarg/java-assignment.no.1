public class Main{
    public <E> void printArray(E []s,E key){
        for(int i=0;i<s.length;i++){
            if(key==s[i]){
                System.out.println("the index of the element is:"+i);
            }
        }
    }
    public static void main(String[] args){
        Main m = new Main();
        String []s1 = {"john","om"};
        m.<String>printArray(s1,"Om");
        Integer[]i={1,2,3,4};
        m.<Integer>printArray(i,4);
   }
}