//crate a generic class search array element key 
//2nd class create object and call
public class Search<E>{
    public void printArray(E []s,E key){
        for(int i=0;i<s.length;i++){
            if(key==s[i]){
                System.out.println("the index of element is:"+i);
            }
        }
    }
    public static void main(String[] args){
        Search<Integer> m = new Search<Integer>();
        Integer []i = {1,2,3,4};
        m.<Integer>printArray(i,4);
        Search<String> m1 = new Search<String>();
        String []s1 = {"john","om"};
        m1.<String>printArray(s1,"om");
        }
}